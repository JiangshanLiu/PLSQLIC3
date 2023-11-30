package com.myplugin.plsqlic3.backend.casegen.gramgeneration;

import com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramInfo;
import com.myplugin.plsqlic3.backend.casegen.util.CaseGenerator;
import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

public class CaseGenByGramGeneration extends CaseGenerator {
    @Override
    public TestCase genTestCase() {
        return null;
    }

    @Override
    public TestCase genTestCase(String seed_name) {
        return null;
    }

    private static TestCase genTestCaseByGeneration() {
        return null;
    }

    public static void main(String[] args) {
//        System.out.println(gram_info.toString());
//        System.out.println(GramNodeTerminal.strKW);

        GramInfo gram_info = new GramInfo();
        System.out.println(gram_info.getCode("a_expr"));
    }
}
