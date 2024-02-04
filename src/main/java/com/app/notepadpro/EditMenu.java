package com.app.notepadpro;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

class EditMenu extends Menu {
    public MenuItem undo;
    public MenuItem redo;
    public MenuItem cut;
    public MenuItem copy;
    public MenuItem paste;
    public MenuItem delete;
    public MenuItem selectAll;
    public MenuItem beginEndSelect;


    public EditMenu(){
        this.undo = new MenuItem("Undo");
        this.redo = new MenuItem("Redo");
        this.cut = new MenuItem("Cut");
        this.copy = new MenuItem("Copy");
        this.paste = new MenuItem("Paste");
        this.delete = new MenuItem("Delete");
        this.selectAll = new MenuItem("Select All");
        this.beginEndSelect = new MenuItem("Begin /End Select");
        this.getItems().addAll(this.undo,this.redo,this.cut,this.copy,this.paste,this.delete,this.selectAll,this.beginEndSelect);
    }
}