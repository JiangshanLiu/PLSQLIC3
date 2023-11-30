package com.myplugin.plsqlic3.middleware.data.inconsistency;

public class AbstractInconsistencyData {
    String source_code;

    protected String getLineCode(int line) {
        return source_code.split("\n")[line - 1];
    }

    protected String getPositionString(int start_index, int stop_index, int line) {
        String[] strs = source_code.split("\n");
        int sum = 0;
        for (int i = 0; i < strs.length; ++i) {
            if (line > i + 1) {
                sum += strs[i].length() + 1;
            }
        }
        if (start_index >= sum) {
            return " ".repeat(start_index - sum + 1) + "^".repeat(stop_index - start_index + 1);
        } else {
            return " ".repeat(start_index) + "^".repeat(stop_index - start_index + 1);
        }
    }
}
