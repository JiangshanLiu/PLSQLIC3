package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

import java.util.HashMap;
import java.util.List;

public class SelectResWithMsg {
    public List<HashMap<String, Object>> select_res;
    public String exception_msg;

    public SelectResWithMsg(List<HashMap<String, Object>> select_res, String exception_msg) {
        this.select_res = select_res;
        this.exception_msg = exception_msg;
    }
}
