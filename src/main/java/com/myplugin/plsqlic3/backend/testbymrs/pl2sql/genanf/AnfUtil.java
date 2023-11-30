package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf;

import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.GotoFromInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.*;

public class AnfUtil {
    LinkedHashMap<Label, FunctionAnfNode> anf_funcs = new LinkedHashMap<>();
    GotoUtil goto_util;

    public AnfUtil(GotoUtil goto_util) {
        this.goto_util = goto_util;
        for (TerminalNode func_args_in : goto_util.func_info.function_args) {
            FunctionAnfNode.pl_all_vars.addVar(func_args_in);
        }
        buildAnfFunctions();
        liftFunctions();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        List<Label> label_list = new ArrayList<>(anf_funcs.keySet());
        Collections.sort(label_list);
        for (Label label : label_list) {
            sb.append(anf_funcs.get(label)).append("\n");
        }
        return sb.toString();
    }

    private void buildAnfFunctions() {
        for (Map.Entry<Label, ArrayList<AbstractSsaNode>> entry : goto_util.block_dict_s.entrySet()) {
            Label label = entry.getKey();
            anf_funcs.put(label, new FunctionAnfNode(label, goto_util.block_dict_s.get(label), anf_funcs));
            if (Label.getLabelByIndex(0) == label) {
                anf_funcs.get(label).anf_func_args.clear();
                for (TerminalNode func_args_in : goto_util.func_info.function_args) {
                    anf_funcs.get(label).anf_func_args.add(func_args_in.getSymbol().toString());
                }
            }
        }
    }

    private void liftFunctions() {
        List<Label> anf_labels = new ArrayList<>(goto_util.block_dict_s.keySet());
        boolean[][] dest_blocks_map = new boolean[anf_labels.size()][anf_labels.size()];
        for (Label label : anf_labels) {
            for (GotoFromInfo gfi : goto_util.func_info.source_blocks_map.get(label)) {
                dest_blocks_map[anf_labels.indexOf(gfi.from_label)][anf_labels.indexOf(label)] = true;
            }
        }
        // floyd algorithm
        for (int k = 0; k < anf_labels.size(); k++) {
            for (int i = 0; i < anf_labels.size(); i++) {
                for (int j = 0; j < anf_labels.size(); j++) {
                    if (dest_blocks_map[i][k] && dest_blocks_map[k][j] && !dest_blocks_map[i][j]) {
                        dest_blocks_map[i][j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < anf_labels.size(); i++) {
            for (int j = 0; j < anf_labels.size(); j++) {
                if (dest_blocks_map[j][i]) {
                    anf_funcs.get(anf_labels.get(i)).anf_func_args.addAll(anf_funcs.get(anf_labels.get(j)).anf_func_args);
                }
            }
        }
    }
}
