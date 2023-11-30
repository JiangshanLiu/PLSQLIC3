package com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser;

import com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.*;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4Parser;
import com.myplugin.plsqlic3.backend.parsers.parseantlrv4.ANTLRv4ParserBaseListener;

import java.util.Stack;

import static com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramInfo.gramInfo;
import static com.myplugin.plsqlic3.backend.casegen.gramgeneration.parser.gramnode.GramOption.*;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextOriginal;

public class ANTLRv4ListenerImpForParserGram extends ANTLRv4ParserBaseListener {
    //    private ArrayList<gramNode> currList = null;
    private Stack<GramAbstractNodeContainer> stack = new Stack<>();

    @Override
    public void enterParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx) {
        // rules of 1 non-terminal node
        // every rule is parallel and alternative
        GramNodeAlter gna = new GramNodeAlter();
        stack.push(gna);
    }

    @Override
    public void exitParserRuleSpec(ANTLRv4Parser.ParserRuleSpecContext ctx) {
        GramAbstractNodeContainer gn = stack.pop();
        if (gn instanceof GramNodeAlter) {
            gramInfo.put(ctx.RULE_REF().getText(), gn);
        }
    }

    @Override
    public void enterLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx) {
        // sub-branched of 1 rule
        stack.push(new GramNodeList(NONE_GO));
    }

    @Override
    public void exitLabeledAlt(ANTLRv4Parser.LabeledAltContext ctx) {
        GramAbstractNodeContainer gn = stack.pop();
        stack.peek().add(gn);
    }

    @Override
    public void enterAlternative(ANTLRv4Parser.AlternativeContext ctx) {
        stack.push(new GramNodeList(NONE_GO));
    }

    @Override
    public void exitAlternative(ANTLRv4Parser.AlternativeContext ctx) {
        GramAbstractNodeContainer gn = stack.pop();
        stack.peek().add(gn);
    }

    @Override
    public void enterElement(ANTLRv4Parser.ElementContext ctx) {
        // action block has no relation with grammar
        if (ctx.actionBlock() != null) {
            return;
        }
        if (ctx.ebnfSuffix() != null) {
            if (ctx.ebnfSuffix().QUESTION().size() != 0) {
                stack.push(new GramNodeList(QUESTION_GO));
            } else if (ctx.ebnfSuffix().PLUS() != null) {
                stack.push(new GramNodeList(PLUS_GO));
            } else if (ctx.ebnfSuffix().STAR() != null) {
                stack.push(new GramNodeList(STAR_GO));
            } else {
                System.out.println("ERROR@enterEbnf");
            }
        } else {
            stack.push(new GramNodeList(NONE_GO));
        }
    }

    @Override
    public void exitElement(ANTLRv4Parser.ElementContext ctx) {
        // action block has no relation with grammar
        if (ctx.actionBlock() != null) {
            return;
        }
        GramAbstractNodeContainer gn = stack.pop();
        stack.peek().add(gn);
    }

    @Override
    public void enterAtom(ANTLRv4Parser.AtomContext ctx) {
        String s = "";
        if (ctx.terminal() != null) {
            s = getFullTextOriginal(ctx.terminal());
        } else if (ctx.ruleref() != null) {
            s = getFullTextOriginal(ctx.ruleref());
        } else {
            System.out.println("ERROR@enterAtom");
        }
        if (Character.isUpperCase(s.charAt(0))) {
            stack.peek().add(new GramNodeTerminal(s));
        } else {
            stack.peek().add(new GramNodeNonTerminal(s));
        }
    }

    @Override
    public void enterBlock(ANTLRv4Parser.BlockContext ctx) {
        stack.push(new GramNodeList(NONE_GO));
    }

    @Override
    public void exitBlock(ANTLRv4Parser.BlockContext ctx) {
        GramAbstractNodeContainer gn = stack.pop();
        stack.peek().add(gn);
    }

    @Override
    public void enterEbnf(ANTLRv4Parser.EbnfContext ctx) {
        if (ctx.blockSuffix() != null) {
            if (ctx.blockSuffix().ebnfSuffix().QUESTION().size() != 0) {
                stack.push(new GramNodeList(QUESTION_GO));
            } else if (ctx.blockSuffix().ebnfSuffix().PLUS() != null) {
                stack.push(new GramNodeList(PLUS_GO));
            } else if (ctx.blockSuffix().ebnfSuffix().STAR() != null) {
                stack.push(new GramNodeList(STAR_GO));
            } else {
                System.out.println("ERROR@enterEbnf");
            }
        } else {
            stack.push(new GramNodeList(NONE_GO));
        }
    }

    @Override
    public void exitEbnf(ANTLRv4Parser.EbnfContext ctx) {
        GramAbstractNodeContainer gn = stack.pop();
        stack.peek().add(gn);
    }

//    @Override
//    public void enterNotSet(ANTLRv4Parser.NotSetContext ctx) {
//        System.out.println(getFullTextOriginal(ctx));
//    }
}
