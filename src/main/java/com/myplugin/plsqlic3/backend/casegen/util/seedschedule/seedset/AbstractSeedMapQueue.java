package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.dir_seed_set;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.memory_seeds_backup_dir;

public class AbstractSeedMapQueue extends LinkedHashMap<String, String> implements SeedQueueImp {
    private static AbstractSeedMapQueue last_seed_queue = null;

    public AbstractSeedMapQueue() {
        File dir_file = new File(dir_seed_set);
        for (String file_name : Objects.requireNonNull(dir_file.list())) {
            super.put(file_name, readStringFromFile(dir_seed_set + "/" + file_name));
        }
        last_seed_queue = new AbstractSeedMapQueue(this);
    }

    public AbstractSeedMapQueue(AbstractSeedMapQueue map) {
        for (String k : map.keySet()) {
            this.put(k, map.get(k));
        }
    }

    @Override
    public TestCase peek() {
        synchronized (lock) {
            TestCase ret = new TestCase();
            ret.case_name = this.entrySet().iterator().next().getKey();
            ret.case_code = this.entrySet().iterator().next().getValue();
            return ret;
        }
    }

    protected void poll() {
        synchronized (lock) {
            this.remove(this.entrySet().iterator().next().getKey());
        }
    }

    @Override
    public void put(TestCase seed) {
        synchronized (lock) {
            super.put(seed.case_name, (String) seed.case_code);
        }
    }

    @Override
    public void update() {
    }

    @Override
    public String saveQueue2String() {
        synchronized (lock) {
            StringBuilder sb = new StringBuilder();
            ArrayList<String> prefix_list = new ArrayList<>();
            ArrayList<String> seed_list = new ArrayList<>();
            Date day = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
            sb.append("======================== Save Seeds at: ")
                    .append(df.format(day))
                    .append(" ========================\n");
            // Reserve Seeds
            for (String seed_name : last_seed_queue.keySet()) {
                if (this.containsKey(seed_name)) {
                    String prefix = seed_name.substring(0, seed_name.length() - 4).split("#")[0];
                    if (!prefix_list.contains(prefix)) {
                        prefix_list.add(prefix);
                    }
                    seed_list.add(seed_name);
                }
            }
            sb.append("\tReserve Seeds: ")
                    .append(prefix_list.size()).append(" original seeds & ")
                    .append(seed_list.size()).append(" mutant seeds\n");
            Collections.sort(prefix_list);
            Collections.sort(seed_list);
            for (String seed_name : prefix_list) {
                sb.append(seed_name).append("\t");
            }
            sb.append("\n");
            for (String seed_name : seed_list) {
                sb.append(seed_name).append("\n");
            }
            prefix_list.clear();
            seed_list.clear();
            // Remove Seeds
            for (String seed_name : last_seed_queue.keySet()) {
                if (!this.containsKey(seed_name)) {
                    String prefix = seed_name.substring(0, seed_name.length() - 4).split("#")[0];
                    if (!prefix_list.contains(prefix)) {
                        prefix_list.add(prefix);
                    }
                    seed_list.add(seed_name);
                }
            }
            sb.append("\tRemove Seeds: ")
                    .append(prefix_list.size()).append(" original seeds & ")
                    .append(seed_list.size()).append(" mutant seeds\n");
            Collections.sort(prefix_list);
            Collections.sort(seed_list);
            for (String seed_name : prefix_list) {
                sb.append(seed_name).append("\t");
            }
            sb.append("\n");
            for (String seed_name : seed_list) {
                sb.append(seed_name).append("\n");
            }
            prefix_list.clear();
            seed_list.clear();
            // Update Seeds
            for (String seed_name : this.keySet()) {
                if (!last_seed_queue.containsKey(seed_name)) {
                    String prefix = seed_name.substring(0, seed_name.length() - 4).split("#")[0];
                    if (!prefix_list.contains(prefix)) {
                        prefix_list.add(prefix);
                    }
                    seed_list.add(seed_name);
                }
            }
            sb.append("\tUpdate Seeds: ")
                    .append(prefix_list.size()).append(" original seeds & ")
                    .append(seed_list.size()).append(" mutant seeds\n");
            Collections.sort(prefix_list);
            Collections.sort(seed_list);
            for (String seed_name : prefix_list) {
                sb.append(seed_name).append("\t");
            }
            sb.append("\n");
            for (String seed_name : seed_list) {
                sb.append(seed_name).append("\n");
            }

            // save full seeds
            seed_list.clear();
            seed_list.addAll(this.keySet());
            StringJoiner joiner = new StringJoiner("\n");
            this.keySet().forEach(joiner::add);
            File case_file = new File(memory_seeds_backup_dir + "/seeds_" + df.format(day));
            boolean create_flag = false;
            if (!case_file.exists()) {
                try {
                    create_flag = case_file.createNewFile();
                } catch (Exception ignored) {
                }
                FileOutputStream fos;
                if (create_flag && case_file.exists()) {
                    try {
                        fos = new FileOutputStream(case_file, true);
                        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                        osw.write(joiner.toString());
                        osw.flush();
                        osw.close();
                    } catch (Exception ignore) {
                    }
                }
            }

            last_seed_queue = new SeedMapQueue(this);
            return sb.toString();
        }
    }
}
