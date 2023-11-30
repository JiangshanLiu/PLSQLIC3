package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

public class PlPgSql9NetworkAddr {
    public static String getPlPgSqlInet() {
        Random r = new Random();
        return String.format("%d.%d.%d.%d",
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256)
        );
    }

    public static String getPlPgSqlCidr() {
        Random r = new Random();
        return String.format("%d.%d.%d.%d/%d",
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(256),
                r.nextInt(32) + 1
        );
    }

}
