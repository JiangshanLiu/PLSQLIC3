package com.myplugin.plsqlic3.middleware.data;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import javax.swing.table.DefaultTableModel;
import java.util.HashMap;

public class CaseValidityData {

    public boolean isValid;
    public SqlIdMap<String, String> argsWithType;

    public static String[] tmpHeaderMetaData = new String[]{"Argument", "Type", "Value"};
    public static DefaultTableModel tableModel;

    public CaseValidityData(boolean isValid, SqlIdMap<String, String> argsWithType) {
        this.isValid = isValid;
        this.argsWithType = argsWithType;
    }

    public DefaultTableModel getTableModel() {
        String[][] tmpTableData = new String[argsWithType.size()][3];
        for (int i = 0; i < argsWithType.size(); ++i) {
            tmpTableData[i][0] = (String) argsWithType.keySet().toArray()[i];
            tmpTableData[i][1] = argsWithType.get(tmpTableData[i][0]);
            tmpTableData[i][2] = "";
        }
        CaseValidityData.tableModel = new DefaultTableModel(tmpTableData, tmpHeaderMetaData) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1;
            }
        };
        return tableModel;
    }
}
