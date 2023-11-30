package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

public abstract class GramAbstractNodeIndividual implements GramNode {
    String text;

    public GramAbstractNodeIndividual(String text) {
        this.text = text;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
