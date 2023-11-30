package com.myplugin.plsqlic3.backend.runnable.fuzzer;

public enum Fuzzers {
    PL2SQL,             // our method
    EMI,                // compiler testing of traditional PL, by paper "Finding Compiler Bugs via Live Code Mutation"
    NOREC               // method on SQL, by paper "Detecting Optimization Bugs in Database Engines via Non-optimizing Reference Engine Construction"
}
