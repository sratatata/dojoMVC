package net.zarski.gui.project0.controller;

import net.zarski.gui.project0.model.MyList;

public class ChildWindowControllerImpl implements ChildWindowController {
    private MyList model;

    public ChildWindowControllerImpl(MyList model) {
        this.model = model;
    }

    @Override
    public void addItem(String text) {
        model.addNewElement(text);
    }
}
