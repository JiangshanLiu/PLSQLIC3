package com.myplugin.plsqlic3.backend.casegen.tkmutation.mutopschedule;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS;

import java.util.ArrayList;
import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS.*;

public class MutOpSelectionConfig {
    public HashMap<MUT_OPS, Double> mutop_prob_map = new HashMap<>();
    public static ArrayList<MUT_OPS> optional_op_list = new ArrayList<>(){{
        add(GMO_ABS);
        add(GMO_AOR);
        add(GMO_CRP);
        add(GMO_SCR);
        add(GMO_LCR);
        add(GMO_ROR);
        add(GMO_PCC);
        add(GMO_CSR);
        add(GMO_AAR);
        add(GMO_CAR);
        add(GMO_ACR);
        add(GMO_ASR);
        add(GMO_CNR);
        add(GMO_SAR);
    }};

    public MutOpSelectionConfig() {
        for (MUT_OPS op : MUT_OPS.values()) {
            if(optional_op_list.contains(op)){
                mutop_prob_map.put(op, 0.15);
//                mutop_prob_map.put(op, 1.0);
            }else{
                mutop_prob_map.put(op, 0.0);
            }
//            if (op == GMO_ROR) {
//                mutop_prob_map.put(op, 1.0);
//            } else {
//                mutop_prob_map.put(op, 0.0);
//            }
        }
    }
}
