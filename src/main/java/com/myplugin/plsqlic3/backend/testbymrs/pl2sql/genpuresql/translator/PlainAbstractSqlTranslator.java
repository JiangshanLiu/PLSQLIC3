package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;

import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.NODE_IFELSE;

public abstract class PlainAbstractSqlTranslator {
    TrampolinedAnfUtil trpl_anf_util;
    //    SqlIdMap<String, String> arg_vals;
    boolean if_trmpl_in_ifelse = false;

    public PlainAbstractSqlTranslator(TrampolinedAnfUtil trpl_anf_util) {
        this.trpl_anf_util = trpl_anf_util;
        for (AbstractSsaNode asn : trpl_anf_util.start_func.block) {
            if (asn.getNode_type() == NODE_IFELSE) {
                if_trmpl_in_ifelse = true;
                break;
            }
        }
//        if (!fuzz_or_debug && conversion_only) {
//            arg_vals = getArgVals(trpl_anf_util.func_info);
//        }
    }
}
