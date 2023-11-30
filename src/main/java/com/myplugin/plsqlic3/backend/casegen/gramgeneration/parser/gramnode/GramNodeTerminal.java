package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

import com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.ANTLRv4ListenerImpForLexerGram;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Lexer;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Parser;

import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;

public class GramNodeTerminal extends GramAbstractNodeIndividual {
    public static HashMap<String, String> strKW = new HashMap<>();

    static {
        String gram = readStringFromFile("./src/main/resources/gram/PostgreSQLLexer1.g4.txt");
        ANTLRv4Lexer lexer = new ANTLRv4Lexer(CharStreams.fromString(gram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
        ParseTree grammarSpec = parser.grammarSpec();
        parser.setBuildParseTree(true);
        ParseTreeWalker walker = new ParseTreeWalker();
        ANTLRv4ListenerImpForLexerGram listener = new ANTLRv4ListenerImpForLexerGram();
        walker.walk(listener, grammarSpec);
    }

    public GramNodeTerminal(String text) {
        super(text);
    }

    public String getCode() {
        if (strKW.containsKey(this.text)) {
            return strKW.get(this.text);
        } else {
            return "$$" + text + "$$";
        }
    }

    @Override
    public String toString() {
        return text;
    }
}
