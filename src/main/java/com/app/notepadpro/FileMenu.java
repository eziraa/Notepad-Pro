package com.app.notepadpro;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;

class FileMenu extends Menu {
    Menu fileMenu = new Menu("File");
    MenuItem newItem;
    MenuItem openItem;
    MenuItem openFolderItem;
    MenuItem saveItem;
    MenuItem saveAsItem;
    MenuItem renameItem;
    MenuItem closeItem;
    MenuItem closeAllItem;
    MenuItem exitItem;

    public FileMenu(TextArea textArea, Button saveBtn) {
        this.fileMenu.setStyle("-fx-font-size:20; ");
        this.newItem = new MenuItem("New");
        this.openItem = new MenuItem("Open");
        this.openFolderItem = new MenuItem("Open folder");
        this.saveItem = new MenuItem(("Save"));
        this.saveAsItem = new MenuItem("Save as ");
        this.renameItem = new MenuItem("Rename");
        this.closeItem = new MenuItem("Close");
        this.closeAllItem = new MenuItem("Close All");
        this.exitItem = new MenuItem("Exit");
        this.getItems().addAll(this.newItem, this.openItem, this.openFolderItem, this.saveItem, this.saveAsItem, this.renameItem, this.closeItem, this.closeAllItem);
    }

    public void addAccelatorKey(){
        this.newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
        this.openItem.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        this.saveItem.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        this.saveAsItem.setAccelerator(KeyCombination.keyCombination("Ctrl+Shift+S"));
        this.renameItem.setAccelerator(KeyCombination.keyCombination("Alt + fn2"));
        this.exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl + 0"));

    }

    public  void  handleEvents(){
            this.getNewFile();
    }

    public void getNewFile(){
        this.newItem.setOnAction(e->{
            NotepadPro.textArea.clear();
        });
    }
}