package com.myplugin.plsqlic3.backend;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResStateWithRes;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;
import com.myplugin.plsqlic3.backend.runnable.comparator.ComparatorAbsract;
import com.myplugin.plsqlic3.backend.runnable.comparator.ComparatorPL2SQL;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.AnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator.PlainAbstractSqlTranslator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.SsaGenerator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.genfromcode.SsaGeneratorFromCode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;
import com.myplugin.plsqlic3.middleware.data.VerifyData;

import java.util.HashMap;
import java.util.List;

import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.NORMAL;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.appendExceptionLog;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.GenerateAnf.getAnfUtil;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.GenerateTrampolinedAnf.getTrampolinedAnfUtil;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.GeneratePureSql.getPlainSqlUtil;

public class VerifyConsistencyBackend {
    public static VerifyData verifyConsistencyBackend(TestCase test_case, SqlIdMap<String, String> args) {
        return verifyConsistencyBackend(test_case, args, false);
    }

    public static VerifyData verifyConsistencyBackend(TestCase test_case, SqlIdMap<String, String> args, boolean ifDetail) {
        String case_name = test_case.case_name;
        String case_code = (String) test_case.case_code;
        if (case_name == null || case_code == null
                || case_name.equals("") || case_code.equals("")) {
            return null;
        }

        SQLResStateWithRes sql_res;
        List<HashMap<String, Object>> sql_res_list = null;
        ComparatorAbsract sql_comp;
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                GotoUtil goto_util;
                AnfUtil anf_util;
                TrampolinedAnfUtil trpl_anf_util;
                PlainAbstractSqlTranslator pure_sql_util;
                try {
                    SsaGenerator ssaGenerator = new SsaGeneratorFromCode();
                    goto_util = ssaGenerator.getGotoUtil(case_code);
//                    System.out.println(goto_util);
                } catch (Exception e) {
                    appendExceptionLog("GOTOE", case_name, e);
                    return null;
                }
                try {
                    anf_util = getAnfUtil(goto_util);
//                    System.out.println(anf_util);
                } catch (Exception e) {
                    appendExceptionLog("ANFE", case_name, e);
                    return null;
                }
                try {
                    trpl_anf_util = getTrampolinedAnfUtil(anf_util);
//                    System.out.println(trpl_anf_util);
                } catch (Exception e) {
                    appendExceptionLog("TRMPE", case_name, e);
                    return null;
                }
                try {
                    pure_sql_util = getPlainSqlUtil(trpl_anf_util);
                } catch (Exception e) {
                    appendExceptionLog("PURE", case_name, e);
                    return null;
                }

                sql_comp = new ComparatorPL2SQL();
                try {
                    assert pure_sql_util != null;
                    sql_res = sql_comp.testSQLWithRes(test_case, pure_sql_util.toString(), goto_util.func_info, args);
                    if (ifDetail) {
                        sql_res_list = sql_comp.testSQLWithDetail(pure_sql_util.toString(), args);
                    }
                } catch (Exception e) {
                    appendExceptionLog("TSTE", case_name, e);
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return null;
                }
                if (ifDetail) {
                    return new VerifyData(test_case,
                            goto_util.toString(),
                            anf_util.toString(),
                            pure_sql_util.toString(),
                            sql_res,
                            sql_res_list);
                } else {
                    return new VerifyData(test_case,
                            goto_util.toString(),
                            anf_util.toString(),
                            pure_sql_util.toString(),
                            sql_res);
                }
            case ORACLE:
                break;
        }
        return null;
    }
}
