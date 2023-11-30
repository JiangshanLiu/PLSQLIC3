package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

public class PlPgSql19ObjectId {
    public static String getPlPgSqlOid() {
        Random r = new Random();
        int num = r.nextInt();
        return String.valueOf(Math.abs(num));
    }
}
