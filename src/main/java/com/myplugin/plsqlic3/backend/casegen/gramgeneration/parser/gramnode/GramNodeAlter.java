package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

import java.util.Random;
import java.util.stream.Collectors;

public class GramNodeAlter extends GramAbstractNodeContainer {
    @Override
    public String getCode() {
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            int index = r.nextInt(this.size());
            if (!GramInfo.history.contains(this.get(index))) {
                GramInfo.history.add(this.get(index));
                System.out.println("ALTE\t" + this.get(index).toString());
                return this.get(index).getCode();
            }
        }
        Random r = new Random();
        int index = r.nextInt(this.size());
        System.out.println("ALTR\t" + this.get(index).toString());
        return this.get(index).getCode();
    }

    @Override
    public String toString() {
        return this.stream().map(Object::toString).collect(Collectors.joining("\n   | "));
    }
}
