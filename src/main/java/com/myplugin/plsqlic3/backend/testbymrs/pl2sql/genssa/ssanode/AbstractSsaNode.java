package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

public abstract class AbstractSsaNode {
    public enum SsaNodeType {
        NODE_ASSIGN,
        NODE_GOTO,
        NODE_IFELSE,
        NODE_RETURN,
        NODE_ITERVIRTUAL,
        NODE_TRAMPLINECALL,
        NODE_TRAMPLINERETURN,
        NODE_PHI
    }

    public enum LabelType {
        // start of code
        START
        // iter label type is in class IterVirtualNode
        // if else label type is in class IfelseSsaNode
    }

    private SsaNodeType node_type;

    @Override
    public String toString(){
        return "Abstract SSA Node\n";
    }

    public SsaNodeType getNode_type() {
        return node_type;
    }

    protected void setNode_type(SsaNodeType node_type) {
        this.node_type = node_type;
    }
}
