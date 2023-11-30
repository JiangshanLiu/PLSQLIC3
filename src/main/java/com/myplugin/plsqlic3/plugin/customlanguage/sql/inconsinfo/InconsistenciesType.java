package com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo;

public enum InconsistenciesType {
    FOR_LOOP_LOWER_BOUND_NONINT("Non-integer lower boundary '%s' may cause inconsistency"),
    FOR_LOOP_UPPER_BOUND_NONINT("Non-integer upper boundary '%s' may cause inconsistency"),
    CHAR_PARAM_DIRECT_USE("Using of parameter '%s' with CHAR type may cause inconsistency");

    private final String inconsTipTmplt;

    InconsistenciesType(String outputString) {
        this.inconsTipTmplt = outputString;
    }

    public String getInconsTipTmplt() {
        return inconsTipTmplt;
    }
}
