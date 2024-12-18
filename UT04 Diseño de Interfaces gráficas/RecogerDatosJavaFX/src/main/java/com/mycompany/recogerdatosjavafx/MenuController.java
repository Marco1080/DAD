/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.recogerdatosjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author 2damb
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Text userName;
    @FXML
    private Text userPass;
    @FXML
    private Text userState;
    @FXML
    private Text userCity;
    @FXML Text userBill;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setUser(String username) {
        this.userName.setText("Nombre: " + username);
    }
    public void setPass(String userpass) {
        this.userPass.setText("Contraseña: " + userpass);
    }
    public void setState(String userstate) {
        this.userState.setText("Estado: " + userstate);
    }
    
    public void setCity(String usercity) {
        this.userCity.setText("Ciudad: " + usercity);
    }
    
    public void setBill(String userbill) {
        this.userBill.setText("Sueldo: " + userbill);
    }
    
}
