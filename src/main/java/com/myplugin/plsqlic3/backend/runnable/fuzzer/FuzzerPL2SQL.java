package com.myplugin.plsqlic3.backend.runnable.fuzzer;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;
import com.myplugin.plsqlic3.backend.runnable.comparator.ComparatorAbsract;
import com.myplugin.plsqlic3.backend.runnable.comparator.ComparatorPL2SQL;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.AnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator.PlainAbstractSqlTranslator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.SsaGenerator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.genfromcode.SsaGeneratorFromCode;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedSchedule.addSeed;
import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.NORMAL;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.FUZZING;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.appendExceptionLog;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.GenerateAnf.getAnfUtil;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.GenerateTrampolinedAnf.getTrampolinedAnfUtil;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.GeneratePureSql.getPlainSqlUtil;

public class FuzzerPL2SQL extends FuzzerAbstract {
    @Override
    protected void fuzzByCase(TestCase test_case) {
        String case_name = test_case.case_name;
        String case_code = (String) test_case.case_code;
        if (case_name == null || case_code == null
                || case_name.equals("") || case_code.equals("")) {
            return;
        }

        SQLResState sql_res_state = NORMAL;
        ComparatorAbsract sql_comp;
        long startTime = 0, compileTime = 0, endTime = 0;
        startTime = System.currentTimeMillis();
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
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return;
                }
                try {
                    anf_util = getAnfUtil(goto_util);
//                    System.out.println(anf_util);
                } catch (Exception e) {
                    appendExceptionLog("ANFE", case_name, e);
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return;
                }
                try {
                    trpl_anf_util = getTrampolinedAnfUtil(anf_util);
//                    System.out.println(trpl_anf_util);
                } catch (Exception e) {
                    appendExceptionLog("TRMPE", case_name, e);
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return;
                }
                try {
                    pure_sql_util = getPlainSqlUtil(trpl_anf_util);
                } catch (Exception e) {
                    appendExceptionLog("PURE", case_name, e);
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return;
                }
                compileTime = System.currentTimeMillis();

                if (conversion_only && OS_type.startsWith("Windows")) {
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(pure_sql_util.toString()), null);
                    return;
                }

                long debug1Time, debug2Time;
                if (!fuzz_or_debug) {
                    debug1Time = System.currentTimeMillis();
                }
                sql_comp = new ComparatorPL2SQL();
                if (!fuzz_or_debug) {
                    debug2Time = System.currentTimeMillis();
                    writeLog(PRINT, "ConnTime: " + (debug2Time - debug1Time));
                }
                try {
                    sql_res_state = sql_comp.testSQL(test_case, pure_sql_util.toString(), goto_util.func_info);
                } catch (Exception e) {
                    appendExceptionLog("TSTE", case_name, e);
                    if (!fuzz_or_debug) {
                        e.printStackTrace();
                    }
                    return;
                }
                synchronized (lock) {
                    switch (sql_res_state) {
                        case ANOMALY:
                            state_counter[0]++;
                            break;
                        case ERROR:
                            state_counter[1]++;
                            break;
                        case TM_OVR:
                            state_counter[2]++;
                            break;
                        case NORMAL:
                            state_counter[3]++;
                            break;
                        default:
                            break;
                    }
                }
                break;
            case ORACLE:
                break;
        }
        endTime = System.currentTimeMillis();
        synchronized (lock) {
            // log to file
            String log = String.format("%d\t%.3f\t%.3f\t%s\t%.3f\t%.3f\t%.3f\t%.3f\t%s\t%s",
                    round,
                    (compileTime - startTime) / 1000.0, (endTime - compileTime) / 1000.0,
                    sql_res_state,
                    (float) state_counter[0] / Arrays.stream(state_counter).sum(),
                    (float) state_counter[1] / Arrays.stream(state_counter).sum(),
                    (float) state_counter[2] / Arrays.stream(state_counter).sum(),
                    (float) state_counter[3] / Arrays.stream(state_counter).sum(),
                    GlobalConfig.db_type, case_name);
            writeLog(FUZZING, log);
            round++;
        }
        // add seed to schedule
        addSeed(test_case);
    }
}
