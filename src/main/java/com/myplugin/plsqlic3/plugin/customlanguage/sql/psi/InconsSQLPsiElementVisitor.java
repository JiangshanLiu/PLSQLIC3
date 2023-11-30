package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.codeInspection.InspectionManager;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.Language;
import com.intellij.lang.LanguageParserDefinitions;
import com.intellij.lang.ParserDefinition;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiRecursiveElementVisitor;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLLanguage;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLParserDefinition;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistencyInfo;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerParser;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class InconsSQLPsiElementVisitor extends SQLPsiElementVisitor {
    private final InconsistenciesType[] inconsistenciesType;
    private final InspectionManager manager;
    private final boolean isOnTheFly;
    private final List<ProblemDescriptor> problemDescriptors;
    private final LocalQuickFix[] quickfixes;

    public InconsSQLPsiElementVisitor(InconsistenciesType[] inconsistenciesType, InspectionManager manager, boolean isOnTheFly, LocalQuickFix[] quickfixes) {
        this.inconsistenciesType = inconsistenciesType;
        this.manager = manager;
        this.isOnTheFly = isOnTheFly;
        this.quickfixes = quickfixes;
        this.problemDescriptors = new ArrayList<>();
    }

    public ProblemDescriptor[] getProblemDescriptors() {
        return problemDescriptors.toArray(ProblemDescriptor.EMPTY_ARRAY);
    }

    @Override
    public void visitElement(@NotNull PsiElement element) {
//        System.out.println("ELEMENT: " + element.getText());
        HashMap<InconsistencyInfo, InconsistenciesType> inconsistenciesMap = null;
        Language language = element.getLanguage();
        if (language instanceof SQLLanguage) {
            ParserDefinition parserDefinition = LanguageParserDefinitions.INSTANCE.forLanguage(language);
            if (parserDefinition instanceof SQLParserDefinition) {
                SQLParserDefinition yourParserDefinition = (SQLParserDefinition) parserDefinition;
                if (yourParserDefinition.parser instanceof PostgreSQLPlpgsqlInnerParser) {
                    PostgreSQLPlpgsqlInnerParser postgreSQLPlpgsqlInnerParser = (PostgreSQLPlpgsqlInnerParser) yourParserDefinition.parser;
                    inconsistenciesMap = postgreSQLPlpgsqlInnerParser.inconsistencies_map;
                }
            }

            HashMap<InconsistencyInfo, PsiElement> issues = new HashMap<>();
            HashMap<InconsistencyInfo, InconsistenciesType> finalInconsistenciesMap = inconsistenciesMap;
            HashSet<InconsistenciesType> targetInconsistenciesType = new HashSet<>(Arrays.asList(this.inconsistenciesType));
            ApplicationManager.getApplication().runReadAction(() -> {
                element.accept(new PsiRecursiveElementVisitor() {
                    @Override
                    public void visitElement(@NotNull PsiElement element) {
//                        System.out.println("Element: " + element.getText());
//                        System.out.println("Offset: " + element.getTextRange().getStartOffset() + "\t" + element.getTextRange().getEndOffset());
                        if (element.getTextRange().getStartOffset() == 136 && element.getTextRange().getEndOffset() == 139) {
                            System.out.println(1);
                        }
                        int tail_whitespace = 0;
                        for (int i = element.getText().length() - 1; i >= 0 && Character.isWhitespace(element.getText().charAt(i)); i--) {
                            tail_whitespace++;
                        }
                        InconsistencyInfo inconsistencyInfo = new InconsistencyInfo(
                                element.getTextRange().getStartOffset(),
                                element.getTextRange().getEndOffset() - tail_whitespace - 1);
                        if (finalInconsistenciesMap != null) {
                            if (finalInconsistenciesMap.containsKey(inconsistencyInfo)
                                    && targetInconsistenciesType.contains(finalInconsistenciesMap.get(inconsistencyInfo))) {
                                issues.put(inconsistencyInfo, element);
                            }
                        }
                        for (PsiElement child : element.getChildren()) {
                            child.accept(this);
                        }
                    }
                });
            });

            for (InconsistencyInfo info : issues.keySet()) {
                if (finalInconsistenciesMap != null) {
                    ProblemDescriptor problemDescriptor = manager.createProblemDescriptor(
                            issues.get(info),
                            String.format(finalInconsistenciesMap.get(info).getInconsTipTmplt(), issues.get(info).getText().trim()),
                            isOnTheFly,
//                        LocalQuickFix.EMPTY_ARRAY,
                            this.quickfixes,
                            ProblemHighlightType.GENERIC_ERROR_OR_WARNING
                    );
                    problemDescriptors.add(problemDescriptor);
                }
            }
        }

        super.visitElement(element);
    }
}
