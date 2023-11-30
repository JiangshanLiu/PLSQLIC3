package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_anyarray_length_max;

public class PlPgSql21Pseudo {
    private static final String[] type_list = new String[]{"int", "double precision", "char", "boolean"};

    public static String getPlPgSqlAnyarray() {
        Random r = new Random();
        int len = r.nextInt(rdm_anyarray_length_max);
        String type = type_list[r.nextInt(type_list.length)];
        StringBuilder sb = new StringBuilder("ARRAY[");
        for (int i = 0; i < len; i++) {
            sb.append(getRandom(type)).append(",");
        }
        if (len > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    public static String getPlPgSqlAnyelement() {
        Random r = new Random();
        return getRandom(type_list[r.nextInt(type_list.length)]);
    }

    public static String getPlPgSqlAnynonarray() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return getPlPgSqlAnyarray();
        } else {
            return getPlPgSqlAnyelement();
        }
    }

    // can not rebuild record
    public static String getPlPgSqlRecord() {
        return "";
    }
}
