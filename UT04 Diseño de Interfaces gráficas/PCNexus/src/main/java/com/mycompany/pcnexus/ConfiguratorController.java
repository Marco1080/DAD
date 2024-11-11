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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ConfiguratorController implements Initializable {

    @FXML
    private ComboBox<String> cpuComboBox;

    @FXML
    private Spinner<Integer> ramSpinner;

    @FXML
    private TextField storageField;

    @FXML
    private ChoiceBox<String> gpuChoiceBox;

    @FXML
    private Slider psuSlider;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        cpuComboBox.setItems(FXCollections.observableArrayList("Intel i5", "Intel i7", "AMD Ryzen 5", "AMD Ryzen 7"));
        cpuComboBox.getSelectionModel().selectFirst();

        ramSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(4, 64, 8));

        gpuChoiceBox.setItems(FXCollections.observableArrayList(
                "NVIDIA RTX 3060",
                "NVIDIA RTX 3070",
                "NVIDIA RTX 3080",
                "NVIDIA RTX 3090",
                "NVIDIA RTX 4070",
                "NVIDIA RTX 4080",
                "NVIDIA RTX 4090",
                "AMD Radeon RX 6600",
                "AMD Radeon RX 6700 XT",
                "AMD Radeon RX 6800",
                "AMD Radeon RX 6900 XT",
                "AMD Radeon RX 7600",
                "AMD Radeon RX 7700 XT",
                "AMD Radeon RX 7900 XTX"
        ));

        gpuChoiceBox.getSelectionModel().selectFirst();
        
    }
    
    @FXML
    void goBack(MouseEvent event) throws IOException {
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
