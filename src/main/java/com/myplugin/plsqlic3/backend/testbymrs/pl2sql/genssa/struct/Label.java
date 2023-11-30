package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;

import java.util.HashMap;

public class Label implements Comparable<Label> {
    private static class MapThreadLocal extends ThreadLocal<HashMap<Integer, Label>>{
        @Override
        protected HashMap<Integer, Label> initialValue(){
            return new HashMap<>();
        }
    }

    // global properties of Label class
    static ThreadLocal<Label> pre_label;
    static MapThreadLocal label_list = new MapThreadLocal();
    static ThreadLocal<ParserRuleContext> static_trampline_cond;

    // properties of each Label
    int label_num;
    public String label_comment = "";

    public ParserRuleContext trampline_cond = new ParserRuleContext();

    public Label() {
        label_num = label_list.get().size();
        label_list.get().put(label_num, this);
    }

    public Label(String comment) {
        label_num = label_list.get().size();
        label_list.get().put(label_num, this);
        label_comment = comment;
        for (ParseTree pt : static_trampline_cond.get().children) {
            trampline_cond.addChild(new TerminalNodeImpl(new PlSqlToken(((TerminalNode) pt).getSymbol().getType(), ((TerminalNode) pt).getSymbol().getText())));
        }
//        trampline_cond.copyFrom(static_trampline_cond);
        ((CommonToken) ((TerminalNode) trampline_cond.children.get(2)).getSymbol()).setText("'L_" + label_num + "_" + label_comment + "'");
    }

    @Override
    public String toString() {
        return String.valueOf(label_num);
    }

    public static Label getPre_label() {
        return pre_label.get();
    }

    public static void setPre_label(Label pre_lab) {
        Label.pre_label.set(pre_lab);
    }

    public static void setStatic_trampline_cond(ParserRuleContext static_trampline_cond) {
        Label.static_trampline_cond.set(static_trampline_cond);
    }

    public static Label getLabelByIndex(Integer index) {
        return label_list.get().get(index);
    }

    public static void clearStaticVars(){
        pre_label = new ThreadLocal<>();
        label_list.get().clear();
        static_trampline_cond = new ThreadLocal<>();
    }

    @Override
    public int compareTo(Label o) {
        return this.label_num - o.label_num;
    }
}
