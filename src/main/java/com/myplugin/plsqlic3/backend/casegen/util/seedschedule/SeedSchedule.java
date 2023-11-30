package com.myplugin.plsqlic3.backend.casegen.util.seedschedule;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset.PrioritySeedMapQueue;
import com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset.SeedListQueue;
import com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset.SeedMapQueue;
import com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset.SeedQueueImp;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.SaveMutantCase.saveMutantCase;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;

public class SeedSchedule {
    private static LinkedList<String> seed_list = null;
    private static SeedQueueImp seed_queue = null;
    private static final AutoSaveTask task = fuzz_or_debug ? new AutoSaveTask() : null;

    static {
        switch (ss_mode) {
            case FSS_RANDOM:
                break;
            case FSS_TRAVERSAL_SET:
            case FSS_TRAVERSAL_SET_MUT:
                seed_list = new LinkedList<>();
                break;
            case MSS_QUEUE:
                seed_queue = new SeedMapQueue();
                break;
            case MSS_PRIOR_QUEUE:
                seed_queue = new PrioritySeedMapQueue();
                break;
            case MSS_BY_EACH_SEED:
                seed_queue = new SeedListQueue();
                break;
        }
    }

    public static TestCase selectSeedBySingleFile(String file_name) {
        TestCase res = new TestCase();
        String[] file_name_split = file_name.split("[/\\\\]");
        res.case_name = file_name_split[file_name_split.length - 1];
        res.case_code = readStringFromFile(file_name);
        return res;
    }

    public static synchronized TestCase selectSeed() {
        TestCase res = new TestCase();
        switch (ss_mode) {
            case FSS_RANDOM:
                Random r = new Random();
                double num = r.nextDouble();
                if (num < mutFrom_set_or_mut) {
                    res.case_name = getRandomSeedFromDir(dir_seed_set);
                    res.case_code = readStringFromFile(dir_seed_set + "/" + res.case_name);
                } else {
                    res.case_name = getRandomSeedFromDir(dir_seed_mutant);
                    res.case_code = readStringFromFile(dir_seed_mutant + "/" + res.case_name);
                }
                break;
            case FSS_TRAVERSAL_SET:
                if (seed_list.size() == 0) {
                    File dir_file = new File(dir_seed_set);
                    seed_list.addAll(List.of(Objects.requireNonNull(dir_file.list())));
                }
                res.case_name = seed_list.get(0);
                res.case_code = readStringFromFile(dir_seed_set + "/" + res.case_name);
                seed_list.remove(0);
                break;
            case FSS_TRAVERSAL_SET_MUT:
                if (seed_list.size() == 0) {
                    File dir_file_set = new File(dir_seed_set);
                    List<String> dir_seed_set_list = Stream.of(Objects.requireNonNull(dir_file_set.list())).map(x -> dir_seed_set + "/" + x).sorted().collect(Collectors.toList());
                    seed_list.addAll(dir_seed_set_list);
                    File dir_file_mut = new File(dir_seed_mutant);
                    seed_list.addAll(Stream.of(Objects.requireNonNull(dir_file_mut.list())).map(x -> dir_seed_mutant + "/" + x).collect(Collectors.toList()));
                }
                String[] file_name_split = seed_list.get(0).split("[/\\\\]");
                res.case_name = file_name_split[file_name_split.length - 1];
                res.case_code = readStringFromFile(seed_list.get(0));
                seed_list.remove(0);
                break;
            case MSS_QUEUE:
            case MSS_PRIOR_QUEUE:
                res = seed_queue.peek();
                seed_queue.update();
                break;
            case MSS_BY_EACH_SEED:
                res = seed_queue.peek();
                break;
        }
        return res;
    }

    public static void addSeed(TestCase seed) {
        switch (ss_mode) {
            case FSS_RANDOM:
            case FSS_TRAVERSAL_SET:
            case FSS_TRAVERSAL_SET_MUT:
                saveMutantCase(seed);
                break;
            case MSS_QUEUE:
            case MSS_PRIOR_QUEUE:
            case MSS_BY_EACH_SEED:
                synchronized (SeedSchedule.class) {
                    seed_queue.put(seed);
                }
                break;
        }
    }

    public static synchronized String saveCurrentSeedlist() {
        switch (ss_mode) {
            case FSS_RANDOM:
            case FSS_TRAVERSAL_SET:
            case FSS_TRAVERSAL_SET_MUT:
                break;
            case MSS_QUEUE:
            case MSS_PRIOR_QUEUE:
            case MSS_BY_EACH_SEED:
                return seed_queue.saveQueue2String();
        }
        return null;
    }

    private static String getRandomSeedFromDir(String dir) {
        File dir_file = new File(dir);
        String[] set_list = Objects.requireNonNull(dir_file.list());
        if (set_list.length == 0) {
            return null;
        } else {
            Random random = new Random();
            return set_list[random.nextInt(set_list.length)];
        }
    }
}