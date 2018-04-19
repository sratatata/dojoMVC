package net.zarski.gui.project0.view;

import net.zarski.gui.project0.controller.StartWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame{
    private StartWindowController controller;

    public StartWindow(StartWindowController controller) throws HeadlessException {
        this.controller = controller;
        addLabel();
        addButton();
    }

    private void addLabel() {
        this.add(new JLabel("Hello in my GUI application"));
    }

    private void addButton(){
        JButton button = new JButton("Open Window");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.openChildWindow();
            }
        });
        this.add(button);
    }



}