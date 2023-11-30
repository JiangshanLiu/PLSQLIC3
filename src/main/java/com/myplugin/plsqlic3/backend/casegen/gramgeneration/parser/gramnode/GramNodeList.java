package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

import java.util.stream.Collectors;

import static com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramOption.*;

public class GramNodeList extends GramAbstractNodeContainer {
    GramOption go;

    public GramNodeList(GramOption go) {
        this.go = go;
    }

    @Override
    public String getCode() {
        switch (go) {
            case QUESTION_GO:
                return "";
            case PLUS_GO:
                return "";
            case STAR_GO:
                return "";
            case NONE_GO:
            default:
                System.out.println("LIST\t" + this.toString());
                return this.stream().map(GramNode::getCode).collect(Collectors.joining(" "));
        }
    }

    @Override
    public String toString() {
        return (this.size() > 1 ? "(" : "") +
                this.stream().map(Object::toString).collect(Collectors.joining(" ")) +
                (this.size() > 1 ? ")" : "") +
                (go == QUESTION_GO ? "?" :
                        (go == PLUS_GO ? "+" :
                                go == STAR_GO ? "*" : ""));
    }
}
