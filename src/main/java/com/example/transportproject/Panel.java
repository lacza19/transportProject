package com.example.transportproject;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

public class Panel {

    public static void hiba(String cim, String uzenet) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(cim);
        alert.setHeaderText(null);
        alert.setContentText(uzenet);
        alert.showAndWait();
    }

    /**
     * Megerősítés kérése igen/nem párbeszédpanelen
     * @param cim: a panel címe
     * @param uzenet: a panelen megjelenő üzenet
     * @return: true, ha az Igen gombot választották,
     *          egyébként false
     */
    public static boolean igennem(String cim, String uzenet) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(cim);
        alert.setHeaderText(null);
        alert.setContentText(uzenet);
        ButtonType btIgen = new ButtonType("Igen", ButtonBar.ButtonData.YES);
        ButtonType btNem = new ButtonType("Nem", ButtonBar.ButtonData.NO);
        alert.getButtonTypes().setAll(btIgen, btNem);
        return alert.showAndWait().get() == btIgen;
    }


    public static boolean kalkulacio(String cim, String uzenet) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(cim);
        alert.setHeaderText(null);
        alert.setContentText(uzenet);
        ButtonType btIgen = new ButtonType("Igen", ButtonBar.ButtonData.YES);
        ButtonType btNem = new ButtonType("Nem", ButtonBar.ButtonData.NO);
        alert.getButtonTypes().setAll(btIgen, btNem);
        return alert.showAndWait().get() == btIgen;
    }

    public static void letrejott(String cim, String uzenet) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(cim);
        alert.setHeaderText(null);
        alert.setContentText(uzenet);
        alert.showAndWait();
    }
}
