package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import org.antlr.v4.runtime.ParserRuleContext;

public class AssignSsaNode extends AbstractSsaNode {
    public ParserRuleContext identifier;
    public ParserRuleContext expression;
    public AssignExprType assign_type;

//    public AssignSsaNode() {
//        setNode_type(SsaNodeType.NODE_ASSIGN);
//    }

    public AssignSsaNode(ParserRuleContext ctx_idn, ParserRuleContext ctx_expr, AssignExprType assign_type) {
        setNode_type(SsaNodeType.NODE_ASSIGN);
        this.identifier = ctx_idn;
        this.expression = ctx_expr;
        this.assign_type = assign_type;
    }

    @Override
    public String toString() {
        return identifier.getText() + " = " + expression.getText() + "\n";
    }
}
