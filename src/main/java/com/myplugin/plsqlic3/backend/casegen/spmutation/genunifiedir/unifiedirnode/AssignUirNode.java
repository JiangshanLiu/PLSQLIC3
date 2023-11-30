package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class AssignUirNode extends AbstractUirNode {
    public ParserRuleContext identifier;
    public ParserRuleContext expression;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
                return getFullTextByChildren(identifier) + " = " + getFullTextByChildren(expression) + ";\n";
            case MYSQL:
                return "SET " + getFullTextByChildren(identifier) + " = " + getFullTextByChildren(expression) + ";\n";
            default:
                return "";
        }
    }
}
