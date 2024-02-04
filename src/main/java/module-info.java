module com.example.notepadpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notepadpro to javafx.fxml;
    exports com.example.notepadpro;
}