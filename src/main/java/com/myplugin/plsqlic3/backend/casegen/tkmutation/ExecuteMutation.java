package com.myplugin.plsqlic3.backend.casegen.tkmutation;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.mutopschedule.MutOpSelectionConfig;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.MutationList;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.MutationInfo;

import java.util.ArrayList;
import java.util.Collections;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.PlPgSqlMutationOperator.MutantExecuter;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.mutopschedule.MutOpSelectionConfig.optional_op_list;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.select_mutops_probability;

public class ExecuteMutation {
    public static void executeMutation(MutationList mut_list) {
        MutOpSelectionConfig MOconf = new MutOpSelectionConfig();
        int select_mutop_num = 0;
        ArrayList<MUT_OPS> shuffled_mutop = new ArrayList<>(optional_op_list);
        Collections.shuffle(shuffled_mutop);
        for (MUT_OPS mut_op : shuffled_mutop) {
            ArrayList<MutationInfo> shuffled_list = mut_list.getShuffledSample(mut_op, MOconf.mutop_prob_map.get(mut_op));
            if (shuffled_list.size() > 0) {
                select_mutop_num++;
                for (MutationInfo info : shuffled_list) {
                    MutantExecuter(mut_op, info);
                }
            }
            if (select_mutop_num >= (int) Math.round(select_mutops_probability * optional_op_list.size())) {
                break;
            }
        }
    }
}
