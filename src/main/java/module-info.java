module com.example.regformrevised {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regformrevised to javafx.fxml;
    exports com.example.regformrevised;
}