package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

public class GotoSsaNode extends AbstractSsaNode {
    public Label goto_label;
    public SqlIdMap<String, TerminalNode> global_arg_index;

    public GotoSsaNode() {
        setNode_type(SsaNodeType.NODE_GOTO);
    }

    public GotoSsaNode(GotoSsaNode gsn) {
        setNode_type(SsaNodeType.NODE_GOTO);
        this.goto_label = gsn.goto_label;
        this.global_arg_index = gsn.global_arg_index;
    }

    public GotoSsaNode(Label goto_label) {
        setNode_type(SsaNodeType.NODE_GOTO);
        this.goto_label = goto_label;
    }

    @Override
    public String toString() {
//        return "goto " + goto_label + "    " + System.identityHashCode(this) + "\n";
        return "goto " + goto_label + "\n";
    }
}
