package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser;

import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Parser;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4ParserBaseListener;

import static com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramNodeTerminal.strKW;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextOriginal;

public class ANTLRv4ListenerImpForLexerGram extends ANTLRv4ParserBaseListener {
    @Override
    public void enterLexerRuleSpec(ANTLRv4Parser.LexerRuleSpecContext ctx) {
        String s = getFullTextOriginal(ctx.lexerRuleBlock());
        strKW.put(ctx.TOKEN_REF().getText(), s.substring(1, s.length() - 1));
    }
}
