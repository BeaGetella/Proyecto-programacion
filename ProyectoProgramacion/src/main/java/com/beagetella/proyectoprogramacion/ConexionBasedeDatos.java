/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beagetella.proyectoprogramacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iglesiadecristo
 */
public class ConexionBasedeDatos {
    static String url="jdbc:postgresql://localhost:5432/GestionDeBiblioteca";
    static String user="postgres";
    static String password="suga";
    
    //metodos para crear la conexion con la base de datos
    
    public static Connection conexionBasedeDatos(){
        try {
            //crea una conexion con suga mi base de datos
            Connection conexion = DriverManager.getConnection(url, user, password);
            return conexion;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
            //si no se esta creando una conexion nula
        Connection fail=null;
        return fail;
        }
        
    }
    
    //metodo que ayuda a realizar consultas en la base de datos
    
    public static ResultSet ConsultaBasedeDatos (String queryURL){
       try {
        Connection conexion = conexionBasedeDatos(); 
       Statement estado = conexion.createStatement();
       ResultSet consulta = estado.executeQuery(queryURL);
        return consulta; 
           
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
            ResultSet fail = null;
            return fail;
        }
       
        
               
    }
}
