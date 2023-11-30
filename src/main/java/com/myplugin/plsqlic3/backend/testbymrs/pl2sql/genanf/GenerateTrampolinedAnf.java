package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.TrampolineCallSsaNode;

import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil.sql_debug_counter;

public class GenerateTrampolinedAnf {
    public static TrampolinedAnfUtil getTrampolinedAnfUtil(AnfUtil anf_util) {
        TrampolineCallSsaNode.trpl_func_name.set("");
        TrampolineCallSsaNode.trpl_args_name.get().clear();
        sql_debug_counter.set(0);
        return new TrampolinedAnfUtil(anf_util);
    }
}
