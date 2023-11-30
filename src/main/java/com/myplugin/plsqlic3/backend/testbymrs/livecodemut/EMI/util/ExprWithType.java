package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util;

import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;

public class ExprWithType {
    private PostgreSQLParser.TypenameContext type;
    private String expr;

    public ExprWithType(PostgreSQLParser.TypenameContext type, String expr) {
        this.type = type;
        this.expr = expr;
    }

    public PostgreSQLParser.TypenameContext getType() {
        return type;
    }

    public void setType(PostgreSQLParser.TypenameContext type) {
        this.type = type;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return expr;
    }
}
