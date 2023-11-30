package com.myplugin.plsqlic3.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.event.SelectionEvent;
import com.intellij.openapi.editor.event.SelectionListener;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import static com.myplugin.plsqlic3.plugin.listener.MyTextSelectionListener.registerListener;

public class ParsePLSQLCodeAction extends AnAction implements DumbAware {

    private boolean textSelected = false;

    public ParsePLSQLCodeAction() {
        Editor selectedEditor = null;
        Editor[] editors = EditorFactory.getInstance().getAllEditors();
        for (Editor editor : editors) {
            if (editor.getSelectionModel().hasSelection()) {
                selectedEditor = editor;
                textSelected = true;
                break;
            }
        }

        if (selectedEditor != null) {
            selectedEditor.getSelectionModel().addSelectionListener(new SelectionListener() {
                @Override
                public void selectionChanged(@NotNull SelectionEvent e) {
                    textSelected = e.getEditor().getSelectionModel().hasSelection();
                }
            });
        }
    }


    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        if (textSelected) {
            Project project = e.getProject();
            if (project != null) {
                System.out.println("Auto action triggered on text selection");
            }
        }
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabledAndVisible(textSelected);
    }
}
