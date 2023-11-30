package com.myplugin.plsqlic3.plugin.listener;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.SelectionEvent;
import com.intellij.openapi.editor.event.SelectionListener;
import com.intellij.openapi.editor.event.EditorEventMulticaster;
import com.intellij.openapi.project.DumbAware;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;
import com.myplugin.plsqlic3.middleware.data.CaseValidityData;
import com.myplugin.plsqlic3.plugin.ui.PLSQLHelperWindow;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.regex.Pattern;

import static com.myplugin.plsqlic3.middleware.casevalidity.CaseValidity.verifyCaseValidity;

public class MyTextSelectionListener implements SelectionListener, DumbAware {

    private final PLSQLHelperWindow plsqlHelperWindow;

    public MyTextSelectionListener(PLSQLHelperWindow plsqlHelperWindow) {
        this.plsqlHelperWindow = plsqlHelperWindow;
    }

    @Override
    public void selectionChanged(@NotNull SelectionEvent e) {
        plsqlHelperWindow.setEmptyInfoTable();

        Editor editor = e.getEditor();
        String selectedText = editor.getSelectionModel().getSelectedText();
        String regex = "^\\s*(?i)(create(\\s+or\\s+replace)?\\s+function)";
        if (selectedText != null) {
            if (Pattern.compile(regex).matcher(selectedText).find()) {
                CaseValidityData caseValidityData = verifyCaseValidity(selectedText);
                if (caseValidityData.isValid) {
                    plsqlHelperWindow.setArgsTable(caseValidityData);
                    return;
                }
            }
        }
        plsqlHelperWindow.setArgsTable(new CaseValidityData(false, new SqlIdMap<>()));
    }

    public static void registerListener(PLSQLHelperWindow plsqlHelperWindow) {
        EditorEventMulticaster eventMulticaster = EditorFactory.getInstance().getEventMulticaster();
        MyTextSelectionListener listener = new MyTextSelectionListener(plsqlHelperWindow);
        eventMulticaster.addSelectionListener(listener, new Disposable() {
            @Override
            public void dispose() {

            }
        });
    }

    public static void unregisterListener(PLSQLHelperWindow plsqlHelperWindow) {
        EditorEventMulticaster eventMulticaster = EditorFactory.getInstance().getEventMulticaster();
        MyTextSelectionListener listener = new MyTextSelectionListener(plsqlHelperWindow);
        eventMulticaster.removeSelectionListener(listener);
    }
}

