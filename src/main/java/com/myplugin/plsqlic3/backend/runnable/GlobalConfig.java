package com.myplugin.plsqlic3.backend.runnable;


import com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedScheduleMode;
import com.myplugin.plsqlic3.backend.databaseutil.conninfo.JdbcConnInfo;
import com.myplugin.plsqlic3.backend.runnable.fuzzer.Fuzzers;

import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedScheduleMode.MSS_BY_EACH_SEED;
import static com.myplugin.plsqlic3.backend.databaseutil.conninfo.CandidateConnInfo.*;
import static com.myplugin.plsqlic3.backend.runnable.RunnableUtil.getDate;
import static com.myplugin.plsqlic3.backend.runnable.RunnableUtil.getFileLastModified;
import static com.myplugin.plsqlic3.backend.runnable.fuzzer.Fuzzers.EMI;

public class GlobalConfig {
    // system config
    public static final String OS_type = System.getProperty("os.name");             // run on local Windows or Linux server
    // Fuzzing version
    public static final String fuzzing_version = getFileLastModified();
    public static final Fuzzers fuzzer_type = EMI;                               // comparison of different testing methods
    // running config
    public static final boolean fuzz_or_debug = true;                               // my own debug mode
    public static final boolean conversion_only = false;                            // run metamorphic relation only
    public static final boolean if_do_mutation = true;                              // if execute mutation on seed
    // log config
    public static final boolean if_log_to_file = true;
    public static final String dir_log = "./log";
    public static final String start_date = getDate();
    public static final String dir_log_record = dir_log + "/log-" + start_date;
    // db config
    public static final JdbcConnInfo conn_info = pg_emi_info;                       // select which database to test
    public static final DatabaseType db_type = conn_info.getDb_type();
    public static final String db_user_name = conn_info.getDb_user_name();
    public static final String db_password = conn_info.getDb_password();
    public static final String db_ip_addr = conn_info.getDb_ip_addr();
    public static final String db_port = conn_info.getDb_port();
    public static final String db_database_name = conn_info.getDb_database_name();
    public static final String db_schema = conn_info.getDb_schema();
    // collect coverage
    public static final boolean if_coverage = conn_info == pg_cov_info;
    public static final String dir_log_cov = dir_log_record + "/cov";
    // parallel config
    public static final boolean if_parallel_work = true;
    public static final int parallel_workers_num = 10;
    // SQL exec config
    public static final int db_uptime = 10;                                     // forced stop when SQL execution time exceeds limit
    // seed schedule config
    public static final SeedScheduleMode ss_mode = MSS_BY_EACH_SEED;            // how to schedule seed
    public static final double case_or_mut = 0.1;                               // probability of selecting seed instead of variant for test case
    public static final double mutFrom_set_or_mut = 0.7;                        // probability of selecting seed from seed set rather than variant set
    public static final int memory_seed_num = 5000;                             // maximum number of seeds in memory
    public static final int mutants_num_each_seed = 20;                         // maximum number of variants retained per seed
    // seed save config
    public static final String memory_seeds_backup_dir = dir_log_record + "/SEEDS";
    public static final int backup_interval = ss_mode == MSS_BY_EACH_SEED ? 1000 * 30 : 1000 * 60 * 10;
    public static final String dir_seed_root = "./test_sql/test_plpgsql";
    public static final String dirname_seed_set = "seed_set";
    public static final String dir_seed_set = dir_seed_root + "/" + dirname_seed_set;
    public static final String dirname_seed_mutant = "seed_mutant" + "-" + start_date;
    public static final String dir_seed_mutant = dir_seed_root + "/" + dirname_seed_mutant;
    // random generation config
    public static final boolean if_beta_sampled = false;
    public static final int rdm_int_max = 50;
    public static final int rdm_numeric_default_power_max = 10;
    public static final long rdm_money_integer_max = 92233720368547757L;
    public static final double ascii_letter = 0.7;
    public static final int rdm_char_start = 0x0000;
    public static final int rdm_char_end = 0x10ffff;
    public static final int rdm_char_default_length_max = 20;
    public static final int rdm_text_length_max = 50;
    public static final int rdm_byyea_length_max = 200;
    public static final long rdm_time_bound = 13601059199000L;
    public static final int rdm_bit_default_length_max = 20;
    public static final int rdm_numrange_default_lower_bound_max = 50;
    public static final int rdm_numrange_default_upper_bound_max = 50;
    public static final int rdm_anyarray_length_max = 10;
    // conversion config
    public static final boolean if_sql_debug = false;
    public static final String[] aux_ctrl_col = if_sql_debug ?
            new String[]{"__AUX_CTRL_COL_REC__", "__AUX_CTRL_COL_CALL__", "__AUX_CTRL_COL_RES__", "__AUX_CTRL_COL_DEBUG__"}
            : new String[]{"__AUX_CTRL_COL_REC__", "__AUX_CTRL_COL_CALL__", "__AUX_CTRL_COL_RES__"};
    public static final String judgment_cond = "JudgmentCondP";
    public static final String int_for_loop_upper_bound = "LoopUpperBoundVar";
    public static final String cursor_loop_cond = "CursorLoopP";
    public static final String cursor_loop_count_tabname = "CursorLoopCount";
    public static final String cursor_loop_record_tabname = "CursorLoopRec";
    public static final String cursor_loop_record_viewname = "CursorLoopTmpView";
    public static final String anonymous_dollar_var_id = "AnonymousVarWithDollar";
    // mutant config
    public static final double select_mutops_probability = 0.2;
}
