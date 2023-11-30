package com.myplugin.plsqlic3.middleware.data;

import javax.swing.table.DefaultTableModel;

public class InfoData {
    public String file_name;
    public String if_execution_inconsistent;
    public String if_potential_inconsistent;
    public String plsql_res;
    public String sql_res;

    public static final String[] tmpHeaderMetaData = {"key", "value"};
    public String[][] tmpTableData;
    public DefaultTableModel tableModel;
    public static DefaultTableModel emptyTableModel = new DefaultTableModel(new String[][]{
            {"File", ""},
            {"Static inconsistency", ""},
            {"Dynamic inconsistency", ""},
            {"Result of PL/SQL", ""},
            {"Result of SQL", ""}
    },
            tmpHeaderMetaData) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public InfoData(String file_name,
                    String if_execution_inconsistent,
                    String if_potential_inconsistent,
                    String plsql_res,
                    String sql_res) {
        this.file_name = file_name;
        this.if_execution_inconsistent = if_execution_inconsistent;
        this.if_potential_inconsistent = if_potential_inconsistent;
        this.plsql_res = plsql_res;
        this.sql_res = sql_res;

        tmpTableData = new String[][]{
                {"File", this.file_name},
                {"Static inconsistency", String.valueOf(this.if_potential_inconsistent)},
                {"Dynamic inconsistency", String.valueOf(this.if_execution_inconsistent)},
                {"Result of PL/SQL", this.plsql_res},
                {"Result of SQL", this.sql_res}
        };
        tableModel = new DefaultTableModel(tmpTableData, tmpHeaderMetaData) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    }
}
