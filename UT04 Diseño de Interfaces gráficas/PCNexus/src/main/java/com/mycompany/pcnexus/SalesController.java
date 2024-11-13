/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.pcnexus;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tonyi
 */
public class SalesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Text errorMessage;

    @FXML
    private CheckBox politicas;

    @FXML
    private ComboBox<String> tipoBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tipoBox.setItems(FXCollections.observableArrayList(
                "Equipo premontado",
                "Hardware",
                "Servicios varios.",
                "Otros"
        ));
    }

    private Parent loadFXML(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml + ".fxml"));
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return null;

        }

    }

    @FXML
    void comprobarPolitica(MouseEvent event) throws IOException {
        if (!politicas.isSelected()) {
            errorMessage.setText("Debe aceptar las politicas de datos.");
        } else {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loadFXML("menu"));
            scene.getStylesheets().add(getClass().getResource("loginStyles.css").toExternalForm());
            stage.setTitle("Menu");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void goBack(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loadFXML("menu"));
        scene.getStylesheets().add(getClass().getResource("loginStyles.css").toExternalForm());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }
}
