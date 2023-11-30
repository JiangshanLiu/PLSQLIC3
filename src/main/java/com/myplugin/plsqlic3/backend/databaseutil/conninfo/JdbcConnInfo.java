package com.myplugin.plsqlic3.backend.databaseutil.conninfo;

import com.myplugin.plsqlic3.backend.runnable.DatabaseType;

public class JdbcConnInfo {
    private final DatabaseType db_type;
    private final String db_user_name;
    private final String db_password;
    private final String db_ip_addr;
    private final String db_port;
    private final String db_database_name;
    private final String db_schema;

    public JdbcConnInfo(DatabaseType dbType,
                        String dbUserName,
                        String dbPassword,
                        String dbIpAddr,
                        String dbPort,
                        String dbDatabaseName,
                        String dbSchema) {
        db_type = dbType;
        db_user_name = dbUserName;
        db_password = dbPassword;
        db_ip_addr = dbIpAddr;
        db_port = dbPort;
        db_database_name = dbDatabaseName;
        db_schema = dbSchema;
    }

    public DatabaseType getDb_type() {
        return db_type;
    }

    public String getDb_user_name() {
        return db_user_name;
    }

    public String getDb_password() {
        return db_password;
    }

    public String getDb_ip_addr() {
        return db_ip_addr;
    }

    public String getDb_port() {
        return db_port;
    }

    public String getDb_database_name() {
        return db_database_name;
    }

    public String getDb_schema() {
        return db_schema;
    }
}
