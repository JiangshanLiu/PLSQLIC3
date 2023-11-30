package com.myplugin.plsqlic3.backend.testbymrs.livecodemut;

import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.AbstractJDBCUtil;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.PostgreSQLUtil;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdArrayList;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdLinkedMap;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecProfile {
    public final static SqlIdArrayList<String> basic_numeric = new SqlIdArrayList<>(List.of("int2", "smallint", "int", "int4", "integer", "bigint", "decimal", "numeric", "real", "float4", "float", "float8", "doubleprecision", "double precision"));
    public final static SqlIdArrayList<String> basic_character = new SqlIdArrayList<>(List.of("char", "character", "varchar", "charactervarying", "character varying", "text"));
    public final static SqlIdArrayList<String> basic_boolean = new SqlIdArrayList<>(List.of("boolean"));

    public SqlIdLinkedMap<Map.Entry<PostgreSQLParser.TypenameContext, ArrayList<String>>> profile = new SqlIdLinkedMap<>();
    public SqlIdLinkedMap<Map.Entry<PostgreSQLParser.TypenameContext, String>> arg_list = new SqlIdLinkedMap<>();
    public String func_name = "";

    private String genRaiseNoticeStmt() {
        String US = new String(new byte[]{0x1F}, StandardCharsets.UTF_8);
        String sep = " = %" + US;
        return String.format("RAISE NOTICE '%s%s', %s;",
                String.join(sep, profile.keySet()),
                sep,
                String.join(", ", profile.keySet()));
    }

    private String getRawNotices(String plsql_with_pos) {
        String STX = new String(new byte[]{0x02}, StandardCharsets.UTF_8);
        String ETX = new String(new byte[]{0x03}, StandardCharsets.UTF_8);
        return plsql_with_pos.replace(STX, genRaiseNoticeStmt()).replace(ETX, "");
    }

    private void parseProfile(HashSet<String> notice_set) {
        HashMap<String, String> tmp_map = new HashMap<>();
        String US = new String(new byte[]{0x1F}, StandardCharsets.UTF_8);
        for (String notice : notice_set) {
            Pattern pattern = Pattern.compile("(.+?)\\s=\\s(.+?)" + US);
            Matcher matcher = pattern.matcher(notice);
            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                tmp_map.put(key, value);
            }
            if (profile.size() == tmp_map.size()) {
                for (String var : tmp_map.keySet()) {
                    Objects.requireNonNull(profile.get(var)).getValue().add(tmp_map.get(var));
                }
            }
            tmp_map.clear();
        }
    }

    public String callFunc(){
        StringBuffer sb = new StringBuffer();
        for (String arg : arg_list.keySet()) {
            sb.append(Objects.requireNonNull(arg_list.get(arg)).getValue()).append(", ");
        }
        if (arg_list.size() != 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return String.format("select * from %s(%s);",
                func_name,
                sb);
    }

    public void execProfile(String plsql_with_pos, String file_name) {
        AbstractJDBCUtil jdbcUtil = new PostgreSQLUtil();
        jdbcUtil.setSchemaByFileName(file_name);

        jdbcUtil.Select(getRawNotices(plsql_with_pos));

        parseProfile(jdbcUtil.ExecuteWithNotice(callFunc()));

        jdbcUtil.close();
    }
}
