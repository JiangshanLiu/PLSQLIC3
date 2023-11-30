package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.FunctionInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextReturned;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.aux_ctrl_col;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.if_sql_debug;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil.sql_debug_counter;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.NODE_GOTO;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.NODE_RETURN;

public class TrampolineCallSsaNode extends AbstractSsaNode {
    public static class ListThreadLocal extends ThreadLocal<ArrayList<String>> {
        @Override
        protected ArrayList<String> initialValue() {
            return new ArrayList<>();
        }
    }

    public static ThreadLocal<String> trpl_func_name = new ThreadLocal<>();
    public static ListThreadLocal trpl_args_name = new ListThreadLocal();
    ArrayList<String> trpl_args_call;

    public TrampolineCallSsaNode(AbstractSsaNode asn, LinkedHashMap<Label, FunctionAnfNode> anf_funcs, FunctionInfo func_info) {
        setNode_type(SsaNodeType.NODE_TRAMPLINECALL);
        trpl_args_call = new ArrayList<>();
        for (int i = 0; i < trpl_args_name.get().size(); i++) {
            trpl_args_call.add(null);
        }
        if (asn.getNode_type() == NODE_GOTO) {
            for (String str : trpl_args_name.get()) {
                if (str.equals(aux_ctrl_col[0])) {
                    // aux_ctrl_col "rec?"
                    setArguments(str, "True");
                } else if (str.equals(aux_ctrl_col[1])) {
                    // aux_ctrl_col "call"
                    Label goto_label = ((GotoSsaNode) asn).goto_label;
                    setArguments(aux_ctrl_col[1], "'" + anf_funcs.get(goto_label).anf_func_name + "'");
                } else if (str.equals(aux_ctrl_col[2])) {
                    // aux_ctrl_col "res"
                    setArguments(str, "NULL::" + func_info.return_type.getText());
                } else {
                    if (if_sql_debug && aux_ctrl_col.length == 4 && str.equals(aux_ctrl_col[3])) {
                        // aux_ctrl_col "debug"
                        setArguments(str, String.valueOf(sql_debug_counter.get()));
                        sql_debug_counter.set(sql_debug_counter.get() + 1);
                    } else {
                        // vars in PL function
                        // bug here
                        // temp patch
                        // SQL identifier ignores case
                        // str in trpl_args_name all lowercase
                        // identifier in global_arg_index all capital letter
//                        if (((GotoSsaNode) asn).global_arg_index.containsKey(str)) {
//                            setArguments(str, ((GotoSsaNode) asn).global_arg_index.get(str).getText());
//                        } else {
//                            setArguments(str, str);
//                        }
                        boolean flag = true;
                        for (String id_str : ((GotoSsaNode) asn).global_arg_index.keySet()) {
                            if (id_str.equalsIgnoreCase(str)) {
                                setArguments(str, ((GotoSsaNode) asn).global_arg_index.get(id_str).getText());
                                flag = false;
                            }
                        }
                        if (flag) {
                            setArguments(str, str);
                        }
                    }
                }
            }
            // some args not in args_in may set NULL, and cannot get it forever, so should set all args
//            for (String str : anf_funcs.get(goto_label).args_in) {
//                setArguments(str, str);
//            }
        } else if (asn.getNode_type() == NODE_RETURN) {
            for (String str : trpl_args_name.get()) {
                if (str.equals(aux_ctrl_col[0])) {
                    // aux_ctrl_col "rec?"
                    setArguments(str, "False");
                } else if (str.equals(aux_ctrl_col[1])) {
                    // aux_ctrl_col "call"
                    setArguments(str, "NULL::text");
                } else if (str.equals(aux_ctrl_col[2])) {
                    // aux_ctrl_col "res"
                    if (((ReturnSsaNode) asn).has_ret_value) {
                        if (((ReturnSsaNode) asn).global_arg_index.containsKey(str)) {
                            setArguments(str, (((ReturnSsaNode) asn).ret_expr.getText()));
                        } else {
                            setArguments(str, getFullTextReturned(((ReturnSsaNode) asn).ret_expr,
                                    ((ReturnSsaNode) asn).global_arg_index));
                        }
                    } else {
                        setArguments(str, "NULL");
                    }
                } else {
                    if (if_sql_debug && aux_ctrl_col.length == 4 && str.equals(aux_ctrl_col[3])) {
                        // aux_ctrl_col "debug"
                        setArguments(str, String.valueOf(sql_debug_counter.get()));
                        sql_debug_counter.set(sql_debug_counter.get() + 1);
                    } else {
                        // vars in PL function
                        setArguments(str, "NULL::" + getFullTextByChildren(func_info.id_type_pair.get(str)));
                    }
                }
            }
        }
    }

    private void setArguments(String arg_name, String arg_value) {
        trpl_args_call.set(trpl_args_name.get().indexOf(arg_name), arg_value);
    }

    public String getArgValue(String arg_name) {
        return trpl_args_call.get(trpl_args_name.get().indexOf(arg_name));
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(trpl_func_name.get()).append("(");
        for (String arg_str : trpl_args_call) {
            if (arg_str != null) {
                sb.append(arg_str).append(",");
            } else {
                sb.append("┴").append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")\n");
        return sb.toString();
    }
}
