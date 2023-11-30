package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode;

import com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.ANTLRv4ListenerImpForParserGram;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Lexer;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Parser;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;

public class GramInfo {
    public static LinkedHashMap<String, GramNode> gramInfo = new LinkedHashMap<>();
    public static ArrayList<GramNode> history = new ArrayList<>();

    static {
        String gram = readStringFromFile("./src/main/resources/gram/PostgreSQLParser.g4.txt");
        ANTLRv4Lexer lexer = new ANTLRv4Lexer(CharStreams.fromString(gram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
        ParseTree grammarSpec = parser.grammarSpec();
        parser.setBuildParseTree(true);
        ParseTreeWalker walker = new ParseTreeWalker();
        ANTLRv4ListenerImpForParserGram listener = new ANTLRv4ListenerImpForParserGram();
        walker.walk(listener, grammarSpec);
    }

    public String getCode(String root) {
        if (gramInfo.containsKey(root)) {
            return gramInfo.get(root).getCode();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : gramInfo.keySet()) {
            sb.append(s).append("\n   : ").append(gramInfo.get(s)).append("\n   ;\n\n");
        }
        return sb.toString();
    }
}
