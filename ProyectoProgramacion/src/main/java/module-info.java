module com.beagetella.proyectoprogramacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;
    requires java.desktop;
    requires javafx.graphics;
    requires java.base;

    opens com.beagetella.proyectoprogramacion to javafx.fxml;
    exports com.beagetella.proyectoprogramacion;
}
