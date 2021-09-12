/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class conexion {
    public conexion() {
    }

    public Connection getConexion() {

        String URL = "jdbc:mysql://localhost:3306/triviatlon";
        String USERNAME = "root";
        String PASSWORD = "1107511465-3";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (conn != null){
                System.out.println("Conexión correcta a base de datos");
            }
        } catch(SQLException es){
            es.printStackTrace();
        }
        
        return conn;
        
    }
    
}
 
