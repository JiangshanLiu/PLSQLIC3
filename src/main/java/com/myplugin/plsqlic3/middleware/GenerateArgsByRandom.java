package com.myplugin.plsqlic3.middleware;

import javax.swing.table.TableModel;

import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;

public class GenerateArgsByRandom {
    public static TableModel generateArgsByRandom(TableModel tableModel) {
        for (int i = 0; i < tableModel.getRowCount(); ++i) {
            String type = (String) tableModel.getValueAt(i, 1);
            tableModel.setValueAt(getRandom(type), i, 2);
        }
        return tableModel;
    }
}
