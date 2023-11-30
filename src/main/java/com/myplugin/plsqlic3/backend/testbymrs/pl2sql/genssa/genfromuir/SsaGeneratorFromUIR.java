package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.genfromuir;

import com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode.AbstractUirNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.SsaGenerator;

import java.util.ArrayList;

public class SsaGeneratorFromUIR extends SsaGenerator {
    @Override
    public GotoUtil getGotoUtil(Object test_case) {
        ArrayList<AbstractUirNode> test_case_nodes = (ArrayList<AbstractUirNode>) test_case;
        return null;
    }
}
