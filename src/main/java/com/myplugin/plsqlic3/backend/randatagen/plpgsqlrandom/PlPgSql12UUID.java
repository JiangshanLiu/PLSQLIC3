package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

public class PlPgSql12UUID {
    private static final String[] byte_hex = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f"};

    public static String getPlPgSqlUUID() {
        StringBuilder sb = new StringBuilder("UUID '");
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            sb.append(byte_hex[r.nextInt(byte_hex.length)]);
        }
        sb.append("-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sb.append(byte_hex[r.nextInt(byte_hex.length)]);
            }
            sb.append("-");
        }
        for (int i = 0; i < 12; i++) {
            sb.append(byte_hex[r.nextInt(byte_hex.length)]);
        }
        sb.append("'");
        return sb.toString();
    }
}
