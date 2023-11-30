package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql;

import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genanf.TrampolinedAnfUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator.PlainAbstractSqlTranslator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator.PlainOpenGaussSqlTranslator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genpuresql.translator.PlainPostgreSqlTranslator;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class GeneratePureSql {
    public static PlainAbstractSqlTranslator getPlainSqlUtil(TrampolinedAnfUtil trpl_anf_util) {
        switch (db_type) {
            case POSTGRES:
                return new PlainPostgreSqlTranslator(trpl_anf_util);
            case GAUSSDB:
                return new PlainOpenGaussSqlTranslator(trpl_anf_util);
        }
        return null;
    }
}
