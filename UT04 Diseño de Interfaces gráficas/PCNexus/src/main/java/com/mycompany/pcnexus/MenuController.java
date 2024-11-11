/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.pcnexus;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 2damb
 */
public class MenuController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    Text userName;

    public void setUser(String username) {
        this.userName.setText(username);
    }

    @FXML
    void openProfile(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loadFXML("profile"));
        scene.getStylesheets().add(getClass().getResource("profileStyles.css").toExternalForm());
        stage.setTitle("Profile");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openConfigurator(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loadFXML("configurator"));
        scene.getStylesheets().add(getClass().getResource("configuratorStyles.css").toExternalForm());
        stage.setTitle("Configurator");
        stage.setScene(scene);
        stage.show();
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
    void goBack(MouseEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loadFXML("login"));
        scene.getStylesheets().add(getClass().getResource("loginStyles.css").toExternalForm());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void goAccesibility(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Accesibility");
        Scene sceneAccesibility = new Scene(loadFXML("accesibilidadVisual"));
        stage.setScene(sceneAccesibility);
        stage.show();
    }
    
}
