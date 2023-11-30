package com.myplugin.plsqlic3.backend.databaseutil.conninfo;

import static com.myplugin.plsqlic3.backend.runnable.DatabaseType.*;

public class CandidateConnInfo {
    public static JdbcConnInfo pg_info = new JdbcConnInfo(
            POSTGRES,
            "testplsql",
            "testplsql",
            "211.81.52.44",
            "5440",
            "testdb",
            "");

    public static JdbcConnInfo pg_withoutrebuild_info = new JdbcConnInfo(
            POSTGRES,
            "testplsql",
            "testplsql",
            "211.81.52.44",
            "5441",
            "testdb",
            "");

    public static JdbcConnInfo pg_emi_info = new JdbcConnInfo(
            POSTGRES,
            "testplsql",
            "testplsql",
            "211.81.52.44",
            "5442",
            "testdb",
            "");

    public static JdbcConnInfo pg_cov_info = new JdbcConnInfo(
            POSTGRES,
            "testplsql",
            "testplsql",
            "211.81.52.44",
            "5443",
            "testdb",
            "");

    public static JdbcConnInfo gs_info = new JdbcConnInfo(
            GAUSSDB,
            "testplsql",
            "Gauss@123",
            "211.81.52.44",
            "5531",
            "testdb",
            "");

    public static JdbcConnInfo orcl_info = new JdbcConnInfo(
            ORACLE,
            "OT",
            "123456",
            "211.81.52.44",
            "1521",
            "ORCLPDB",
            "");

    public static JdbcConnInfo tmp_gs_info = new JdbcConnInfo(
            GAUSSDB,
            "gaussdb",
            "Gauss@123",
            "211.81.52.44",
            "15432",
            "test",
            "");
}
