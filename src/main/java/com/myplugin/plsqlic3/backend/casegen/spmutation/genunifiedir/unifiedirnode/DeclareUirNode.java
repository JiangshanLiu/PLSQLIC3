package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class DeclareUirNode extends AbstractUirNode{
    public String var_name;
    public ParserRuleContext var_type;
    public ParserRuleContext var_default_val = null;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                return String.format("%s %s %s;\n",
                        var_name,
                        getFullTextByChildren(var_type),
                        var_default_val != null ? " = " + getFullTextByChildren(var_default_val) : "");
            default:
                return "";
        }
    }
}
