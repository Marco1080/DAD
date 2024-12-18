/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.recogerdatosjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
        String[] listaCiudades = {"Madrid", "Barcelona", "Ciudad de México", "Buenos Aires", 
            "Lima", "Santiago", "Bogotá", "Quito", "Caracas", "Montevideo", "São Paulo", 
            "Río de Janeiro", "Lagos", "Nairobi", "Londres", "París", "Roma", "Tokio", 
            "Seúl", "Pekín", "Los Ángeles"};
        ObservableList<String> observableList = FXCollections.observableArrayList(listaCiudades);
        userCity.setItems(observableList);
    }
    
    @FXML
    private TextField inputNombre;
    @FXML
    private TextField inputContrasena;
    @FXML
    Text errorMessage;
    @FXML
    private ToggleGroup estado;
    
    @FXML
    private ComboBox<String> userCity;
    
    @FXML
    private Slider userBill;
    
    @FXML
    private Text billValue;
    
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
        menuController.setState(((RadioButton)estado.getSelectedToggle()).getText());
        menuController.setCity(userCity.getValue());
        menuController.setBill("" + userBill.getValue());

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
    
    @FXML
    void updateBill(MouseEvent event) {
        billValue.setText("" + userBill.getValue());
        billValue.setText(String.format("%.2f€", userBill.getValue()));
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
