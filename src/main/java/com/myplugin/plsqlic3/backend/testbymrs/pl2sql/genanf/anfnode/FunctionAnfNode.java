package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.*;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.util.*;

import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode.args_type.*;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.Identifier;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode.args_type.*;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.*;

public class FunctionAnfNode {
    public static class SetThreadLocal extends ThreadLocal<SqlIdMap<String, Integer>> {
        @Override
        protected SqlIdMap<String, Integer> initialValue() {
            return new SqlIdMap<>();
        }

        private void setTerminalNodeIndex(TerminalNode tn, int index) {
            PlSqlToken plsql_token = new PlSqlToken(tn.getSymbol());
            plsql_token.ssa_index = index;
            ((TerminalNodeImpl) tn).symbol = plsql_token;
        }

        public void updateArg(TerminalNode tn) {
            if (this.get().containsKey(tn.getSymbol().getText())) {
                try {
                    this.get().compute(tn.getSymbol().getText(), (key, value) -> value + 1);
                } catch (NullPointerException ignore) {
                    this.get().compute(tn.getSymbol().getText(), (key, value) -> 0);
                }
            } else {
                this.get().put(tn.getText(), 0);
            }
            setTerminalNodeIndex(tn, this.get().get(tn.getSymbol().getText()));
        }

        public void addVar(TerminalNode tn) {
            if (!this.get().containsKey(tn.getSymbol().getText())) {
                this.get().put(tn.getText(), null);
            }
        }
    }

    enum args_type {
        ARGS_TYPE_UPDATE,
        ARGS_TYPE_CITE,
        ARGS_TYPE_IN,
        ARGS_TYPE_RETURN
    }

    public String anf_func_name;
    public ArrayList<AbstractSsaNode> block;
    LinkedHashMap<Label, FunctionAnfNode> anf_funcs;

    // a static Set, the record of vars defined in all the functions
    // it contains vars in arg list and declare block
    public static SetThreadLocal pl_all_vars = new SetThreadLocal();

    // arg list move into this ANF function, namely formal parameters
    public LinkedHashSet<String> anf_func_args = new LinkedHashSet<>();

    // Map of var and var with SSA index in this function
    SqlIdMap<String, TerminalNode> latest_ssa_var = new SqlIdMap<>();

    public FunctionAnfNode(Label label, ArrayList<AbstractSsaNode> block, LinkedHashMap<Label, FunctionAnfNode> anf_funcs) {
        this.anf_func_name = "L_" + label + "_" + label.label_comment;
        this.block = block;
        this.anf_funcs = anf_funcs;
        if (!label.label_comment.equals("trampoline")) {
            //if not trampoline function, get args by algorithm
            SqlIdMap<String, TerminalNode> updated_vars_map = new SqlIdMap<>();
            getDrectArgs(block, updated_vars_map);
        } else {
            //if trampoline function, get args by algorithm
            getTrampolineArgs();
        }
    }

    private void getTrampolineArgs() {
        ArrayList<Label> label_list = new ArrayList<>(this.anf_funcs.keySet());
        for (Label label : label_list) {
            anf_func_args.addAll(this.anf_funcs.get(label).anf_func_args);
        }
    }

    /* In paper, single static assignment(SSA) algorithm is performed with GOTO generation,
     * here, we give index to vars when changing GOTO to function call,
     * because this step we get blocks together to a function
     * and should distinguish same argument from different functions(blocks)
     * */

    // if-else block can have nested structure, so getVar() is recursive
    private void getDrectArgs(ArrayList<AbstractSsaNode> block, SqlIdMap<String, TerminalNode> updated_vars_map) {
        SqlIdMap<String, TerminalNode> updated_vars_map_rec = new SqlIdMap<>(updated_vars_map);
        // this Map is to record the identifier with updated SSA index in a block, not in a function
        // so we can add them into actual parameter list when GOTO or RETURN
        for (AbstractSsaNode asn : block) {
            if (asn.getNode_type() == NODE_ASSIGN) {
                getDirectArgsRec(((AssignSsaNode) asn).expression, ARGS_TYPE_CITE, updated_vars_map_rec);
                getDirectArgsRec(((AssignSsaNode) asn).identifier, ARGS_TYPE_UPDATE, updated_vars_map_rec);
            } else if (asn.getNode_type() == NODE_IFELSE) {
                getDirectArgsRec(((IfelseSsaNode) asn).condition, ARGS_TYPE_CITE, updated_vars_map_rec);
                getDrectArgs(((IfelseSsaNode) asn).then_block, updated_vars_map_rec);
                getDrectArgs(((IfelseSsaNode) asn).else_block, updated_vars_map_rec);
            } else if (asn.getNode_type() == NODE_RETURN) {
                if (((ReturnSsaNode) asn).has_ret_value) {
                    // bug here: RETURN NEXT
                    getDirectArgsRec(((ReturnSsaNode) asn).ret_expr, ARGS_TYPE_RETURN, updated_vars_map_rec);
                    // add them into actual parameter
                    ((ReturnSsaNode) asn).global_arg_index = new SqlIdMap<>(updated_vars_map_rec);
                }
            } else if (asn.getNode_type() == NODE_GOTO) {
                // add them into actual parameter
                ((GotoSsaNode) asn).global_arg_index = new SqlIdMap<>(updated_vars_map_rec);
            }
        }
    }

    // to find TerminalNode in a ParserRuleContext tree, so getVarRec() is recursive
    private void getDirectArgsRec(ParserRuleContext ctx, args_type type, SqlIdMap<String, TerminalNode> updated_vars_map_rec) {
        List<TerminalNode> id_list = null;
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                id_list = ctx.getTokens(Identifier);
                break;
            case ORACLE:
                break;
            default:
                break;
        }
        assert id_list != null;
        for (TerminalNode tn : id_list) {
            if (type == ARGS_TYPE_UPDATE) {
                pl_all_vars.updateArg(tn);
                latest_ssa_var.put(tn.getSymbol().toString(), tn);
                updated_vars_map_rec.put(tn.getSymbol().toString(), tn);
            } else if (type == ARGS_TYPE_CITE) {
                // var has been declared
                if (pl_all_vars.get().containsKey(tn.getSymbol().toString())) {
                    if (latest_ssa_var.containsKey(tn.getSymbol().toString())) {
                        // if use a var and update it already, change the CommomToken into PlSqlToken to record SSA index
                        ctx.children.add(ctx.children.indexOf(tn), latest_ssa_var.get(tn.getSymbol().toString()));
                        ctx.children.remove(tn);
                    } else {
                        // if use a var but have not update it, should get it by input args list
                        anf_func_args.add(tn.getSymbol().toString());
                    }
                }
                // var has not been declared, it may be a col name
            } else if (type == ARGS_TYPE_RETURN) {
                // var has been declared
                if (pl_all_vars.get().containsKey(tn.getSymbol().toString())) {
                    if (latest_ssa_var.containsKey(tn.getSymbol().toString())) {
                        // if use a var and update it already, change the CommomToken into PlSqlToken to record SSA index
                        ctx.children.add(ctx.children.indexOf(tn), latest_ssa_var.get(tn.getSymbol().toString()));
                        ctx.children.remove(tn);
                    } else {
                        // if use a var but have not update it, should get it by input args list
                        anf_func_args.add(tn.getSymbol().toString());
                    }
                }
                // var has not been declared, it may be a col name
            }
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof ParserRuleContext) {
                getDirectArgsRec((ParserRuleContext) ctx.getChild(i), type, updated_vars_map_rec);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(anf_func_name).append("(");
        if (anf_func_args.size() != 0) {
            for (String arg : anf_func_args) {
                sb.append(arg).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("):\n");
        sb.append(getBlockStringRec(new ArrayList<>(block)));
        return sb.toString();
    }

    private String appendPrefixToEachLine(String s) {
        String ret = "\t" + s.replaceAll("(\r\n|\n)", "$1" + "\t");
        return ret.substring(0, ret.length() - "\t".length());
    }

    private String getBlockStringRec(ArrayList<AbstractSsaNode> asn_list) {
        StringBuffer sb = new StringBuffer();
        if (asn_list.size() == 0) {
            sb.append("┴\n");
        } else {
            // visit all node from end to start to avoid frequently recursive function
            ListIterator<AbstractSsaNode> it = asn_list.listIterator(asn_list.size());
            while (it.hasPrevious()) {
                AbstractSsaNode asn = it.previous();
                if (asn.getNode_type() == NODE_ASSIGN) {
                    sb.replace(0, sb.length(), appendPrefixToEachLine(sb.toString()));
                    sb.insert(0, " IN\n")
                            .insert(0, asn.toString(), 0, asn.toString().length() - 1)
                            .insert(0, "LET ");
                } else if (asn.getNode_type() == NODE_IFELSE) {
                    sb.insert(0, appendPrefixToEachLine(getBlockStringRec(((IfelseSsaNode) asn).else_block)))
                            .insert(0, "ELSE\n")
                            .insert(0, appendPrefixToEachLine(getBlockStringRec(((IfelseSsaNode) asn).then_block)))
                            .insert(0, " THEN\n")
                            .insert(0, ((IfelseSsaNode) asn).condition.getText())
                            .insert(0, "IF ");
                } else if (asn.getNode_type() == NODE_GOTO) {
                    Label goto_label = ((GotoSsaNode) asn).goto_label;
                    sb.append("L_").append(goto_label).append("(");
                    if (anf_funcs.get(goto_label).anf_func_args.size() != 0) {
                        for (String arg : anf_funcs.get(goto_label).anf_func_args) {
                            sb.append(arg).append(",");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append(")\n");
                } else if (asn.getNode_type() == NODE_RETURN) {
                    sb.insert(0, ")\n")
                            .insert(0, ((ReturnSsaNode) asn).ret_expr.getText())
                            .insert(0, "(SELECT ");
                } else if (asn.getNode_type() == NODE_TRAMPLINECALL || asn.getNode_type() == NODE_TRAMPLINERETURN) {
                    sb.insert(0, asn);
                }
            }
        }
        return sb.toString();
    }
}
