package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class WhileUirNode extends AbstractUirNode {
    public ParserRuleContext loop_cond;
    public ArrayList<AbstractUirNode> loop_body;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                StringBuffer sb = new StringBuffer();
                sb.append("WHILE ").append(getFullTextByChildren(loop_cond)).append(" LOOP \n")
                        .append(String.join("\n", loop_body.stream().map(node -> node.toString()).toArray(String[]::new)))
                        .append("END LOOP;\n");
                return sb.toString();
            default:
                return "";
        }
    }
}
