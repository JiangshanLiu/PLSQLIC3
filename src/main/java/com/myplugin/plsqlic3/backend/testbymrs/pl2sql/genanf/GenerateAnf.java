package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;

public class GenerateAnf {
    public static AnfUtil getAnfUtil(GotoUtil goto_util){
        FunctionAnfNode.pl_all_vars.get().clear();
        return (new AnfUtil(goto_util));
    }
}
