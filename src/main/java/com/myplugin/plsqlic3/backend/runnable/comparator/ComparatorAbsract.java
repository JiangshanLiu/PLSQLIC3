package com.myplugin.plsqlic3.backend.runnable.comparator;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResStateWithRes;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.util.HashMap;
import java.util.List;

public abstract class ComparatorAbsract {

    public abstract List<HashMap<String, Object>> testSQLWithDetail(String eq_sql, SqlIdMap<String, String> arg_vals);

    public abstract SQLResState testSQL(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals);

    public abstract SQLResStateWithRes testSQLWithRes(TestCase test_case, String eq_sql, Object aux, SqlIdMap<String, String> arg_vals);

    public SQLResState testSQL(TestCase test_case, String eq_sql, Object aux) {
        return testSQL(test_case, eq_sql, aux, null);
    }

    protected boolean compareResult
            (List<HashMap<String, Object>> select_plsql, List<HashMap<String, Object>> select_sql) {
        // to solve problem in
        // BUG #17860: Possible Bugs in PL/pgSQL Functions' Return Values
        // https://www.postgresql.org/message-id/flat/17860-3e3a34519be852ad%40postgresql.org
//        if (select_plsql.size() == 0 && select_sql.size() == 1
//                && select_sql.get(0).values().size() == 1 && select_sql.get(0).containsValue(null)) {
//            return true;
//        }
        if (select_plsql.size() != select_sql.size()) {
            return false;
        }
        for (int i = 0; i < select_plsql.size(); i++) {
            if (!compareUnitResult(select_plsql.get(i), select_sql.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean compareUnitResult
            (HashMap<String, Object> select_plsql_unit, HashMap<String, Object> select_sql_unit) {
        for (String str : select_plsql_unit.keySet()) {
            if (!compareObjectResult(select_plsql_unit.get(str), select_sql_unit.get(str))) {
                return false;
            }
        }
        return true;
    }

    private boolean compareObjectResult(Object select_plsql_obj, Object select_sql_obj) {
//        System.out.println(select_plsql_obj.getClass().getName());
//        System.out.println(select_plsql_obj);
//        System.out.println(select_sql_obj.getClass().getName());
//        System.out.println(select_sql_obj);
        if (select_plsql_obj == null && select_sql_obj == null) {
            return true;
        } else if (select_plsql_obj != null && select_sql_obj != null) {
            if (select_plsql_obj.getClass().getName().equals("[B") || select_sql_obj.getClass().getName().equals("[B")) {
                byte[] bytea_plsql = (byte[]) select_plsql_obj;
                byte[] bytea_sql = (byte[]) select_sql_obj;
                if (bytea_plsql.length != bytea_sql.length) {
                    return false;
                }
                for (int byte_index = 0; byte_index < bytea_plsql.length; byte_index++) {
                    if (bytea_plsql[byte_index] != bytea_sql[byte_index]) {
                        return false;
                    }
                }
                return true;
            } else {
                return select_plsql_obj.getClass().getName().equals(select_sql_obj.getClass().getName())
                        && select_plsql_obj.toString().equals(select_sql_obj.toString());
            }
        } else {
            return false;
        }
    }
}
