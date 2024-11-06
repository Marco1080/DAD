module com.mycompany.pcnexus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.pcnexus to javafx.fxml;
    exports com.mycompany.pcnexus;
}
