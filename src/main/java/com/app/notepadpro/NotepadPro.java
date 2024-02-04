package com.example.notepadpro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NotepadPro extends Application {
    public static Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        MenuBar topMenuBar = new MenuBar();
        TextArea textArea = new TextArea();
        Button saveBtn = new Button("Save");
        Menu fileMenu = new FileMenu(textArea,saveBtn);
        fileMenu.setText("File");
        Menu editMenu = new Menu();
        editMenu.setText("Edit");
        Menu searchMenu = new Menu("Search");
        Menu viewMenu = new Menu("View ");
        Menu encodingMenu = new Menu("Encoding");
        Menu languageMenu = new Menu("Language");
        Menu settingsMenu = new Menu("Settings");
        Menu toolsMenu = new Menu("Tools");
        Menu windowMenu = new Menu("Window");
        topMenuBar.getMenus().addAll(fileMenu,editMenu,searchMenu,viewMenu,encodingMenu,languageMenu,settingsMenu,toolsMenu,windowMenu);
        textArea.setMinSize(500,500);
        textArea.setStyle("-fx-text-fill: blue;");
        label = new Label();
        label.setText("1");
        Scene scene =  new Scene(vBox,800,600);
        stage.setScene(scene);
        stage.show();
    }
    }