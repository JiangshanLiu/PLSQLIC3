package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;
import java.util.stream.LongStream;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_money_integer_max;

public class PlPgSql2Monetary {
    public static String getPlPgSqlMoney() {
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_money_integer_max);
        return longs.toArray()[0] + "." + r.nextInt(100);
    }
}
