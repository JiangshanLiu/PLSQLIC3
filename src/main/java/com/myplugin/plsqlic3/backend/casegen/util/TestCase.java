package com.myplugin.plsqlic3.backend.casegen.util;

public class TestCase {
    public String case_name;
    public Object case_code;

    public TestCase() {
        this.case_name = null;
        this.case_code = null;
    }

    public TestCase(String case_name, Object case_code) {
        this.case_name = case_name;
        this.case_code = case_code;
    }
}
