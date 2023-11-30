package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedHashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class FuncSignUirNode extends AbstractUirNode {
    public String func_name;
    public String full_func_name;
    public LinkedHashMap<TerminalNode, ParserRuleContext> arg_list = new LinkedHashMap<>();
    public ParserRuleContext ret_type;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                return String.format("CREATE OR REPLACE FUNCTION %s (%s) RETURNS %s AS $$\n",
                        full_func_name,
                        String.join(", ", arg_list.keySet().stream().map(node -> getFullTextByChildren(node) + " " + getFullTextByChildren(arg_list.get(node))).toArray(String[]::new)),
                        getFullTextByChildren(ret_type));
            default:
                return "";
        }
    }
}
