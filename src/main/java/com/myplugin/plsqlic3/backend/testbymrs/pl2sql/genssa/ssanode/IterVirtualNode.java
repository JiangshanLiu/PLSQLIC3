package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IterVirtualNode.IterLabelType.*;

public class IterVirtualNode extends AbstractSsaNode{
    public enum IterLabelType {
        INIT,
        HEAD,
        BODY,
        END
    }

    public HashMap<IterLabelType, Label> label_list = new HashMap<>();

    public IterVirtualNode(){
        setNode_type(SsaNodeType.NODE_ITERVIRTUAL);
    }

    public IterVirtualNode(Label label_init, Label label_head, Label label_body, Label label_end){
        setNode_type(SsaNodeType.NODE_ITERVIRTUAL);
        label_list.put(INIT, label_init);
        label_list.put(HEAD, label_head);
        label_list.put(BODY, label_body);
        label_list.put(END, label_end);
    }
}
