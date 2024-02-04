package com.app.notepadpro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotepadPro extends Application {
    public static Label numberLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox allContainer = new VBox();
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
        textArea.setMinSize(1200,800);
        textArea.setStyle("-fx-text-fill: blue;");
        numberLabel = new Label();
        numberLabel.setText("1");
        numberLabel.setStyle("-fx-font-size: 20px;");
        textArea.setStyle("-fx-font-size: 16px;");
        HBox horizontalContainer = new HBox();
        horizontalContainer.getChildren().addAll(numberLabel, textArea);
        allContainer.getChildren().addAll(topMenuBar, horizontalContainer);
        Scene scene =  new Scene(allContainer,1200,800);
        stage.setScene(scene);
        stage.show();
    }
    }