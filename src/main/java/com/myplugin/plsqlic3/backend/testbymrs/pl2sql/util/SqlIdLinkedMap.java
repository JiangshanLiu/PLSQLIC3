package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util;

import org.springframework.util.LinkedCaseInsensitiveMap;

public class SqlIdLinkedMap<V> extends LinkedCaseInsensitiveMap<V> {
    @Override
    protected String convertKey(String key) {
        if (key.length() != 0 && key.charAt(0) == '\"' && key.charAt(key.length() - 1) == '\"') {
            return key;
        }
        return key.toLowerCase(this.getLocale());
    }
}
