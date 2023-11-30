package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util;

import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.CaseInsensitiveMap;

import java.util.Map;

public class SqlIdMap<K, V> extends CaseInsensitiveMap<K, V> {
    public SqlIdMap() {
        super();
    }

    public SqlIdMap(int initialCapacity) {
        super(initialCapacity);
    }

    public SqlIdMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public SqlIdMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    @Override
    protected Object convertKey(Object key) {
        if (key == null) {
            return AbstractHashedMap.NULL;
        } else {
            char[] chars = key.toString().toCharArray();

            if (chars.length != 0 && chars[0] == '\"' && chars[chars.length - 1] == '\"') {
                return new String(chars);
            }

            for (int i = chars.length - 1; i >= 0; --i) {
                chars[i] = Character.toLowerCase(Character.toUpperCase(chars[i]));
            }

            return new String(chars);
        }
    }
}
