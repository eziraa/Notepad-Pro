package com.app.notepadpro;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

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
        this.exitItem = new MenuItem("Exit        CTRL+N");
        this.getItems().addAll(this.newItem, this.openItem, this.openFolderItem, this.saveItem, this.saveAsItem, this.renameItem, this.closeItem, this.closeAllItem);
    }
}