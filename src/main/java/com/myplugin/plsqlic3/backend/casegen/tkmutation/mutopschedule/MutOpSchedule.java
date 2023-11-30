package com.myplugin.plsqlic3.backend.casegen.tkmutation.mutopschedule;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS;

import java.util.ArrayList;
import java.util.Random;

public class MutOpSchedule {
    private static MUT_OPS getRandomItem(ArrayList<MUT_OPS> op_list) {
        Random r = new Random();
        int num = r.nextInt(op_list.size());
        return op_list.get(num);
    }

    public static MUT_OPS getMutOp() {
        MutOpSelectionConfig MOconf = new MutOpSelectionConfig();
        ArrayList<MUT_OPS> op_list = new ArrayList<>();
        for (MUT_OPS op : MUT_OPS.values()) {
            if (MOconf.mutop_prob_map.get(op) != 0.0) {
                op_list.add(op);
            }
        }
        return getRandomItem(op_list);
    }
}
