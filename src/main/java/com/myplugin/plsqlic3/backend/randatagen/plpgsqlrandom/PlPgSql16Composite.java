package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.PostgreSQLUtil;

import java.util.HashMap;
import java.util.List;

import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;

public class PlPgSql16Composite {
    public static void main(String[] args) {
        System.out.println(getPlPgSqlCompositeType("bodies"));
    }

    public static String getPlPgSqlCompositeType(String typname) {
        String dyn_sql = "SELECT a.attname, pg_catalog.format_type(a.atttypid, a.atttypmod) FROM pg_catalog.pg_attribute a WHERE a.attrelid = (select typrelid from pg_type where typname='" +
                typname +
                "') AND a.attnum > 0 AND NOT a.attisdropped ORDER BY a.attnum;";
        PostgreSQLUtil pg_util = new PostgreSQLUtil();
        List<HashMap<String, Object>> typresult = pg_util.Select(dyn_sql);
        pg_util.close();

        if (typresult.size() == 0) {
            return "''";
        }

        StringBuilder sb = new StringBuilder("(");
        for (HashMap<String, Object> map : typresult) {
            sb.append(getRandom(map.get("format_type").toString())).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")::").append(typname);
        return sb.toString();
    }
}
