package com.myplugin.plsqlic3.backend.casegen.tkmutation;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.parser.PlPgSqlListenerImpForMutation;
import com.myplugin.plsqlic3.backend.casegen.util.CaseGenerator;
import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;

import java.io.File;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.SaveMutantCase.saveMutantCase;
import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedSchedule.selectSeed;
import static com.myplugin.plsqlic3.backend.casegen.util.seedschedule.SeedSchedule.selectSeedBySingleFile;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.appendExceptionLog;

public class CaseGenByTkMutation extends CaseGenerator {
    @Override
    public TestCase genTestCase() {
        TestCase seed = selectSeed();
        Random r = new Random();
        double num = r.nextDouble();
        if (num < case_or_mut || !if_do_mutation) {
            return new TestCase(seed.case_name, seed.case_code);
        } else {
            TestCase test_case = genTestCaseByMutation(seed, false);
            return new TestCase(test_case.case_name, test_case.case_code);
        }
    }

    @Override
    public TestCase genTestCase(String seed_name) {
        TestCase test_case;
        if (if_do_mutation) {
            test_case = genTestCaseByMutation(selectSeedBySingleFile(seed_name), true);
        } else {
            test_case = selectSeedBySingleFile(seed_name);
        }
        return new TestCase(test_case.case_name, test_case.case_code);
    }

    private static TestCase genTestCaseByMutation(TestCase seed, boolean naive) {
        TestCase test_case = new TestCase();
        try {
            CharStream charStream = CharStreams.fromString((String) seed.case_code);
            PostgreSQLLexer lexer = new PostgreSQLLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(EXCEPTION);
            ParseTree tree = parser.root();
            parser.setBuildParseTree(true);
            ParseTreeWalker walker = new ParseTreeWalker();
            PlPgSqlListenerImpForMutation listener = new PlPgSqlListenerImpForMutation();
            walker.walk(listener, tree);

            String mutant_case = getFullTextByChildren(tree);
            if (mutant_case.endsWith("<EOF> ")) {
                mutant_case = mutant_case.substring(0, mutant_case.length() - 6);    // delete "<EOF> "
            }

            test_case.case_name = getCaseName(seed.case_name, naive);
            test_case.case_code = verifyCaseValidity(mutant_case) || naive ? mutant_case : "";
            if (naive) {
                saveMutantCase(test_case);
            }
        } catch (Exception e) {
            if (test_case.case_name == null) {
                appendExceptionLog("NMUTE", seed.case_name, e);
            } else {
                String[] sql_file_dirs = test_case.case_name.split("[/\\\\]");
                String sql_file_name = sql_file_dirs[sql_file_dirs.length - 1];
                appendExceptionLog("MUTE", sql_file_name, e);
            }
        }
        return test_case;
    }

    private static TestCase genTestCaseByMutation2(TestCase seed, boolean naive) {
        TestCase test_case = new TestCase();
        test_case.case_name = getCaseName(seed.case_name, naive);
        test_case.case_code = seed.case_code;
        try {
            for (int i = 0; i < 100; i++) {
                CharStream charStream = CharStreams.fromString((String) seed.case_code);
                PostgreSQLLexer lexer = new PostgreSQLLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PostgreSQLParser parser = new PostgreSQLParser(tokens);
                parser.setErrorMode(EXCEPTION);
                ParseTree tree = parser.root();
                parser.setBuildParseTree(true);
                ParseTreeWalker walker = new ParseTreeWalker();
                PlPgSqlListenerImpForMutation listener = new PlPgSqlListenerImpForMutation();
                walker.walk(listener, tree);

                String mutant_case = getFullTextByChildren(tree);
                if (mutant_case.endsWith("<EOF> ")) {
                    mutant_case = mutant_case.substring(0, mutant_case.length() - 6);    // delete "<EOF> "
                }

                if (verifyCaseValidity(mutant_case)) {
                    test_case.case_code = mutant_case;
                    break;
                }
            }
            if (naive) {
                saveMutantCase(test_case);
            }
        } catch (Exception e) {
//            if (test_case.case_name == null) {
//                appendExceptionLog("NMUTE", seed.case_name, e);
//            } else {
//                String[] sql_file_dirs = test_case.case_name.split("[/\\\\]");
//                String sql_file_name = sql_file_dirs[sql_file_dirs.length - 1];
//                appendExceptionLog("MUTE", sql_file_name, e);
//            }
        }
        return test_case;
    }

    public static void main(String[] args) {
        File folder_seed_mutant = new File(dir_seed_mutant);
        if (!folder_seed_mutant.exists() && !folder_seed_mutant.isDirectory()) {
            if (!folder_seed_mutant.mkdirs()) {
                System.out.println("123");
            }
        }
        TestCase test_case = new TestCase();
        test_case.case_name = "ray-pl.sql";
        test_case.case_code = readStringFromFile("./test_sql/test_plpgsql/seed_set/" + test_case.case_name);
        for (int i = 0; i < 10; i++) {
            test_case = genTestCaseByMutation2(test_case, false);
            test_case.case_name = new StringBuilder(test_case.case_name).insert(test_case.case_name.length() - 4, i).toString();
            saveMutantCase(test_case);
        }
    }
}
