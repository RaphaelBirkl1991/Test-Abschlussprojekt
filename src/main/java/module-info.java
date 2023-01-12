module com.example.abschlussprojekt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.abschlussprojekt to javafx.fxml;
    exports com.example.abschlussprojekt;
}