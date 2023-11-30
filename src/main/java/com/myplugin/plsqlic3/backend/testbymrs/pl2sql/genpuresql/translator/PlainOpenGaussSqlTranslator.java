package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator;

import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IfelseSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.TrampolineCallSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.*;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.aux_ctrl_col;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.ASSIGN_EXPR;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.ASSIGN_SQL;

public class PlainOpenGaussSqlTranslator extends PlainAbstractSqlTranslator {
    private class TransposeMapList extends LinkedHashMap<String, ArrayList<String>> {
        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < trpl_anf_util.tramp_func.anf_func_args.size(); i++) {
                sb.append("CASE run.__AUX_CTRL_COL_CALL__\n");
                for (String lb : this.keySet()) {
                    sb.append(String.format("WHEN '%s' THEN\n%s\n",
                            lb,
                            this.get(lb).get(i)));

                }
                sb.append(String.format("END%s\n",
                        i == trpl_anf_util.tramp_func.anf_func_args.size() - 1 ? "" : ","));
            }
            return sb.toString();
        }
    }

    private class AccumulatedOptions {
        StringBuffer with_sql = new StringBuffer();
        ArrayList<String> acc_tables = new ArrayList<>();
    }

    TransposeMapList sqlstr_tramp = new TransposeMapList();

    public PlainOpenGaussSqlTranslator(TrampolinedAnfUtil trpl_anf_util) {
        super(trpl_anf_util);
        findBodyBlocks();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("WITH RECURSIVE run(");
        for (String arg_str : trpl_anf_util.tramp_func.anf_func_args) {
            sb.append(arg_str).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(String.format(") AS (\n(%s)\n\tUNION ALL\nSELECT\n%s\nFROM run WHERE run.%s\n)SELECT run.%s AS %s FROM run WHERE NOT run.%s;",
                findFirstBlock(),
                sqlstr_tramp,
                aux_ctrl_col[0],
                aux_ctrl_col[2],
                trpl_anf_util.func_info.function_name,
                aux_ctrl_col[0])
        );
        return sb.toString();
    }

    private String findFirstBlock() {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT\n");
        ArrayList<String> first_block_strs = blockToSqlString(trpl_anf_util.start_func.block, new AccumulatedOptions(), true, new HashSet<>());
        for (int i = 0; i < first_block_strs.size(); i++) {
            sb.append(first_block_strs.get(i));
            if (i != first_block_strs.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void findBodyBlocks() {
        ArrayList<Label> block_list = new ArrayList<>(trpl_anf_util.anf_funcs.keySet());
        if (block_list.size() > 2) {
            block_list.remove(0);
        }
        block_list.remove(block_list.size() - 1);
        for (Label lb : block_list) {
            sqlstr_tramp.put(trpl_anf_util.anf_funcs.get(lb).anf_func_name,
                    blockToSqlString(trpl_anf_util.anf_funcs.get(lb).block, new AccumulatedOptions(), false, new HashSet<>()));
        }
    }

    private ArrayList<String> blockToSqlString(
            ArrayList<AbstractSsaNode> block,
            AccumulatedOptions acc_op,
            boolean if_first_block,
            HashSet<String> block_present_vars) {
        ArrayList<String> sql_for_vars_in_block = new ArrayList<>();
        HashSet<String> block_present_vars_rec = new HashSet<>(block_present_vars);
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
                    acc_op.with_sql.append(String.format("LEFT JOIN (%s(%s)%s) AS let_%s(%s) ON True\n",
                            ((AssignSsaNode) asn).assign_type == ASSIGN_SQL ? "" : "SELECT ",
                            getFullTextSelected(((AssignSsaNode) asn).expression, trpl_anf_util.func_info.id_type_pair, block_present_vars_rec),
                            ((AssignSsaNode) asn).assign_type == ASSIGN_EXPR ? "::" + getFullTextByChildren(id_type) : "",
                            ((AssignSsaNode) asn).identifier.getText().replace(",", "_"),
                            ((AssignSsaNode) asn).identifier.getText()
                    ));
//                    acc_op.with_sql.append(String.format(",\nlet_%s(%s) AS (SELECT (%s(%s)%s)%s)\n",
//                            ((AssignSsaNode) asn).identifier.getText().replace(",", "_"),
//                            ((AssignSsaNode) asn).identifier.getText(),
//                            ((AssignSsaNode) asn).expr_sql ? "SELECT " : "",
//                            getFullTextSelected(((AssignSsaNode) asn).expression, trpl_anf_util.func_info.id_type_pair, block_present_vars_rec),
//                            !((AssignSsaNode) asn).expr_sql ? "" : "::" + getFullTextByChildren(id_type),
//                            acc_op.acc_tables.size() == 0 ? "" : String.format(" FROM %s", String.join(", ", acc_op.acc_tables))
//                    ));
                    acc_op.acc_tables.add(String.format("let_%s", ((AssignSsaNode) asn).identifier.getText().replace(",", "_")));
                    block_present_vars_rec.add(getIdName(((AssignSsaNode) asn).identifier));
                    break;

                case NODE_IFELSE:
                    ArrayList<String> sql_for_vars_in_then_block = blockToSqlString(((IfelseSsaNode) asn).then_block, acc_op, if_first_block, block_present_vars_rec);
                    ArrayList<String> sql_for_vars_in_else_block = blockToSqlString(((IfelseSsaNode) asn).else_block, acc_op, if_first_block, block_present_vars_rec);
                    for (int i = 0; i < trpl_anf_util.tramp_func.anf_func_args.size(); i++) {
                        sql_for_vars_in_block.add(String.format("CASE WHEN\n%s\nTHEN\n%s\nELSE\n%s\nEND\n",
                                String.format("(SELECT %s FROM\n(select NULL) as tmp_tab(tmp_tab_col)\n%s)",
                                        ((IfelseSsaNode) asn).condition.getText(),
                                        acc_op.with_sql),
//                                String.format("(SELECT (WITH\ntmp_tab(tmp_tab_col) AS (select NULL)\n%sSELECT %s FROM let_%s))",
//                                        acc_op.with_sql,
//                                        ((IfelseSsaNode) asn).condition.getText(),
//                                        ((IfelseSsaNode) asn).condition.getText().replace(",", "_")),
                                sql_for_vars_in_then_block.get(i),
                                sql_for_vars_in_else_block.get(i)
                        ));
                    }
                    break;

                case NODE_TRAMPLINECALL:
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
                                acc_op.with_sql.append(String.format("LEFT JOIN (SELECT %s%s) AS let_%s(%s) ON True\n",
                                        function_args_set.contains(str) ? STX + str + ETX : "NULL",
                                        "::" + getFullTextByChildren(id_type_in_first),
                                        str,
                                        str
                                ));
//                                acc_op.with_sql.append(String.format(",\nlet_%s(%s) AS (SELECT (SELECT %s%s)%s)\n",
//                                        str,
//                                        str,
//                                        function_args_set.contains(str) ? STX + str + ETX : "NULL",
//                                        "::" + getFullTextByChildren(id_type_in_first),
//                                        acc_op.acc_tables.size() == 0 ? "" : String.format(" FROM %s", String.join(", ", acc_op.acc_tables))
//                                ));
                                acc_op.acc_tables.add(String.format("let_%s", str.replace(",", "_")));
                            }
                        }
                    }
                    for (String arg_name : trpl_anf_util.tramp_func.anf_func_args) {
                        String arg_value = ((TrampolineCallSsaNode) asn).getArgValue(arg_name);
                        // Display the specified return value type
                        // to deal with difference between PL/SQL return type and data default type
                        if (arg_name.equals(aux_ctrl_col[2])) {
                            arg_value = "(" + arg_value + ")::" + getFullTextByChildren(trpl_anf_util.func_info.return_type);
                        }
                        sql_for_vars_in_block.add(String.format("(SELECT %s FROM\n(select NULL) as tmp_tab(tmp_tab_col)\n%s)",
                                arg_value == null ? "NULL" : arg_value,
                                acc_op.with_sql)
                        );
//                        sql_for_vars_in_block.add(String.format("(SELECT (WITH\ntmp_tab(tmp_tab_col) AS (select NULL)\n%sSELECT %s%s))",
//                                acc_op.with_sql,
//                                arg_value == null ? "NULL" : arg_value,
//                                acc_op.acc_tables.size() == 0 ? "" : String.format(" FROM %s", String.join(", ", acc_op.acc_tables)))
//                        );
                    }
                    break;

                default:
                    break;
            }
        }
        return sql_for_vars_in_block;
    }
}
