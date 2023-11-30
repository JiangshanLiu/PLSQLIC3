package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.anfnode.FunctionAnfNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IfelseSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.TrampolineCallSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.TrampolineReturnSsaNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.FunctionInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.*;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.aux_ctrl_col;

public class TrampolinedAnfUtil {
    public FunctionAnfNode start_func;
    public FunctionAnfNode tramp_func;
    public LinkedHashMap<Label, FunctionAnfNode> anf_funcs;
    public FunctionInfo func_info;
    public static ThreadLocal<Integer> sql_debug_counter = new ThreadLocal<>();

    public TrampolinedAnfUtil(AnfUtil anf_util) {
        this.func_info = anf_util.goto_util.func_info;
        this.anf_funcs = new LinkedHashMap<>(anf_util.anf_funcs);
        List<Label> label_list = new ArrayList<>(anf_funcs.keySet());
        Collections.sort(label_list);
        start_func = anf_funcs.get(label_list.get(0));
        establishTramplinedFunc();
    }

    private void establishTramplinedFunc() {
        List<Label> label_list = new ArrayList<>(anf_funcs.keySet());
        Collections.sort(label_list);
        label_list.remove(0);
        if (anf_funcs.size() == 1) {
            tramp_func = new FunctionAnfNode(new Label("trampoline"), new ArrayList<>(), anf_funcs);
            Label trpl_label = new Label("trampoline");
            anf_funcs.put(trpl_label, tramp_func);
        } else {
            // build nested trampolined funcs
            IfelseSsaNode isn_inner = null;
            ListIterator<Label> it = label_list.listIterator(label_list.size());
            while (it.hasPrevious()) {
                Label label = it.previous();
                IfelseSsaNode isn = new IfelseSsaNode(label.trampline_cond, anf_funcs.get(label).block, new ArrayList<>());
                if (isn_inner != null) {
                    isn.else_block.add(isn_inner);
                }
                isn_inner = isn;
            }
            // change trampline_cond call into rec
            Label trpl_label = new Label("trampoline");
            trpl_label.trampline_cond.children.remove(2);
            trpl_label.trampline_cond.children.remove(1);
            ((CommonToken) ((TerminalNode) trpl_label.trampline_cond.children.get(0)).getSymbol()).setText(aux_ctrl_col[0]);
            IfelseSsaNode isn_rec = new IfelseSsaNode(trpl_label.trampline_cond, new ArrayList<>(), new ArrayList<>());
            isn_rec.then_block.add(isn_inner);
            // use dedicated TrampolineReturnSsaNode instead of ReturnSsaNode
            TrampolineReturnSsaNode trsn = new TrampolineReturnSsaNode();
            isn_rec.else_block.add(trsn);
            // add root node of trampoline func to tramp_block
            ArrayList<AbstractSsaNode> tramp_block = new ArrayList<>();
            tramp_block.add(isn_rec);
            tramp_func = new FunctionAnfNode(trpl_label, tramp_block, anf_funcs);
            anf_funcs.put(trpl_label, tramp_func);
        }
        LinkedHashSet<String> args_trampoline = new LinkedHashSet<>();
        args_trampoline.addAll(List.of(aux_ctrl_col));
        // read args has a bug, so we use all the vars instead temporarily
//        args_trampoline.addAll(tramp_func.args_in);
        args_trampoline.addAll(func_info.id_type_pair.keySet());
        tramp_func.anf_func_args = args_trampoline;
        TrampolineCallSsaNode.trpl_args_name.get().addAll(tramp_func.anf_func_args);
        TrampolineCallSsaNode.trpl_func_name.set(tramp_func.anf_func_name);

        genTrplFuncCallRec(start_func.block);
        genTrplFuncCallRec(tramp_func.block);
    }

    private void genTrplFuncCallRec(ArrayList<AbstractSsaNode> block) {
        ArrayList<AbstractSsaNode> ret_goto_nodes = new ArrayList<>();
        for (AbstractSsaNode asn : block) {
            if (asn.getNode_type() == AbstractSsaNode.SsaNodeType.NODE_IFELSE) {
                genTrplFuncCallRec(((IfelseSsaNode) asn).then_block);
                genTrplFuncCallRec(((IfelseSsaNode) asn).else_block);
            } else if (asn.getNode_type() == AbstractSsaNode.SsaNodeType.NODE_GOTO || asn.getNode_type() == AbstractSsaNode.SsaNodeType.NODE_RETURN) {
                ret_goto_nodes.add(asn);
            }
        }
        for (AbstractSsaNode asn : ret_goto_nodes) {
            block.add(block.indexOf(asn), new TrampolineCallSsaNode(asn, anf_funcs, func_info));
            block.remove(asn);
        }
    }

    @Override
    public String toString() {
        return start_func + "\n" + tramp_func;
    }
}
