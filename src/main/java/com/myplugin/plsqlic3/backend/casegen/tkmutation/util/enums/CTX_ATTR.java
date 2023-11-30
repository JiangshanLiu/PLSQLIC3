package com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums;

public enum CTX_ATTR {
    CTX_ATTR_PL,
    CTX_ATTR_MUTABLE,
    CTX_ATTR_IDENTIFIER,        // GMO_ABS: x
    CTX_ATTR_MATHOP,            // GMO_AOR: + - * / % ^
    CTX_ATTR_CONSTSTR,          // GMO_CRP: 'a string'
    CTX_ATTR_CONSTSCAL,         // GMO_SCR: 100
    CTX_ATTR_GOTOSTMT,          // GMO_GLR: GOTO flagpoint;
    CTX_ATTR_LOGICALOP,         // GMO_LCR: if a and | or b
    CTX_ATTR_RELATIONOP,        // GMO_ROR: = !=
    CTX_ATTR_TYPENAME,          // GMO_PCC: NUMERIC INTEGER
    CTX_ATTR_ARRCLOSEBRACKET,   // GMO_AAR: a[ 1 ]
    CTX_ATTR_ARRVAR             // GMO_CAR: a[1]
}
