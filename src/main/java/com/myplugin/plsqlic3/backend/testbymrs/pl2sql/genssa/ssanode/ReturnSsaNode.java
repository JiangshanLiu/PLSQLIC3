package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

public class ReturnSsaNode extends AbstractSsaNode {
    public boolean has_ret_value;
    public ParserRuleContext ret_expr;
    public SqlIdMap<String, TerminalNode> global_arg_index;

    public ReturnSsaNode() {
        setNode_type(SsaNodeType.NODE_RETURN);
    }

    @Override
    public String toString() {
        if (has_ret_value) {
            return "return " + ret_expr.getText() + "\n";
        } else {
            return "return " + "\n";
        }
    }
}
