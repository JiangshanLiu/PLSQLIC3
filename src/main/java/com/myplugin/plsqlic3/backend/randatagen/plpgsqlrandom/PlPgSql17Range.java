package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_numrange_default_lower_bound_max;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_numrange_default_upper_bound_max;

public class PlPgSql17Range {
    public static String getPlPgSqlNumrange() {
        Random r = new Random();
        int lower_bound = r.nextInt(rdm_numrange_default_lower_bound_max) + 1;
        int upper_bound = lower_bound + r.nextInt(rdm_numrange_default_upper_bound_max) + 1;
        return String.format("'%s%d,%d%s'",
                r.nextBoolean() ? "(" : "[",
                lower_bound,
                upper_bound,
                r.nextBoolean() ? ")" : "]"
        );
    }
}
