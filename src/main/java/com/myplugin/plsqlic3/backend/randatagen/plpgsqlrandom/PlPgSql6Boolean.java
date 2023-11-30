package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

public class PlPgSql6Boolean {
    public static String getPlPgSqlBoolean() {
        Random r = new Random();
        boolean bool = r.nextBoolean();
        return String.valueOf(bool);
    }
}
