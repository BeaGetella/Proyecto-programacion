package com.beagetella.proyectoprogramacion;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() {
        
        //App.setRoot("secondary");
        try {
            String consulta = "Select * from Autor";
           ResultSet  rs = ConexionBasedeDatos.ConsultaBasedeDatos(consulta);
           if (rs.next()){
               System.out.println(rs.getString("nombre_autor"));
           }
        }catch (SQLException e) {
            
        }
    }
}
