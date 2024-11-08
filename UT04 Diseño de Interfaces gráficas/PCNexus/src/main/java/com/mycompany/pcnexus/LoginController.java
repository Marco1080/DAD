/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.pcnexus;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 2damb
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    TextField inputUser;
    @FXML
    PasswordField inputPassword;
    @FXML
    private Button loginEvent;
    @FXML
    Text errorMessage;

    @FXML
    void loginEvent(MouseEvent event) throws IOException {
        if ((inputUser.getText()).isEmpty() && (inputPassword.getText()).isEmpty()) {
            errorMessage.setText("User and password are empty");
            return;
        }

        if ((inputUser.getText()).isEmpty()) {
            errorMessage.setText("User is empty.");
            return;
        }
        if ((inputPassword.getText()).isEmpty()) {
            errorMessage.setText("Password is empty.");
            return;
        }
        errorMessage.setText("");
        //Stage stage = (Stage)((Node)((EventObject) eventVariable).getSource()).getScene().getWindow();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loadFXML("menu"));
        scene.getStylesheets().add(getClass().getResource("menuStyles.css").toExternalForm());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
