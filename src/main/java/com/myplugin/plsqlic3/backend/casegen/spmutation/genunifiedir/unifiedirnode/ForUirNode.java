package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class ForUirNode extends AbstractUirNode {
    public ParserRuleContext loop_var;
    public ParserRuleContext loop_low_bound = null;
    public ParserRuleContext loop_up_bound = null;
    public ParserRuleContext loop_select = null;
    public ArrayList<AbstractUirNode> loop_body;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                return String.format("FOR %s IN %s LOOP \n%s\nEND LOOP;\n",
                        getFullTextByChildren(loop_var),
                        loop_select != null ? getFullTextByChildren(loop_select) :
                                String.format("%s .. %s",
                                        getFullTextByChildren(loop_low_bound),
                                        getFullTextByChildren(loop_up_bound)),
                        String.join("\n", loop_body.stream().map(node -> node.toString()).toArray(String[]::new))
                );
            default:
                return "";
        }
    }
}
