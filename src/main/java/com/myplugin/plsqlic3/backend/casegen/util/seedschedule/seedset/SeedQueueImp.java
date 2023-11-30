package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.seedset;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

public interface SeedQueueImp {
    Object lock = new Object();

    TestCase peek();

    void put(TestCase seed);

    void update();

    String saveQueue2String();
}
