package com.example.transportproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Window;

import java.net.URL;
import java.util.ResourceBundle;

public class ArAblakController implements Initializable {

    @FXML
    private Button btnBezar;

    @FXML
    void bezar() {
        Window ablak = btnBezar.getScene().getWindow();
        ablak.hide();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
