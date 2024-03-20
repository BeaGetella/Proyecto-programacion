module com.beagetella.proyectoprogramacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.beagetella.proyectoprogramacion to javafx.fxml;
    exports com.beagetella.proyectoprogramacion;
}
