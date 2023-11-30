package com.myplugin.plsqlic3.backend.runnable;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.OS_type;

public class RunnableUtil {
    public static String getDate() {
        Date day = new Date();
        SimpleDateFormat df;
        df = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");

        return df.format(day);
    }

    public static int getPid() {
        int PID = -1;
        if (PID < 0) {
            try {
                RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
                String name = runtime.getName(); // format: "pid@hostname"
                PID = Integer.parseInt(name.substring(0, name.indexOf('@')));
            } catch (Throwable e) {
                PID = 0;
            }
        }
        return PID;
    }

    public static String getFileLastModified() {
        File file;
        if (OS_type.startsWith("Windows")) {
            file = new File("./out/artifacts/PL2SQL_BYANTLR_jar/PL2SQL_BYANTLR.jar");
        } else {
            file = new File("./PL2SQL_BYANTLR.jar");
        }

        if (file.exists()) {
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);
            return date.toString();
        } else {
            return "";
        }
    }
}
