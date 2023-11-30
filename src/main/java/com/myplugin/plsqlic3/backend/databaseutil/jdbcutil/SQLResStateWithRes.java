package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

public class SQLResStateWithRes {
    public SQLResState sqlResState;
    public SelectResWithMsg plsql_res;
    public SelectResWithMsg sql_res;

    public SQLResStateWithRes(SQLResState sqlResState, SelectResWithMsg plsql_res, SelectResWithMsg sql_res) {
        this.sqlResState = sqlResState;
        this.plsql_res = plsql_res;
        this.sql_res = sql_res;
    }
}
