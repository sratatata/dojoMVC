package net.zarski.gui.project0;

import net.zarski.gui.project0.controller.ChildWindowController;
import net.zarski.gui.project0.controller.ChildWindowControllerImpl;
import net.zarski.gui.project0.controller.StartWindowController;
import net.zarski.gui.project0.model.MyList;
import net.zarski.gui.project0.view.ChildWindow;
import net.zarski.gui.project0.view.StartWindow;

import javax.swing.*;

public class Application{
    public static void main(String[] args) {
        MyList myList = new MyList();

        //should be as separate file
        StartWindowController swc = new StartWindowController() {
            @Override
            public void openChildWindow() {
                ChildWindowController childWindowController = new ChildWindowControllerImpl(myList);
                JFrame jFrame = new ChildWindow(childWindowController);

                jFrame.setVisible(true);
            }
        };
        StartWindow sw = new StartWindow(swc);
        sw.setVisible(true);
    }
}
