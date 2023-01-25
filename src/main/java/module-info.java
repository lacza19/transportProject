module com.example.transportproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.transportproject to javafx.fxml;
    exports com.example.transportproject;
}