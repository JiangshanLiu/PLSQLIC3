package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;

import java.util.ArrayList;

public class GotoFromInfo {
    public Label from_label;
    public ArrayList<AbstractSsaNode> from_block;
    public int from_block_index;

    public GotoFromInfo(Label from_label, ArrayList<AbstractSsaNode> from_block, int from_block_index) {
        this.from_label = from_label;
        this.from_block = from_block;
        this.from_block_index = from_block_index;
    }
}
