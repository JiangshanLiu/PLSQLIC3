package com.myplugin.plsqlic3.backend.runnable;

import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.dir_log_cov;
import static com.myplugin.plsqlic3.backend.runnable.RunnableUtil.getDate;

public class ScheduledCollectCoverage {
    private static void writeStr2File(String str, String file_name) {
        try {
            File file = new File(file_name);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void scheduledCollectCoverage() {
        try {
            String log_name = dir_log_cov + "/cov_log_" + getDate() + ".log";

            StringBuilder sb = new StringBuilder();
            String c = "docker exec postgres15.2_5443 lcov --zerocounters --directory /usr/local/src/postgresql-15.2";
            ProcessBuilder pb = new ProcessBuilder(c.split(" "));
            pb.redirectErrorStream(true);
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            p.waitFor();
            sb.append("\n/*******************/\n");
            writeStr2File(sb.toString(), log_name);

            StringBuilder sb1 = new StringBuilder();
            String c1 = "docker exec postgres15.2_5443 lcov --directory /usr/local/src/postgresql-15.2 --capture --output-file /home/postgres/auto_cov/app.info";
            ProcessBuilder pb1 = new ProcessBuilder(c1.split(" "));
            pb1.redirectErrorStream(true);
            Process p1 = pb1.start();
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                sb1.append(line1).append("\n");
            }
            p1.waitFor();
            sb1.append("\n/*******************/\n");
            writeStr2File(sb1.toString(), log_name);

            StringBuilder sb2 = new StringBuilder();
            String c2 = "docker cp postgres15.2_5443:/home/postgres/auto_cov/app.info " + dir_log_cov + "/" + getDate() + ".info";
            ProcessBuilder pb2 = new ProcessBuilder(c2.split(" "));
            pb2.redirectErrorStream(true);
            Process p2 = pb2.start();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
            String line2;
            while ((line2 = reader2.readLine()) != null) {
                sb2.append(line2).append("\n");
            }
            p2.waitFor();
            writeStr2File(sb2.toString(), log_name);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> {
            try {
                StringBuilder sb = new StringBuilder();

                String c1 = "docker exec postgres15.2_5443 lcov --directory /usr/local/src/postgresql-15.2 --capture --output-file /home/postgres/auto_cov/app.info";
                ProcessBuilder pb1 = new ProcessBuilder(c1.split(" "));
                pb1.redirectErrorStream(true);
                Process p1 = pb1.start();
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));
                String line1;
                while ((line1 = reader1.readLine()) != null) {
                    sb.append(line1).append("\n");
                }
                p1.waitFor();
                sb.append("\n/*******************/\n");

                String c2 = "docker cp postgres15.2_5443:/home/postgres/auto_cov/app.info " + dir_log_cov + "/" + getDate() + ".info";
                ProcessBuilder pb2 = new ProcessBuilder(c2.split(" "));
                pb2.redirectErrorStream(true);
                Process p2 = pb2.start();
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
                String line2;
                while ((line2 = reader2.readLine()) != null) {
                    sb.append(line2).append("\n");
                }
                p2.waitFor();

                writeStr2File(sb.toString(), dir_log_cov + "/cov_log_" + getDate() + ".log");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }, 0, 60 * 5, TimeUnit.SECONDS);
    }
}
