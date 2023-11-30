package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class IfelseUirNode extends AbstractUirNode {
    public LinkedHashMap<ParserRuleContext, ArrayList<AbstractUirNode>> ifelse_map = new LinkedHashMap<>();

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                StringBuffer sb = new StringBuffer();
                for (ParserRuleContext ifelse_branch : ifelse_map.keySet()) {
                    if (ifelse_branch != null) {
                        sb.append("IF ").append(getFullTextByChildren(ifelse_branch)).append(" THEN ")
                                .append(String.join("\n", ifelse_map.get(ifelse_branch).stream().map(node -> node.toString()).toArray(String[]::new)));
                    } else {
                        sb.append("ELSE ")
                                .append(String.join("\n", ifelse_map.get(ifelse_branch).stream().map(node -> node.toString()).toArray(String[]::new)));
                    }
                    sb.append("\nEND IF;\n");
                }
            default:
                return "";
        }
    }
}
