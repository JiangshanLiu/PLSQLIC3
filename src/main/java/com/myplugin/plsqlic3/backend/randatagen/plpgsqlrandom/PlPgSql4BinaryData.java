package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_byyea_length_max;

public class PlPgSql4BinaryData {
    private static final String[] byte_hex = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f"};

    public static String getPlPgSqlBytea() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder("bytea '/x");
        for (int i = 2 * r.nextInt(rdm_byyea_length_max); i >= 0; i--) {
            sb.append(byte_hex[r.nextInt(byte_hex.length)]);
        }
        sb.append("'");
        return sb.toString();
    }
}
