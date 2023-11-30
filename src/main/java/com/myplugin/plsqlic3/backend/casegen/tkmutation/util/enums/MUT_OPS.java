package com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums;

public enum MUT_OPS {
    // GMO: general mutation operators
    GMO_ABS,    // Absolute Value Insertion
    GMO_AOR,    // Arithmetic Operator Replacement(Rpl.)
    GMO_CRP,    // Constant Rpl.
    GMO_SCR,    // Scalar Constant Rpl.
    GMO_GLR,    // GOTO Statement Rpl.
    GMO_LCR,    // Logical Connector Rpl.
    GMO_ROR,    // Relational Operator Rpl.
    GMO_RSR,    // RETURN Statement Rpl.
    GMO_PCC,    // Type Change Rpl.
    GMO_CSR,    // Constant for Scalar Rpl.
    GMO_SVR,    // Scalar Variable Rpl.
    GMO_AAR,    // Array Reference for Array Reference Rpl.
    GMO_CAR,    // Constant for Array Reference Rpl.
    GMO_ACR,    // Array Reference for Constant Rpl.
    GMO_ASR,    // Array Reference for Scalar Variable Rpl.
    GMO_CNR,    // Comparable Array Name Rpl.
    GMO_SAR,    // Scalar Variable for Array Reference Rpl.

    // SMO: SQL mutation operators
    SMO_SEL,    // SELECT Clause
    SMO_JOI,    // Join Clause
    SMO_SUB,    // Subquery Predicates
    SMO_AGR,    // Aggregate Function Repl.
    SMO_UNI,    // Union Repl.
    SMO_ORD,    // Ordering Repl.
    SMO_ROR,    // Relational Operator Repl.
    SMO_LCR,    // Logical Connector Rep.
    SMO_UOI,    // Unary Operation Insertion
    SMO_ABS,    // Absolute Value Insertion
    SMO_AOR,    // Arithmetic Operator Repl.
    SMO_BTW,    // Between Predicate
    SMO_LIKE,   // Like Predicate
    SMO_NLF,    // Null Predicate Repl.
    SMO_NLS,    // Null in Select List
    SMO_NLI,    // Include Nulls Repl.
    SMO_NLO,    // Other Nulls Repl.
    SMO_IRC,    // Column Repl.
    SMO_IRT,    // Constant Repl.
    SMO_IRP,    // Parameter Repl.
    SMO_IRH,    // Hidden Column Repl.

    // PMO: PL/SQL mutation operators
    PMO_RBC,    // Rollback Removal
    PMO_OFR,    // Oracle Function Repl.
    PMO_CMR,    // Commit Removal
    PMO_EXI,    // Exception Insertion
    PMO_QER,    // Query Error Insertion
    PMO_OSR     // Oracle Sequence Nextval Repl.
}
