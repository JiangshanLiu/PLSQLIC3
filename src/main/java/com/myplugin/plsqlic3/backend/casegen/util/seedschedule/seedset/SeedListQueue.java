package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

import java.io.File;
import java.util.*;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.dir_seed_set;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.mutants_num_each_seed;

public class SeedListQueue extends ArrayList<ArrayList<Map.Entry<String, String>>> implements SeedQueueImp {
    private static int peek = 0;
    private static String mutants_counter = "";

    public SeedListQueue() {
        if (this.size() == 0) {
            File dir_file = new File(dir_seed_set);
            for (String file_name : Objects.requireNonNull(dir_file.list())) {
                this.add(new ArrayList<>());
                this.get(this.size() - 1).add(new AbstractMap.SimpleEntry<>(file_name, readStringFromFile(dir_seed_set + "/" + file_name)));
            }
        }
    }

    public TestCase peek() {
        synchronized (lock) {
            TestCase ret = new TestCase();
            int random = new Random().nextInt(this.get(peek).size());
            ret.case_name = this.get(peek).get(random).getKey();
            ret.case_code = this.get(peek).get(random).getValue();
            peek++;
            if (peek >= this.size()) {
                peek = 0;
            }
            return ret;
        }
    }

    public void put(TestCase seed) {
        synchronized (lock) {
            String key = seed.case_name;
            String value = (String) seed.case_code;
            String seed_name = key.substring(0, key.length() - 4).split("#")[0] + ".sql";
            for (ArrayList<Map.Entry<String, String>> list : this) {
                if (seed_name.equals(list.get(0).getKey())) {
                    if (list.size() < mutants_num_each_seed) {
                        list.add(new AbstractMap.SimpleEntry<>(key, value));
                    } else {
                        int random = new Random().nextInt(list.size() - 1) + 1;
                        list.remove(random);
                        list.add(new AbstractMap.SimpleEntry<>(key, value));
                    }
                }
            }
        }
    }

    @Override
    public void update() {
    }

    @Override
    public String saveQueue2String() {
        synchronized (lock) {
            StringJoiner joiner_curr = new StringJoiner("\t");
            this.forEach(list -> joiner_curr.add(Integer.toString(list.size())));
            if (!mutants_counter.equals(joiner_curr.toString())) {
                mutants_counter = String.valueOf(joiner_curr);
                return String.valueOf(joiner_curr);
            } else {
                return "";
            }
        }
    }
}
