package com.mycompany.pcnexus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class AccesibilidadVisualController {

    @FXML
    private VBox rootPane;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Button btnAumentar;
    @FXML
    private Button btnDisminuir;
    @FXML
    private Label textoEjemplo;

    private double fontSize = 14;

    public void initialize() {
        colorPicker.setOnAction(event -> {
            Color color = colorPicker.getValue();
            String hexColor = String.format("#%02X%02X%02X",
                    (int) (color.getRed() * 255),
                    (int) (color.getGreen() * 255),
                    (int) (color.getBlue() * 255));
            rootPane.setStyle("-fx-background-color: " + hexColor + ";");
        });

        btnAumentar.setOnAction(event -> {
            fontSize += 2;
            textoEjemplo.setStyle("-fx-font-size: " + fontSize + "px;");
        });

        btnDisminuir.setOnAction(event -> {
            if (fontSize > 8) {
                fontSize -= 2;
                textoEjemplo.setStyle("-fx-font-size: " + fontSize + "px;");
            }
        });
    }
}
