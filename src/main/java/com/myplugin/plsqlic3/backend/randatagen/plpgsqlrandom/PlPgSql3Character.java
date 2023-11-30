package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;

/**
 * 名字										描述
 * character varying(n), varchar(n)		有限制的变长
 * character(n), char(n)				定长，空格填充
 * text									无限变长
 */
public class PlPgSql3Character {
    public static String getPlPgSqlCharacterVarying(int n) {
        if (n <= 0) {
            Random r = new Random();
            n = r.nextInt(rdm_char_default_length_max) + 1;
        }
        Random r = new Random();
        int num = r.nextInt(n);
        double p = r.nextDouble();
        if (p <= ascii_letter) {
            return "varchar '" + RandomStringUtils.random(num, 0, 127, true, true) + "'";
        } else {
            return "varchar '" + RandomStringUtils.random(num, rdm_char_start, rdm_char_end, true, true) + "'";
        }
    }

    public static String getPlPgSqlCharacter(int n) {
        if (n <= 0) {
            Random r = new Random();
            n = r.nextInt(rdm_char_default_length_max) + 1;
        }
        Random r = new Random();
        int num = r.nextInt(n);
        double p = r.nextDouble();
        if (p <= ascii_letter) {
            return "'" + RandomStringUtils.random(num, 0, 127, true, true) + "'";
        } else {
            return "'" + RandomStringUtils.random(num, rdm_char_start, rdm_char_end, true, true) + "'";
        }
    }

    public static String getPlPgSqlText() {
        Random r = new Random();
        int num = r.nextInt(rdm_text_length_max);
        double p = r.nextDouble();
        String generatedString;
        if (p <= ascii_letter) {
            generatedString = RandomStringUtils.random(num, 0, 127, true, true);
        } else {
            generatedString = RandomStringUtils.random(num, rdm_char_start, rdm_char_end, true, true);
        }
        return "'" + generatedString + "'::text";
    }
}
