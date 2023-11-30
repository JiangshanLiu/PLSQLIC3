package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_bit_default_length_max;

public class PlPgSql10BitString {
    public static String getPlPgSqlBit(int n) {
        if (n < 0) {
            Random r = new Random();
            n = r.nextInt(rdm_bit_default_length_max);
        }
        return "B'" + RandomStringUtils.random(n, 0x0030, 0x0032, false, false) + "'";
    }

    public static String getPlPgSqlBitVarying(int n) {
        if (n < 0) {
            Random r = new Random();
            n = r.nextInt(rdm_bit_default_length_max);
        }
        Random r = new Random();
        int num = r.nextInt(n);
        return "B'" + RandomStringUtils.random(num, 0x0030, 0x0032, false, false) + "'";
    }
}
