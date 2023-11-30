package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode;

import java.util.ArrayList;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class LoopUirNode extends AbstractUirNode{
    public ArrayList<AbstractUirNode> loop_body;

    @Override
    public String toString() {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
            case ORACLE:
            case MYSQL:
                StringBuffer sb = new StringBuffer();
                sb.append("LOOP\n")
                        .append(String.join("\n", loop_body.stream().map(node -> node.toString()).toArray(String[]::new)))
                        .append("END LOOP;\n");
                return sb.toString();
            default:
                return "";
        }
    }
}
