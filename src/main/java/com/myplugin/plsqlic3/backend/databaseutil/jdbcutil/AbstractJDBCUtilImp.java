package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_uptime;

public abstract class AbstractJDBCUtilImp implements AbstractJDBCUtil {
    protected Connection connect;

    @Override
    public abstract void Connect();

    /**
     * Get the result returned by SELECT statement execution
     *
     * @param sql SQL statement
     * @return query result, each element in the list is a row in the table
     */
    @Override
    public List<HashMap<String, Object>> Select(String sql) {
        Connection c = this.connect;
        Statement stmt;
        List<HashMap<String, Object>> list = new ArrayList<>();
        try {
            stmt = c.createStatement();
            if (db_uptime != 0) {
                stmt.setQueryTimeout(db_uptime);
            }
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String name = metaData.getColumnName(i);
                    Object object = rs.getObject(i);
                    map.put(name, object);
                }
                list.add(map);
            }
            rs.close();
            stmt.close();
        } catch (SQLException throwable) {
            if (!throwable.getMessage().startsWith("查询没有传回任何结果。")) {
//                throwable.printStackTrace();
            }
        }
        return list;
    }

    /**
     * Get the result and exception message returned by SELECT statement execution
     *
     * @param sql SQL statement
     * @return query result with exception message
     */
    @Override
    public SelectResWithMsg SelectWithExcep(String sql) {
        Connection c = this.connect;
        Statement stmt;
        List<HashMap<String, Object>> list = new ArrayList<>();
        try {
            stmt = c.createStatement();
            if (db_uptime != 0) {
                stmt.setQueryTimeout(db_uptime);
            }
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                HashMap<String, Object> map = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String name = metaData.getColumnName(i);
                    Object object = rs.getObject(i);
                    map.put(name, object);
                }
                list.add(map);
            }
            rs.close();
            stmt.close();
        } catch (SQLException throwable) {
            if (!throwable.getMessage().startsWith("查询没有传回任何结果。")) {
//                throwable.printStackTrace();
                return new SelectResWithMsg(list, throwable.getMessage());
            }
        }
        return new SelectResWithMsg(list, "");
    }

    /**
     * Get the string printed by the RAISE NOTICE statements
     *
     * @param sql SQL statement
     * @return The set of strings printed by the "RAISE NOTICE" statement
     * Each RAISE NOTICE statement prints a String
     */
    @Override
    public HashSet<String> ExecuteWithNotice(String sql) {
//        try {
//            CallableStatement cs = connect.prepareCall(sql);
//            cs.registerOutParameter(1, Types.INTEGER);
//            cs.execute();
//            return cs.getString(1);
//        } catch (Exception ignore) {
//            ignore.printStackTrace();
//        }
//        return null;

        HashSet<String> res = new HashSet<>();
        Connection c = this.connect;
        Statement stmt;
        try {
            stmt = c.createStatement();
            if (db_uptime != 0) {
                stmt.setQueryTimeout(db_uptime);
            }
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
            }
            SQLWarning warn = stmt.getWarnings();
            if (warn != null) {
                for (Throwable e : warn) {
                    res.add(e.getMessage());
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException ignored) {
        }
        return res;
    }

    /**
     * Inserting data into a table
     *
     * @param sql SQL statement
     * @return Whether data was inserted into the table
     */
    @Override
    public Boolean Insert(String sql) {
        Connection c = this.connect;
        Statement stmt;
        int count = 0;
        try {
            c.setAutoCommit(false);
            stmt = c.createStatement();
            if (db_uptime != 0) {
                stmt.setQueryTimeout(db_uptime);
            }
            count = stmt.executeUpdate(sql);
            c.commit();
            stmt.close();
        } catch (SQLException ignored) {
        }
        return count != 0;
    }

    /**
     * Deleting data in a table
     *
     * @param sql SQL statement
     */
    @Override
    public void Delete(String sql) {
        Connection c = this.connect;
        Statement stmt;
        try {
            c.setAutoCommit(false);
            stmt = c.createStatement();
            if (db_uptime != 0) {
                stmt.setQueryTimeout(db_uptime);
            }
            stmt.executeUpdate(sql);
            c.commit();
            stmt.close();
        } catch (SQLException throwable) {
//            throwable.printStackTrace();
        }
    }

    @Override
    public abstract void setSchemaByFileName(String file_name);

    /**
     * Close connection of database
     */
    @Override
    public void close() {
        try {
            connect.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
