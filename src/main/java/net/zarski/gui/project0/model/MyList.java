package net.zarski.gui.project0.model;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List elements;

    public MyList() {
        this.elements = new ArrayList<String>();
    }

    public void addNewElement(String text){
        elements.add(text);
    }
}
