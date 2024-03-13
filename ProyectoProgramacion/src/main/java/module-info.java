module com.beagetella.proyectoprogramacion {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.beagetella.proyectoprogramacion to javafx.fxml;
    exports com.beagetella.proyectoprogramacion;
}
