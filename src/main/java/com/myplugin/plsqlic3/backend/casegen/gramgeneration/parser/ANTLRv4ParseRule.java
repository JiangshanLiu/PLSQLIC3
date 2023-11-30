package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Lexer;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Parser;

public class ANTLRv4ParseRule {
//    public static GramInfo gram_info = new GramInfo();

    public static void parseAntlrGram(String gram){
//        String gram = readStringFromFile("./src/main/resources/gram/PostgreSQLParser.g4.txt");
        ANTLRv4Lexer lexer = new ANTLRv4Lexer(CharStreams.fromString(gram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
        ParseTree grammarSpec = parser.grammarSpec();
//        parser.removeErrorListeners();
        parser.setBuildParseTree(true);
        ParseTreeWalker walker = new ParseTreeWalker();
        ANTLRv4ListenerImpForParserGram listener = new ANTLRv4ListenerImpForParserGram();
        walker.walk(listener, grammarSpec);
    }
}
