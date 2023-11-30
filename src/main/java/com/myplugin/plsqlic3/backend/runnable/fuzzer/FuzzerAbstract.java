package com.myplugin.plsqlic3.backend.runnable.fuzzer;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.CaseGenByTkMutation;
import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.casegen.util.CaseGenerator;

public abstract class FuzzerAbstract {
    static final Object lock = new Object();
    static Integer round = 1;
    static int[] state_counter = new int[]{0, 0, 0, 0};
    static CaseGenerator generator = new CaseGenByTkMutation();

    public void fuzz() {
        fuzzByCase(generator.genTestCase());
    }

    public void fuzz(String file_name) {
        fuzzByCase(generator.genTestCase(file_name));
    }

    protected abstract void fuzzByCase(TestCase test_case);
}
