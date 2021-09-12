/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviatlon;
import modelo.TriviatlonDAO;
import controlador.*;
import vista.StartGame;
import vista.CRUD;
import java.sql.*;



/**
 *
 * @author Usuario
 */
public class Triviatlon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        StartGame star = new StartGame();
        CRUD vista1 =   new CRUD();
        TriviatlonDAO prod1 = new TriviatlonDAO();
        
        controlador control1 = new controlador(star, vista1, prod1);
        
        vista1.setVisible(true);
    }
    
}
