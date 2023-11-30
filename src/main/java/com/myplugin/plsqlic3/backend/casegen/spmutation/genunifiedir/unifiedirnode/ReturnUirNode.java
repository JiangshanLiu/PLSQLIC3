package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class ReturnUirNode extends AbstractUirNode {
    public ParserRuleContext ret_val = null;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                return String.format("RETURN%s;\n",
                        ret_val != null ? " " + getFullTextByChildren(ret_val) : "");
            default:
                return "";
        }
    }
}
