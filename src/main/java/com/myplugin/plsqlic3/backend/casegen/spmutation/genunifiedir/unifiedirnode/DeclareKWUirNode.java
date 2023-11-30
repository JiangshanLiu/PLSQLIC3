package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class DeclareKWUirNode extends AbstractUirNode{
    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                return "DECLARE\n";
            default:
                return "";
        }
    }
}
