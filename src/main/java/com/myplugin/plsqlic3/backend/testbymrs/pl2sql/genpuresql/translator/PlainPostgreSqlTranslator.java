package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator;

import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IfelseSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.TrampolineCallSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.FunctionInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.*;
import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.aux_ctrl_col;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.NODE_ASSIGN;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.ASSIGN_EXPR;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.ASSIGN_SQL;

public class PlainPostgreSqlTranslator extends PlainAbstractSqlTranslator {
    public PlainPostgreSqlTranslator(TrampolinedAnfUtil trpl_anf_util) {
        super(trpl_anf_util);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("WITH RECURSIVE run(");
        for (String arg_str : trpl_anf_util.tramp_func.anf_func_args) {
            sb.append(arg_str).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(String.format(") AS (\n(%s)\n\t\tUNION ALL\n\tSELECT result.*\n\tFROM run,\n\tLATERAL (\n",
                blockToSqlString(trpl_anf_util.start_func.block, true, new HashSet<>())
        ));
        // b1 to bn
        ArrayList<Label> union_list = new ArrayList<>(trpl_anf_util.anf_funcs.keySet());
        if (union_list.size() > 2) {
            union_list.remove(0);
        }
        union_list.remove(union_list.size() - 1);
        boolean first_label = true;
        for (Label label : union_list) {
            sb.append(String.format("\n%s(%s\nWHERE run.%s = '%s')\n\n",
                    first_label ? "" : "UNION ALL\n",
                    blockToSqlString(trpl_anf_util.anf_funcs.get(label).block, false, new HashSet<>()),
                    aux_ctrl_col[1],
                    trpl_anf_util.anf_funcs.get(label).anf_func_name
            ));
            first_label = false;
        }
        sb.append(String.format("\t)AS result\n\tWHERE run.%s\n)\nSELECT run.%s AS %s FROM run WHERE NOT run.%s;",
                aux_ctrl_col[0],
                aux_ctrl_col[2],
                trpl_anf_util.func_info.function_name,
                aux_ctrl_col[0]));
        return sb.toString();
    }

    private SqlIdMap<String, String> getArgVals(FunctionInfo func_info) {
        SqlIdMap<String, String> arg_vals = new SqlIdMap<>();
        for (TerminalNode tn : func_info.function_args) {
            arg_vals.put(tn.getText(), getRandom(func_info.id_type_pair.get(tn.getSymbol().toString())));
        }
        return arg_vals;
    }

    protected String blockToSqlString(ArrayList<AbstractSsaNode> block, boolean if_first_block, HashSet<String> block_present_vars) {
        HashSet<String> block_present_vars_rec = new HashSet<>(block_present_vars);
        StringBuffer sb = new StringBuffer();
        AbstractSsaNode.SsaNodeType last_type = null;
        ArrayList<String> init_args_in_first_block = new ArrayList<>();
        String STX = new String(new byte[]{0x02}, StandardCharsets.UTF_8);
        String ETX = new String(new byte[]{0x03}, StandardCharsets.UTF_8);
        for (AbstractSsaNode asn : block) {
            switch (asn.getNode_type()) {
                case NODE_ASSIGN:
                    if (if_first_block) {
                        init_args_in_first_block.add(getIdName(((AssignSsaNode) asn).identifier));
                    }
                    PostgreSQLParser.TypenameContext id_type = (PostgreSQLParser.TypenameContext) trpl_anf_util.func_info.id_type_pair.get(getIdName(((AssignSsaNode) asn).identifier));
                    String str_let = String.format("LEFT JOIN LATERAL (%s(%s)%s) AS let_%s(%s) ON True\n",
                            ((AssignSsaNode) asn).assign_type == ASSIGN_SQL ? "" : "SELECT ",
                            getFullTextSelected(((AssignSsaNode) asn).expression, trpl_anf_util.func_info.id_type_pair, block_present_vars_rec),
//                            !((AssignSsaNode) asn).expr_sql || ifTypeBasic(id_type, type) ? "" : "::" + id_type.getText(),
                            ((AssignSsaNode) asn).assign_type == ASSIGN_EXPR ? "::" + getFullTextByChildren(id_type) : "",
                            ((AssignSsaNode) asn).identifier.getText().replace(",", "_"),
                            ((AssignSsaNode) asn).identifier.getText()
                    );
                    sb.append(str_let);
                    block_present_vars_rec.add(getIdName(((AssignSsaNode) asn).identifier));
                    break;

                case NODE_IFELSE:
                    if (if_first_block) {
                        StringBuffer arg_lat_list_sb = new StringBuffer();
                        for (TerminalNode tn : trpl_anf_util.func_info.function_args) {
                            String arg = tn.getSymbol().toString();
                            PostgreSQLParser.TypenameContext id_type_in_first = (PostgreSQLParser.TypenameContext) trpl_anf_util.func_info.id_type_pair.get(tn.getSymbol().getText());
                            arg_lat_list_sb.append(String.format("LEFT JOIN LATERAL (SELECT %s) AS let_%s(%s) ON True\n",
                                    STX + arg + ETX + "::" + getFullTextByChildren(id_type_in_first),
                                    arg,
                                    arg
                            ));
                        }
                        sb.insert(0, String.format("SELECT if_%s.* FROM\nLATERAL (select NULL) as tmp_tab(tmp_tab_col)\n%s",
                                ((IfelseSsaNode) asn).condition.getText(),
                                arg_lat_list_sb
                        ));
                    } else {
                        sb.insert(0, "SELECT if_" + ((IfelseSsaNode) asn).condition.getText() + ".* FROM\nLATERAL (select NULL) as tmp_tab(tmp_tab_col)\n");
                    }
                    String str_cond = String.format("%s(%s\nWHERE %s\n\tUNION ALL\n%s\nWHERE NOT %s OR %s IS NULL\n)AS if_%s",
                            last_type == NODE_ASSIGN ? ",\nLATERAL" : "",
                            blockToSqlString(((IfelseSsaNode) asn).then_block, if_first_block, block_present_vars_rec),
                            ((IfelseSsaNode) asn).condition.getText(),
                            blockToSqlString(((IfelseSsaNode) asn).else_block, if_first_block, block_present_vars_rec),
                            ((IfelseSsaNode) asn).condition.getText(),
                            ((IfelseSsaNode) asn).condition.getText(),
                            ((IfelseSsaNode) asn).condition.getText()
                    );
                    sb.append(str_cond);
                    break;

                case NODE_TRAMPLINECALL:
                    StringBuffer sb_call = new StringBuffer();
                    // write SELECT keyword
                    sb_call.append("\nSELECT ");
                    // write all vars that insert into run() table
                    for (String arg_name : trpl_anf_util.tramp_func.anf_func_args) {
                        String arg_value = ((TrampolineCallSsaNode) asn).getArgValue(arg_name);
                        // Display the specified return value type
                        // to deal with difference between PL/SQL return type and data default type
                        if (arg_name.equals(aux_ctrl_col[2])) {
                            arg_value = "(" + arg_value + ")::" + getFullTextByChildren(trpl_anf_util.func_info.return_type);
                        }
                        sb_call.append(String.format("%s, ",
                                arg_value == null ? "NULL" : arg_value
                        ));
                    }
                    sb_call.delete(sb_call.length() - 2, sb_call.length());
                    // write FROM keyword
                    sb_call.append(String.format("%s",
                            (last_type == NODE_ASSIGN) || (if_first_block && trpl_anf_util.tramp_func.anf_func_args.size() != init_args_in_first_block.size()) ?
                                    " FROM\nLATERAL (select NULL) as tmp_tab(tmp_tab_col)\n" : "\n"
                    ));
                    // set NULL::vartype to vars that not have updated value in this block
                    if (if_first_block) {
                        init_args_in_first_block.addAll(List.of(aux_ctrl_col));
                        if (if_trmpl_in_ifelse) {
                            for (TerminalNode tn : trpl_anf_util.func_info.function_args) {
                                init_args_in_first_block.add(tn.getSymbol().toString());
                            }
                        }
                        for (String str : trpl_anf_util.tramp_func.anf_func_args) {
                            if (!init_args_in_first_block.contains(str)) {
                                HashSet<String> function_args_set = new HashSet<>();
                                for (TerminalNode tn : trpl_anf_util.func_info.function_args) {
                                    function_args_set.add(tn.getText().toLowerCase());
                                }
                                PostgreSQLParser.TypenameContext id_type_in_first = (PostgreSQLParser.TypenameContext) trpl_anf_util.func_info.id_type_pair.get(str);
                                sb_call.append(String.format("LEFT JOIN LATERAL (SELECT %s%s) AS let_%s(%s) ON True\n",
                                        function_args_set.contains(str) ? STX + str + ETX : "NULL",
                                        "::" + getFullTextByChildren(id_type_in_first),
                                        str,
                                        str
                                ));
                            }
                        }
                    }
                    sb.insert(0, sb_call);
                    break;

                default:
                    break;
            }
            last_type = asn.getNode_type();
        }
        return sb.toString();
    }
}
