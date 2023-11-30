package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;

public class PostgreSQLUtil extends AbstractJDBCUtilImp {
    public PostgreSQLUtil() {
        Connect();
    }

    /**
     * Connect to PostgreSQL database
     * The parameters of the connection are defined in runnable/GlobalConfig.java
     */
    @Override
    public void Connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(
                    String.format("jdbc:postgresql://%s:%s/%s%s",
                            db_ip_addr,
                            db_port,
                            db_database_name,
                            db_schema.equals("") ? "" : "?currentSchema=" + db_schema),
                    db_user_name,
                    db_password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Mechanisms in fuzzing
     * Dividing SQL files into individual schemas
     * Select the corresponding schema by SQL file name
     *
     * @param file_name SQL file name
     */
    @Override
    public void setSchemaByFileName(String file_name) {
        String schema = "schema" + file_name.substring(0, 4);
        String schema_query = "SELECT n.nspname AS \"Name\"\n" +
                "FROM pg_catalog.pg_namespace n\n" +
                "WHERE n.nspname !~ '^pg_' AND n.nspname <> 'information_schema'";
        boolean has_default_schema = false;
        for (HashMap<String, Object> map : this.Select(schema_query)) {
            if (map.get("Name").toString().equals(schema)) {
                has_default_schema = true;
            }
        }
        try {
            if (has_default_schema) {
                this.connect.setSchema(schema);
            } else {
                this.connect.setSchema("public");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}