package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

import static com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramInfo.gramInfo;

public class GramNodeNonTerminal extends GramAbstractNodeIndividual {
    public GramNodeNonTerminal(String text) {
        super(text);
    }

    public String getCode(){
        return gramInfo.get(text).getCode();
    }

    @Override
    public String toString(){
        return text;
    }
}
