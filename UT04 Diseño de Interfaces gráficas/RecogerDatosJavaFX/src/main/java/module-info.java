module com.mycompany.recogerdatosjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens com.mycompany.recogerdatosjavafx to javafx.fxml;
    exports com.mycompany.recogerdatosjavafx;
}
