package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class CaseUirNode extends AbstractUirNode {
    public ParserRuleContext switch_var = null;
    public LinkedHashMap<ParserRuleContext, ArrayList<AbstractUirNode>> case_map = new LinkedHashMap<>();

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
                StringBuilder sb = new StringBuilder();
                sb.append("CASE\n");
                for (ParserRuleContext case_branch : case_map.keySet()) {
                    if (case_branch != null) {
                        sb.append("WHEN ").append(getFullTextByChildren(case_branch)).append(" THEN ")
                                .append(String.join("\n", case_map.get(case_branch).stream().map(node -> node.toString()).toArray(String[]::new)));
                    } else {
                        sb.append("ELSE ")
                                .append(String.join("\n", case_map.get(case_branch).stream().map(node -> node.toString()).toArray(String[]::new)));
                    }
                    sb.append("\n");
                }
                return sb.toString();
            case MYSQL:
            default:
                return "";
        }
    }
}
