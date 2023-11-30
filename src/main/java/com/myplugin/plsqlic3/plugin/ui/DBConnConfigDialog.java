package com.myplugin.plsqlic3.plugin.ui;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.EditorTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class DBConnConfigDialog extends DialogWrapper {
    EditorTextField tfHost;
    EditorTextField tfPort;
    EditorTextField tfUserName;
    EditorTextField tfPasswd;
    EditorTextField tfDBName;
    EditorTextField tfSchema;


    public DBConnConfigDialog() {
        super(true);
        setTitle("Database Connection Config");
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel panel = new JPanel(new GridLayout(6,2));

        tfHost = new EditorTextField();
        Label lbHost = new Label("Host:");
        panel.add(lbHost);
        panel.add(tfHost);

        tfPort = new EditorTextField();
        Label lbPort = new Label("Port:");
        panel.add(lbPort);
        panel.add(tfPort);

        tfUserName = new EditorTextField();
        Label lbUserName = new Label("User Name:");
        panel.add(lbUserName);
        panel.add(tfUserName);

        tfPasswd = new EditorTextField();
        Label lbPasswd = new Label("Password:");
        panel.add(lbPasswd);
        panel.add(tfPasswd);

        tfDBName = new EditorTextField();
        Label lbDBName = new Label("Database Name:");
        panel.add(lbDBName);
        panel.add(tfDBName);

        tfSchema = new EditorTextField();
        Label lbSchema = new Label("Schema:");
        panel.add(lbSchema);
        panel.add(tfSchema);

        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton btTest = new JButton("Test Connection");
        btTest.addActionListener(e -> {
            System.out.println(tfHost.getText());
        });
        JButton btConn = new JButton("Connect");
        panel.add(btTest);
        panel.add(btConn);
        return panel;
    }
}
