package com.myplugin.plsqlic3.backend.runnable.comparator;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.*;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;
import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.util.HashMap;
import java.util.List;

import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.*;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.fuzz_or_debug;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeBugOrErrLog;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;

public class ComparatorEMI extends ComparatorAbsract {
    @Override
    public List<HashMap<String, Object>> testSQLWithDetail(String eq_sql, SqlIdMap<String, String> arg_vals) {
        return null;
    }

    @Override
    public SQLResState testSQL(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals) {
        return null;
    }

    @Override
    public SQLResStateWithRes testSQLWithRes(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals) {
        return null;
    }

    @Override
    public SQLResState testSQL(TestCase test_case, String eq_sql, Object aux) {
        String case_name = test_case.case_name;
        String case_code = (String) test_case.case_code;

        ExecProfile prof = (ExecProfile) aux;
        SQLResState fuzz_st = NORMAL;
        AbstractJDBCUtil jdbcUtil;
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                jdbcUtil = new PostgreSQLUtil();
                jdbcUtil.Select("BEGIN TRANSACTION;");
                jdbcUtil.setSchemaByFileName(case_name);
                // Execute original PL/SQL code
                long debug1Time, debug2Time;
                if (!fuzz_or_debug) {
                    debug1Time = System.currentTimeMillis();
                }
                jdbcUtil.Select(case_code);
                SelectResWithMsg select_plsql_with_msg = jdbcUtil.SelectWithExcep(prof.callFunc());
                if (!fuzz_or_debug) {
                    debug2Time = System.currentTimeMillis();
                    writeLog(PRINT, "ORI_PL/pgSQLTime: " + (debug2Time - debug1Time));
                }
                // Execute equivalent PL/SQL code
                if (!fuzz_or_debug) {
                    debug1Time = System.currentTimeMillis();
                }
                jdbcUtil.Select(eq_sql);
                SelectResWithMsg select_sql_with_msg = jdbcUtil.SelectWithExcep(prof.callFunc());
                jdbcUtil.Select("END TRANSACTION;");
                if (!fuzz_or_debug) {
                    debug2Time = System.currentTimeMillis();
                    writeLog(PRINT, "EQ_PL/pgSQLTime: " + (debug2Time - debug1Time));
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
                    return TM_OVR;
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
                    writeBugOrErrLog(fuzz_st,
                            select_sql_msg_split,
                            select_plsql + sep + select_sql + sep
                                    + select_plsql_msg_split + sep + select_sql_msg_split + sep
                                    + prof.callFunc() + sep
                                    + case_name + sep + case_code + sep + eq_sql
                    );
                }
                // if debug mode, show execute result
                if (!fuzz_or_debug) {
                    writeLog(PRINT, select_plsql + "\n" + select_sql + "\n" + compareResult(select_plsql, select_sql) + "\n" + fuzz_st);
                }
                jdbcUtil.close();
                return fuzz_st;
            case ORACLE:
                jdbcUtil = new OracleUtil();
                jdbcUtil.Select(case_code);
                jdbcUtil.close();
                break;
        }
        return NORMAL;
    }
}
