package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

public class TrampolineReturnSsaNode extends AbstractSsaNode {
    public TrampolineReturnSsaNode() {
        setNode_type(SsaNodeType.NODE_TRAMPLINERETURN);
    }

    @Override
    public String toString() {
        return "return res\n";
    }
}
