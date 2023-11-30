package com.myplugin.plsqlic3.backend.runnable;

import com.myplugin.plsqlic3.backend.runnable.fuzzer.FuzzerAbstract;
import com.myplugin.plsqlic3.backend.runnable.fuzzer.FuzzerPL2SQL;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.fuzzer_type;

public class RunnableExecMultiThread implements Runnable {
    private Thread t;
    private final int thread_index;

    public RunnableExecMultiThread(int thread_index) {
        this.thread_index = thread_index;
    }

    @Override
    public void run() {
        FuzzerAbstract fuzzer;
        switch (fuzzer_type) {
            case PL2SQL:
            case EMI:
            case NOREC:
            default:
                fuzzer = new FuzzerPL2SQL();
        }
        while (true) {
            fuzzer.fuzz();
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, Integer.toString(thread_index));
            t.start();
        }
    }
}
