package net.zarski.gui.project0.view;

import net.zarski.gui.project0.controller.ChildWindowController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChildWindow extends JFrame{
    ChildWindowController childWindowController = null;
    JTextField newItem;

    public ChildWindow(ChildWindowController childWindowController) {
        this.childWindowController = childWindowController;
        addTextField();
        addAddItemButton();
        //napewno brakuje zarzadzania widokie/layaoutem
    }

    private void addTextField(){
        newItem = new JTextField();
        this.add(newItem);
    }

    private void addAddItemButton(){
        JButton button = new JButton("Add");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                childWindowController.addItem(newItem.getText());
            }
        });
        this.add(button);
    }
}
