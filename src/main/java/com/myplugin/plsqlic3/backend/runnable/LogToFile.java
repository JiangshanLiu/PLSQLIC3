package com.myplugin.plsqlic3.backend.runnable;

import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedScheduleMode.MSS_PRIOR_QUEUE;
import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedScheduleMode.MSS_QUEUE;
import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.ANOMALY;
import static com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState.ERROR;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;
import static com.myplugin.plsqlic3.backend.runnable.RunnableUtil.getPid;

public class LogToFile {
    public enum LOG_TYPE {
        PRINT,
        FUZZING,
        MUTANT,
        EXCEPTION
    }

    static final LinkedHashMap<String, String> bug_report_re = new LinkedHashMap<String, String>() {{
        put("func_not_exist", "ERROR: function (.)* does not exist");
        put("syntax_error", "ERROR: syntax error at or near (.)*");
        put("invalid_input", "ERROR: invalid input value (.)*");
        put("op_not_exist", "ERROR: operator does not exist: (.)*");
        put("col_not_exist", "ERROR: column \"(.)*\" does not exist");
        put("type_not_exist", "ERROR: type \"(.)*\" does not exist");
        put("rlt_not_exist", "ERROR: relation \"(.)*\" does not exist");
        put("statement_closed", "这个 statement 已经被关闭。");
        put("pl_error", "");
        put("others", "(.)*");
    }};

    private static PrintStream print_out_ps = System.out;
    private static PrintStream fuzzing_out_ps = System.out;
    private static PrintStream mutant_out_ps = System.out;
    private static PrintStream exception_out_ps = System.out;

    private static PrintStream getPrintStreamToFile(File file_name) {
        PrintStream ps = null;
        if (!file_name.exists()) {
            try {
                boolean m_flag = file_name.createNewFile();
                if (m_flag) {
                    ps = new PrintStream(file_name.getAbsoluteFile());
                }
            } catch (Exception ignored) {
            }
        }
        return ps;
    }

    private static void writeClassToFile(Class<?> clazz, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                Object value;
                try {
                    value = field.get(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    continue;
                }
                printWriter.println(name + " = " + value);
            }
        }
        printWriter.close();
        fileWriter.close();
    }


    public static void InitLogToFile() {
        File folder_seed_mutant = new File(dir_seed_mutant);
        if (!folder_seed_mutant.exists() && !folder_seed_mutant.isDirectory()) {
            if (!folder_seed_mutant.mkdirs()) {
                writeLog(LOG_TYPE.PRINT, "mkdir folder_seed_mutant failed!");
            }
        }
        if (ss_mode == MSS_QUEUE || ss_mode == MSS_PRIOR_QUEUE) {
            File folder_seeds = new File(memory_seeds_backup_dir);
            if (!folder_seeds.exists() && !folder_seeds.isDirectory()) {
                if (!folder_seeds.mkdirs()) {
                    writeLog(LOG_TYPE.PRINT, "mkdir folder_seeds failed!");
                }
            }
        }
        for (SQLResState if_err_st : SQLResState.values()) {
            if (if_err_st == ERROR) {
                for (String bug_log_type : bug_report_re.keySet()) {
                    File folder_bug_record_type = new File(dir_log_record + "/" + if_err_st + "/" + bug_log_type);
                    if (!folder_bug_record_type.exists() && !folder_bug_record_type.isDirectory()) {
                        if (!folder_bug_record_type.mkdirs()) {
                            writeLog(LOG_TYPE.PRINT, "mkdir folder_bug_record_type failed!");
                        }
                    }
                }
            } else if (if_err_st == ANOMALY) {
                File folder_bug_record = new File(dir_log_record + "/" + if_err_st);
                if (!folder_bug_record.exists() && !folder_bug_record.isDirectory()) {
                    if (!folder_bug_record.mkdirs()) {
                        writeLog(LOG_TYPE.PRINT, "mkdir folder_bug_record failed!");
                    }
                }
            }
        }
        if(if_coverage){
            File folder_cov = new File(dir_log_cov);
            if (!folder_cov.exists() && !folder_cov.isDirectory()) {
                if (!folder_cov.mkdirs()) {
                    writeLog(LOG_TYPE.PRINT, "mkdir folder_cov failed!");
                }
            }
        }

        File fuzzing_log_file = new File(dir_log_record + "/log_" + start_date + "_" + getPid() + "F.log");
        fuzzing_out_ps = getPrintStreamToFile(fuzzing_log_file);

        File mutation_log_file = new File(dir_log_record + "/log_" + start_date + "_" + getPid() + "M.log");
        mutant_out_ps = getPrintStreamToFile(mutation_log_file);

        File exception_log_file = new File(dir_log_record + "/log_" + start_date + "_" + getPid() + "E.log");
        exception_out_ps = getPrintStreamToFile(exception_log_file);

        if (if_log_to_file) {
            File print_log_file = new File(dir_log_record + "/log_" + start_date + "_" + getPid() + "P.log");
            print_out_ps = getPrintStreamToFile(print_log_file);
            System.setOut(print_out_ps);
            System.setErr(print_out_ps);
        }

        try {
            writeClassToFile(GlobalConfig.class, dir_log_record + "/GlobalConfig.json");
        } catch (Exception ignore) {
        }
    }

    public static synchronized void writeLog(LOG_TYPE log_type, String log) {
        if (log == null || log.equals("")) {
            return;
        }
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String thread_name = Thread.currentThread().getName();
        switch (log_type) {
            case FUZZING:
                fuzzing_out_ps.print("[" + df.format(day) + "]\t" + thread_name + "\t" + log + "\n");
                break;
            case MUTANT:
                mutant_out_ps.print("[" + df.format(day) + "]\t" + thread_name + "\t" + log + "\n");
//                mutant_out_ps.print(log);
                break;
            case EXCEPTION:
                exception_out_ps.print("[" + df.format(day) + "]\t" + thread_name + "\t" + log + "\n");
                break;
            case PRINT:
            default:
                print_out_ps.print(thread_name + "\t" + log + "\n");
        }
    }

    public static void appendExceptionLog(String e_type, String file_name, Exception e) {
        String[] file_name_list = file_name.split("/|\\\\");
        String log = String.format("%s\t%s\t%s", e_type, file_name_list[file_name_list.length - 1], e);
        writeLog(LOG_TYPE.EXCEPTION, log);
    }

    public static void writeBugOrErrLog(SQLResState fuzz_st, String sql_err_msg, String appendStr) {
        // create file
        Date day = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");

        StringBuilder sb_log_file_name = new StringBuilder();

        sb_log_file_name.append(dir_log_record + "/").append(fuzz_st.toString());
        if (fuzz_st == ERROR) {
            for (String bug_type : bug_report_re.keySet()) {
                if (Pattern.matches(bug_report_re.get(bug_type), sql_err_msg)) {
                    sb_log_file_name.append("/").append(bug_type);
                    break;
                }
            }
            sb_log_file_name.append("/err");
        } else {
            sb_log_file_name.append("/bug");
        }

        sb_log_file_name.append("log_").append(df.format(day))
                .append("_").append(System.currentTimeMillis())
                .append("_").append(Thread.currentThread().getName()).append(".log");
        File log_file = new File(sb_log_file_name.toString());
        if (!log_file.exists()) {
            try {
                log_file.createNewFile();
            } catch (Exception ignored) {
            }
        }

        // append bug info
        FileOutputStream fos;
        if (log_file.exists()) {
            try {
                fos = new FileOutputStream(log_file, true);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                osw.write(appendStr);
                osw.flush();
                osw.close();
            } catch (Exception ignore) {
            }
        }
    }
}
