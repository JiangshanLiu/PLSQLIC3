package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

public class PlPgSql8Geometric {
    public static String getPlPgSqlPoint() {
        Random r = new Random();
        return String.format("point(%f, %f)",
                r.nextDouble(),
                r.nextDouble());
    }
}
