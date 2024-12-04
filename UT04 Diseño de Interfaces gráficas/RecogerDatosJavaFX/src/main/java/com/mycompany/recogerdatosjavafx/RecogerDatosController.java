/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.recogerdatosjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 2damb
 */
public class RecogerDatosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private TextField inputNombre;
    @FXML
    private TextField inputContrasena;
    @FXML
    Text errorMessage;

    @FXML
    void enviarDatos(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root = loader.load();
        if (inputNombre.getText().isEmpty()) {
            //errorMessage.setText("Debes asignar un nombre");
            alerta("Debes asignar un nombre");
            return;
        }
        if (inputContrasena.getText().isEmpty()) {
            errorMessage.setText("Debes asignar una contraseña");
            alerta("Debes asignar una contraseña");
            return;
        }

        MenuController menuController = loader.getController();
        menuController.setUser(inputNombre.getText());
        menuController.setPass(inputContrasena.getText());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void limpiarDatos(MouseEvent event) {
        inputNombre.setText("");
        inputContrasena.setText("");
        errorMessage.setText("");
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public void alerta(String message){
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Campos incompletos:");
        alerta.setHeaderText(message);
        alerta.setContentText(">:C");
        alerta.showAndWait();
        return;
    }
}
