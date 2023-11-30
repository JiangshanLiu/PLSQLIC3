package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util;

public class ExprWithBoolean {
    private Boolean value;
    private String expr;

    public ExprWithBoolean(Boolean value, String expr) {
        this.expr = expr;
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
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

