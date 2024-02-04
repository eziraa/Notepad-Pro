package com.example.notepadpro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        Scene scene =  new Scene(vBox,800,600);
        stage.setScene(scene);
        stage.show();
    }
    }