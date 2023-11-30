package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SqlIdArrayList<E> extends ArrayList<E> {
    public SqlIdArrayList() {
        super();
    }

    public SqlIdArrayList(List<E> asList) {
        this.addAll(asList);
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            for (Object str : this) {
                if (((String) str).equalsIgnoreCase(s)) {
                    return true;
                }
            }
        } else {
            return super.contains(o);
        }
        return false;
    }

    @Override
    public boolean add(E s) {
        if (s instanceof String) {
            return super.add((E) ((String) s).toLowerCase());
        } else {
            return super.add(s);
        }
    }

    @Override
    public void add(int index, E s) {
        if (s instanceof String) {
            super.add(index, (E) ((String) s).toLowerCase());
        } else {
            super.add(index, s);
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        modCount++;
        int numNew = a.length;
        if (numNew == 0)
            return false;
        for (Object o : a) {
            this.add((E) o);
        }
        return true;
    }
}
