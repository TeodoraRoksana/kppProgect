module com.example.lab8 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires json.simple;

    opens com.example.lab8 to javafx.fxml;
    exports com.example.lab8;
}