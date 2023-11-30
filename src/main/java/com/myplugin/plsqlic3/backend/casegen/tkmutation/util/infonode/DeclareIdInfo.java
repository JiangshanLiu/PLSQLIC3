package com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_TYPE;

public class DeclareIdInfo {
    public String type_name;
    public MUT_TYPE mut_type;
    public boolean is_array;

    public DeclareIdInfo(String type_name,
                         MUT_TYPE mut_type,
                         boolean is_array) {
        this.type_name = type_name;
        this.mut_type = mut_type;
        this.is_array = is_array;
    }
}
