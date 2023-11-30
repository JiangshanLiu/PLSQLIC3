package com.myplugin.plsqlic3.middleware;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;
import com.myplugin.plsqlic3.middleware.data.VerifyData;

import javax.swing.table.TableModel;

import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.VerifyConsistencyBackend.verifyConsistencyBackend;

public class VerifyConsistency {
    public VerifyData verifyData;

    public void verifyPLSQL(String caseName, String caseCode, TableModel dataModel) {
        SqlIdMap<String, String> args_val = new SqlIdMap<>();
        for (int i = 0; i < dataModel.getRowCount(); ++i) {
            args_val.put((String) dataModel.getValueAt(i, 0), (String) dataModel.getValueAt(i, 2));
        }
        this.verifyData = verifyConsistencyBackend(new TestCase(caseName, caseCode), args_val, true);
    }
}
