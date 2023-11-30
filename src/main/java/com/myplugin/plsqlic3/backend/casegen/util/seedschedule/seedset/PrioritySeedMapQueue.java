package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.plcomplexity.GetPlPgSqlComplexity.getPlPgSqlComplexity;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.memory_seed_num;

public class PrioritySeedMapQueue extends AbstractSeedMapQueue {
    private final PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

    public PrioritySeedMapQueue() {
        super();
    }

    @Override
    protected void poll() {
        synchronized (lock) {
            this.remove(Objects.requireNonNull(priorityQueue.poll()).getKey());
        }
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
    public void put(TestCase seed) {
        synchronized (lock) {
            String key = seed.case_name;
            String value = (String) seed.case_code;
            if (this.size() >= memory_seed_num) {
                this.poll();
            }
            if (this.containsKey(key)) {
                Map.Entry<String, Integer> rm_e = null;
                for (Map.Entry<String, Integer> e : priorityQueue) {
                    if (key.equals(e.getKey())) {
                        rm_e = e;
                        break;
                    }
                }
                priorityQueue.remove(rm_e);
            }
            priorityQueue.add(new SimpleEntry<>(key, getPlPgSqlComplexity(value)));
            super.put(key, value);
        }
    }
}
