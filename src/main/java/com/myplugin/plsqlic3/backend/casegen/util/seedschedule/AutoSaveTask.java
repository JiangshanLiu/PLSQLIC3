package com.myplugin.plsqlic3.backend.casegen.util.seedschedule;

import java.util.Timer;
import java.util.TimerTask;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.backup_interval;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.MUTANT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;

public class AutoSaveTask {
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            String save_log = SeedSchedule.saveCurrentSeedlist();
            writeLog(MUTANT, save_log);
        }
    };

    public AutoSaveTask() {
        new Timer().schedule(task, backup_interval, backup_interval);
    }
}
