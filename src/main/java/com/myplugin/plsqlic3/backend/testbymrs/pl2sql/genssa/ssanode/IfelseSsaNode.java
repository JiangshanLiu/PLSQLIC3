package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import org.antlr.v4.runtime.ParserRuleContext;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.ArrayList;
import java.util.HashMap;

public class IfelseSsaNode extends AbstractSsaNode {
    public enum IfelseLabelType {
        IFELSE_THEN,
        IFELSE_ELSE,
        IFELSE_MEET
    }

    public ParserRuleContext condition;
    public ArrayList<AbstractSsaNode> then_block;
    public ArrayList<AbstractSsaNode> else_block;

    public HashMap<IfelseLabelType, Label> label_list = new HashMap<>();

//    public IfelseSsaNode() {
//        setNode_type(SsaNodeType.NODE_IFELSE);
//    }
//
//    public IfelseSsaNode(ParserRuleContext condition) {
//        setNode_type(SsaNodeType.NODE_IFELSE);
//        this.condition = condition;
//    }

    public IfelseSsaNode(ParserRuleContext condition, AbstractSsaNode then_stmt, AbstractSsaNode else_stmt) {
        setNode_type(SsaNodeType.NODE_IFELSE);
        then_block = new ArrayList<>();
        else_block = new ArrayList<>();
        this.condition = condition;
        this.then_block.add(then_stmt);
        this.else_block.add(else_stmt);
    }

    public IfelseSsaNode(ParserRuleContext condition, ArrayList<AbstractSsaNode> then_block, ArrayList<AbstractSsaNode> else_block) {
        setNode_type(SsaNodeType.NODE_IFELSE);
        this.condition = condition;
        this.then_block = then_block;
        this.else_block = else_block;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("if ").append(condition.getText()).append("\n");
        for (AbstractSsaNode asn : then_block) {
            sb.append(appendPrefixToEachLine(asn.toString()));
        }
        sb.append("else").append("\n");
        for (AbstractSsaNode asn : else_block) {
            sb.append(appendPrefixToEachLine(asn.toString()));
        }
        return sb.toString();
    }

    private String appendPrefixToEachLine(String s) {
        String ret = "\t" + s.replaceAll("(\r\n|\n)", "$1" + "\t");
        return ret.substring(0, ret.length() - "\t".length());
    }
}
