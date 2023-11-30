package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.memory_seed_num;

public class SeedMapQueue extends AbstractSeedMapQueue {
    public SeedMapQueue() {
        super();
    }

    public SeedMapQueue(AbstractSeedMapQueue map) {
        super(map);
    }

    @Override
    public void update() {
        synchronized (lock) {
            super.poll();
            TestCase case_peek = peek();
            super.put(case_peek.case_name, (String) case_peek.case_code);
        }
    }

    @Override
    public String put(String key, String value) {
        synchronized (lock) {
            if (this.size() >= memory_seed_num) {
                this.poll();
            }
            return super.put(key, value);
        }
    }
}
