package com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode;


import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.MutationList;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.CTX_ATTR;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;

public class MutationInfo {
    public static HashMap<CTX_ATTR, Boolean> ctx_attr_mapT = new HashMap<>() {{
        for (CTX_ATTR attr : CTX_ATTR.values()) {
            put(attr, false);
        }
    }};

    public ParseTree tree;
    public HashMap<CTX_ATTR, Boolean> ctx_attr_map = new HashMap<>(ctx_attr_mapT);
    public DeclareIdInfo idInfo;
    public MutationList mut_list;

    public MutationInfo(ParseTree tree) {
        this.tree = tree;
        this.idInfo = null;
    }

    // CTX_ATTR_IDENTIFIER
    // CTX_ATTR_CONSTSTR
    // CTX_ATTR_CONSTSCAL
    // CTX_ATTR_ARRVAR
    public MutationInfo(ParseTree tree, DeclareIdInfo idInfo) {
        this.tree = tree;
        this.idInfo = idInfo;
    }

    public ParseTree getTree() {
        return tree;
    }
}