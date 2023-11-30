package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

import java.sql.DriverManager;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;


public class OracleUtil extends AbstractJDBCUtilImp {
    public OracleUtil() {
        Connect();
    }

    @Override
    public void Connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connect = DriverManager.getConnection(String.format("jdbc:oracle:thin:@//%s:%s/%s",
                            db_ip_addr,
                            db_port,
                            db_database_name),
                    db_user_name, db_password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setSchemaByFileName(String file_name) {
    }
}