package com.myplugin.plsqlic3.middleware.data;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResStateWithRes;

import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.List;

public class VerifyData {
    public TestCase test_case;
    public String code_ssa;
    public String code_anf;
    public String code_sql;
    public SQLResStateWithRes sql_res;

    public String[] tmpHeaderMetaData;
    public String[][] tmpTableData;
    public DefaultTableModel tableModel;

    public VerifyData(TestCase test_case,
                      String code_ssa,
                      String code_anf,
                      String code_sql,
                      SQLResStateWithRes sql_res) {
        this.test_case = test_case;
        this.code_ssa = code_ssa;
        this.code_anf = code_anf;
        this.code_sql = code_sql;
        this.sql_res = sql_res;
    }

    public VerifyData(TestCase test_case,
                      String code_ssa,
                      String code_anf,
                      String code_sql,
                      SQLResStateWithRes sql_res,
                      List<HashMap<String, Object>> sql_res_list) {
        if (sql_res_list.size() > 0) {
            tmpHeaderMetaData = new String[sql_res_list.get(0).keySet().size()];
            Object[] cols = sql_res_list.get(0).keySet().toArray();
            for (int i = 0; i < sql_res_list.get(0).keySet().size(); ++i) {
                tmpHeaderMetaData[i] = (String) cols[i];
            }
            tmpTableData = new String[sql_res_list.size()][sql_res_list.get(0).keySet().size()];
            for (HashMap<String, Object> m : sql_res_list) {
                for (int i = 0; i < sql_res_list.get(0).keySet().size(); ++i) {
                    tmpTableData[sql_res_list.indexOf(m)][i] = String.valueOf(m.get(tmpHeaderMetaData[i]));
                }
            }

            tableModel = new DefaultTableModel(tmpTableData, tmpHeaderMetaData) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        } else {
            tableModel = new DefaultTableModel(new Object[0][0], new Object[0]) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        }

        this.test_case = test_case;
        this.code_ssa = code_ssa;
        this.code_anf = code_anf;
        this.code_sql = code_sql;
        this.sql_res = sql_res;
    }
}
