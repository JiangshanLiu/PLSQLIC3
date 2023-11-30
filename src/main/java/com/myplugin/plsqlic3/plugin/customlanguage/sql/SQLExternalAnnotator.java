package com.myplugin.plsqlic3.plugin.customlanguage.sql;

import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiRecursiveElementVisitor;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistencyInfo;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerParser;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.quickfix.MyIntentionAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

/**
 * An external annotator is an object that analyzes code in a document
 * and annotates the PSI elements with errors or warnings. Because such
 * analysis can be expensive, we don't want it in the GUI event loop. Jetbrains
 * provides this external annotator mechanism to run these analyzers out of band.
 */
public class SQLExternalAnnotator extends ExternalAnnotator<PsiFile, HashMap<InconsistencyInfo, SQLExternalAnnotator.Issue>> {
    // NOTE: can't use instance vars as only 1 instance

    public static class Issue {
        InconsistenciesType msg;
        PsiElement offendingNode;

        public Issue(InconsistenciesType msg, PsiElement node) {
            this.msg = msg;
            this.offendingNode = node;
        }
    }

    /**
     * Called first; in our case, just return file and do nothing
     */
    @Override
    @Nullable
    public PsiFile collectInformation(@NotNull PsiFile psiFile) {
        return psiFile;
    }

    /**
     * Called 2nd; look for trouble in file and return list of issues.
     * <p>
     * For most custom languages, you would not reimplement your semantic
     * analyzer using PSI trees. Instead, here is where you would call out to
     * your custom languages compiler or interpreter to get error messages
     * or other bits of information you'd like to annotate the document with.
     */
    @Nullable
    @Override
    public HashMap<InconsistencyInfo, Issue> doAnnotate(final PsiFile psiFile) {
//		Collection<? extends PsiElement> funcNameNodes =
//			XPath.findAll(SQLLanguage.INSTANCE, file, "/script/function/ID");
//		Collection<? extends PsiElement> funcCallNameNodes =
//			XPath.findAll(SQLLanguage.INSTANCE, file, "//call_expr/ID");
//
//		Map<String, PsiElement> funcNames = Trees.toMap(funcNameNodes);
//		Map<String, PsiElement> funcCalls = Trees.toMap(funcCallNameNodes);
//
//		List<Issue> issues = new ArrayList<>();
//		for (String name : funcCalls.keySet()) {
//			if ( !funcNames.containsKey(name) ) {
//				Issue issue = new Issue("Unknown function: "+name, funcCalls.get(name));
//				issues.add(issue);
//			}
//		}

        HashMap<InconsistencyInfo, InconsistenciesType> inconsistenciesMap = null;
        Language language = psiFile.getLanguage();
        ParserDefinition parserDefinition = LanguageParserDefinitions.INSTANCE.forLanguage(language);
        if (parserDefinition instanceof SQLParserDefinition) {
            SQLParserDefinition yourParserDefinition = (SQLParserDefinition) parserDefinition;
            if (yourParserDefinition.parser instanceof PostgreSQLPlpgsqlInnerParser) {
                PostgreSQLPlpgsqlInnerParser postgreSQLPlpgsqlInnerParser = (PostgreSQLPlpgsqlInnerParser) yourParserDefinition.parser;
                inconsistenciesMap = postgreSQLPlpgsqlInnerParser.inconsistencies_map;
//                System.out.println(postgreSQLPlpgsqlInnerParser.inconsistencies_map.size());
            }
        }

        HashMap<InconsistencyInfo, Issue> issues = new HashMap<>();
        HashMap<InconsistencyInfo, InconsistenciesType> finalInconsistenciesMap = inconsistenciesMap;
        ApplicationManager.getApplication().runReadAction(() -> {
            psiFile.accept(new PsiRecursiveElementVisitor() {
                @Override
                public void visitElement(@NotNull PsiElement element) {
//                    System.out.println("Element: " + element.getText());
//                    System.out.println("Offset: " + element.getTextRange().getStartOffset() + "\t" + element.getTextRange().getEndOffset());
                    InconsistencyInfo inconsistencyInfo = new InconsistencyInfo(element.getTextRange().getStartOffset(), element.getTextRange().getEndOffset() - 2);
                    assert finalInconsistenciesMap != null;
                    if (finalInconsistenciesMap.containsKey(inconsistencyInfo)) {
                        issues.put(inconsistencyInfo, new Issue(finalInconsistenciesMap.get(inconsistencyInfo), element));
                    }
                    for (PsiElement child : element.getChildren()) {
                        child.accept(this);
                    }
                }
            });
        });

        return issues;
    }

    /**
     * Called 3rd to actually annotate the editor window
     */
    @Override
    public void apply(@NotNull PsiFile psiFile,
                      HashMap<InconsistencyInfo, Issue> issues,
                      @NotNull AnnotationHolder holder) {
        for (Issue issue : issues.values()) {
            TextRange range = issue.offendingNode.getTextRange();
//			holder.createErrorAnnotation(range, issue.msg);
//            ProblemDescriptor problemDescriptor =

            holder.newAnnotation(HighlightSeverity.WARNING, String.format(issue.msg.getInconsTipTmplt(), issue.offendingNode.getText()))
                    .range(range)
                    .withFix(new MyIntentionAction(issue.offendingNode))
                    .create();
        }
    }
}
