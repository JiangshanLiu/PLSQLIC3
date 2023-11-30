package com.myplugin.plsqlic3.backend.runnable.comparator;


import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.FunctionInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.*;
import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.fuzz_or_debug;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeBugOrErrLog;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;

public class ComparatorPL2SQL extends ComparatorAbsract {

    @Override
    public SQLResState testSQL(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals) {
        return testSQLWithRes(test_case, eq_sql, aux, arg_vals).sqlResState;
    }

    @Override
    public SQLResStateWithRes testSQLWithRes(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals) {
        String case_name = test_case.case_name;
        String case_code = (String) test_case.case_code;

        FunctionInfo func_info = (FunctionInfo) aux;
        SQLResState fuzz_st = NORMAL;
        AbstractJDBCUtil jdbcUtil;

        SelectResWithMsg select_plsql_with_msg = null;
        SelectResWithMsg select_sql_with_msg = null;

        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                jdbcUtil = new PostgreSQLUtil();
                jdbcUtil.Select("BEGIN TRANSACTION;");
                jdbcUtil.setSchemaByFileName(case_name);
                for (String sql : func_info.preprocess_sql) {
                    jdbcUtil.Insert(sql);
                }
                jdbcUtil.Select(case_code);
                if (arg_vals == null) {
                    arg_vals = getArgVals(func_info);
                }
                // Execute PL/SQL code
                long debug1Time, debug2Time;
                if (!fuzz_or_debug) {
                    debug1Time = System.currentTimeMillis();
                }
                select_plsql_with_msg = jdbcUtil.SelectWithExcep(genSqlCallPlsql(func_info, arg_vals));
                if (!fuzz_or_debug) {
                    debug2Time = System.currentTimeMillis();
                    writeLog(PRINT, "PL/pgSQLTime: " + (debug2Time - debug1Time));
                }
                // Execute plain SQL code
                if (!fuzz_or_debug) {
                    debug1Time = System.currentTimeMillis();
                }
                select_sql_with_msg = jdbcUtil.SelectWithExcep(setValInPlainSql(eq_sql, arg_vals));
                jdbcUtil.Select("END TRANSACTION;");
                if (!fuzz_or_debug) {
                    debug2Time = System.currentTimeMillis();
                    writeLog(PRINT, "SQLTime: " + (debug2Time - debug1Time));
                }
                // compare the difference
                List<HashMap<String, Object>> select_plsql = select_plsql_with_msg.select_res;
                List<HashMap<String, Object>> select_sql = select_sql_with_msg.select_res;
                String select_plsql_msg = select_plsql_with_msg.exception_msg;
                String select_sql_msg = select_sql_with_msg.exception_msg;
                String select_plsql_msg_split = select_plsql_msg.split("\n")[0];
                String select_sql_msg_split = select_sql_msg.split("\n")[0];
                // execute time > limit threshold
                if (select_plsql_msg_split.equals("ERROR: canceling statement due to user request") ||
                        select_sql_msg_split.equals("ERROR: canceling statement due to user request")) {
                    jdbcUtil.close();
                    return new SQLResStateWithRes(TM_OVR, select_plsql_with_msg, select_sql_with_msg);
                }
                // meet exception in execution
                if (select_plsql_msg.length() + select_sql_msg.length() > 0) {
                    // delete "ERROR: "
                    String PL_msg = select_plsql_msg_split.length() > 7 ? select_plsql_msg_split.substring(7) : select_plsql_msg_split;
                    String SL_msg = select_sql_msg_split.length() > 7 ? select_sql_msg_split.substring(7) : select_sql_msg_split;
                    String log = String.format("%s\t%s\t%s",
                            PL_msg.length() == 0 ? "SQLE" : (SL_msg.length() == 0 ? "PLE" : "PSQE"),
                            case_name,
                            PL_msg.length() == 0 ? SL_msg : (SL_msg.length() == 0 ? PL_msg : PL_msg + " & " + SL_msg));
                    writeLog(EXCEPTION, log);
                }
                // analyze execution result
                if (!compareResult(select_plsql, select_sql) && select_plsql_msg.length() == 0 && select_sql_msg.length() == 0) {
                    fuzz_st = ANOMALY;
                } else if (select_plsql_msg.length() != 0 || select_sql_msg.length() != 0) {
                    fuzz_st = ERROR;
                }
                // log to file
                if (fuzz_or_debug && (fuzz_st == ANOMALY || fuzz_st == ERROR)) {
                    String sep = "\n/************************************************************/\n";
                    StringJoiner sj = new StringJoiner("\n");
                    func_info.preprocess_sql.forEach(sj::add);
                    writeBugOrErrLog(fuzz_st,
                            select_sql_msg_split,
                            select_plsql + sep + select_sql + sep
                                    + select_plsql_msg_split + sep + select_sql_msg_split + sep
                                    + (sj.length() != 0 ? sj : "\n") + sep
                                    + genSqlCallPlsql(func_info, arg_vals) + sep
                                    + case_name + sep + case_code + sep + eq_sql
                    );
                }
                // if debug mode, show execute result
                if (!fuzz_or_debug) {
                    writeLog(PRINT, select_plsql + "\n" + select_sql + "\n" + compareResult(select_plsql, select_sql) + "\n" + fuzz_st);
                }
                jdbcUtil.close();
                return new SQLResStateWithRes(fuzz_st, select_plsql_with_msg, select_sql_with_msg);
            case ORACLE:
                jdbcUtil = new OracleUtil();
                jdbcUtil.Select(case_code);
//                orcl_util.Select("ALTER SESSION SET CURRENT_SCHEMA=OT ");
//                orcl_util.Select("SELECT 1 FROM dual \n ");
//                orcl_util.Select("select * from OT.customers\n ");
                jdbcUtil.close();
                break;
        }
        return new SQLResStateWithRes(NORMAL, select_plsql_with_msg, select_sql_with_msg);
    }

    @Override
    public List<HashMap<String, Object>> testSQLWithDetail(String eq_sql, SqlIdMap<String, String> arg_vals) {
        String[] lines = eq_sql.split("\n");
        String updatedString = null;
        if (lines.length > 0) {
            int lastIndex = lines.length - 1;
            lines[lastIndex] = "SELECT * FROM run;";
            updatedString = String.join("\n", lines);
        }
        AbstractJDBCUtil jdbcUtil;
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                jdbcUtil = new PostgreSQLUtil();
                if (arg_vals == null) {
                    return null;
                }
                SelectResWithMsg select_sql_with_msg = jdbcUtil.SelectWithExcep(setValInPlainSql(updatedString, arg_vals));
                jdbcUtil.close();
                return select_sql_with_msg.select_res;
            case ORACLE:
                jdbcUtil = new OracleUtil();
                jdbcUtil.close();
                break;
        }
        return null;
    }


    private SqlIdMap<String, String> getArgVals(FunctionInfo func_info) {
        SqlIdMap<String, String> arg_vals = new SqlIdMap<>();
        for (TerminalNode tn : func_info.function_args) {
            arg_vals.put(tn.getText(), getRandom(func_info.id_type_pair.get(tn.getText())));
        }
        return arg_vals;
    }

    private String genSqlCallPlsql(FunctionInfo func_info, SqlIdMap<String, String> arg_vals) {
        StringBuilder sb_arg_vals = new StringBuilder();
        for (TerminalNode tn : func_info.function_args) {
            sb_arg_vals.append(arg_vals.get(tn.getText())).append(", ");
        }
        if (func_info.function_args.size() != 0) {
            sb_arg_vals.delete(sb_arg_vals.length() - 2, sb_arg_vals.length());
        }
        return String.format("SELECT * FROM %s(%s);",
                func_info.full_function_name,
                sb_arg_vals);
    }

    private String setValInPlainSql(String plain_sql, SqlIdMap<String, String> arg_vals) {
        String STX = new String(new byte[]{0x02}, StandardCharsets.UTF_8);
        String ETX = new String(new byte[]{0x03}, StandardCharsets.UTF_8);
        Pattern p = Pattern.compile(STX + "(.*)" + ETX);
        Matcher m = p.matcher(plain_sql);
        while (m.find()) {
            plain_sql = plain_sql.replace(m.group(), arg_vals.get(m.group().substring(1, m.group().length() - 1)));
        }
//        plain_sql = plain_sql.replaceAll(STX + "(.*)" + ETX, "$1");
//        plain_sql = plain_sql.replaceAll(STX + "(.*)" + ETX, arg_vals.get("$1"));
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(plain_sql), null);
        return plain_sql;
    }
}
