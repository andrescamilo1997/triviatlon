/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TriviatlonDAO {

    conexion conexion;

    public TriviatlonDAO() {
        conexion = new conexion();
    }

    public String insertUsuario(String nombreUsuario, String apeUsuario, int ScoreUsuario) {
        String respuesta = "";
        try {
            Connection accesodb = conexion.getConexion();
            String sql = "INSERT into usuario(nombreUsuario, apeUsuario, ScoreUsuario) "
                    + "VALUES (?,?,?)";
            PreparedStatement statement = accesodb.prepareStatement(sql);
            statement.setString(1, nombreUsuario);
            statement.setString(2, apeUsuario);
            statement.setInt(3, ScoreUsuario);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                respuesta = "ADELANTE";

            }

            accesodb.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respuesta;

    }

    public ArrayList<triaviagetset> listartrivia() {
        ArrayList<triaviagetset> preguntas = new ArrayList<>();
        triaviagetset triv;
        

        try {

            Connection accesodb = conexion.getConexion();
            String select = "SELECT * FROM preguntas";
            Statement statement1 = accesodb.createStatement();
            ResultSet resultado = statement1.executeQuery(select);
            
            while (resultado.next()) {
                triv = new triaviagetset();
                triv.setIdPregunta(resultado.getInt(1));
                triv.setCategoria(resultado.getString(2));
                triv.setPregunta(resultado.getString(3));
                triv.setRespuesta(resultado.getString(4));
                triv.setFalsarespuesta1(resultado.getString(5));
                triv.setFalsarespuesta2(resultado.getString(6));
                triv.setFalsarespuesta3(resultado.getString(7));

                preguntas.add(triv);
            }

            accesodb.close();
            /*Connection accesodb = conexion.getConexion();
            String sql = "select * from preguntas where idPregunta = ?";
            int bandera = 1;
            PreparedStatement statement = accesodb.prepareStatement(sql);
            statement.setInt(1, bandera);
            
            listartrivia = statement.executeQuery();
            
            while(listartrivia.next()){
                pregunta = listartrivia.getString("pregunta");
                respuesta  = listartrivia.getString("respuesta");
            
            }*/

            accesodb.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preguntas;
    }
    public ArrayList<triaviagetset> maximoUser  (){
        ArrayList<triaviagetset> usuariosmax = new ArrayList<>();
        triaviagetset triv;
        try {
            Connection accesodb = conexion.getConexion();
            String select = "select max(idUsuario) from  usuario";
            Statement statement1 = accesodb.createStatement();
            ResultSet resultado = statement1.executeQuery(select);

            while (resultado.next()) {
                triv = new triaviagetset();
                triv.setIdUsuario(resultado.getInt(1));

                usuariosmax.add(triv);
            }
            accesodb.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuariosmax;
    }
    
    public ArrayList<triaviagetset> listarUsuario() {

        ArrayList<triaviagetset> usuarios = new ArrayList<>();
        triaviagetset triv;
        try {
            Connection accesodb = conexion.getConexion();
            String select = "SELECT * FROM usuario";
            Statement statement1 = accesodb.createStatement();
            ResultSet resultado = statement1.executeQuery(select);

            while (resultado.next()) {
                triv = new triaviagetset();
                triv.setIdUsuario(resultado.getInt(1));
                triv.setNombreUsuario(resultado.getString(2));
                triv.setApeUsuario(resultado.getString(3));
                triv.setScoreUsuario(resultado.getInt(4));

                usuarios.add(triv);
            }
            accesodb.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    public ArrayList<triaviagetset> listarRespuesta() {
        ArrayList<triaviagetset> preguntas = new ArrayList<>();
        triaviagetset triv;
        

        try {

            Connection accesodb = conexion.getConexion();
            String select = "SELECT respuesta FROM preguntas";
            Statement statement1 = accesodb.createStatement();
            ResultSet resultado = statement1.executeQuery(select);
            
            while (resultado.next()) {
                triv = new triaviagetset();
                triv.setRespuesta(resultado.getString(4));
                
                preguntas.add(triv);
            }

            accesodb.close();
            /*Connection accesodb = conexion.getConexion();
            String sql = "select * from preguntas where idPregunta = ?";
            int bandera = 1;
            PreparedStatement statement = accesodb.prepareStatement(sql);
            statement.setInt(1, bandera);
            
            listartrivia = statement.executeQuery();
            
            while(listartrivia.next()){
                pregunta = listartrivia.getString("pregunta");
                respuesta  = listartrivia.getString("respuesta");
            
            }*/

            accesodb.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preguntas;
    }
    
    public String ActualizarScore(int idUsuario, int ScoreUsuario) {
        String respuesta = null;
        try {
            Connection accesodb = conexion.getConexion();
            String SQL = "UPDATE usuario SET ScoreUsuario = ? WHERE idUsuario = ?";
            PreparedStatement statement = accesodb.prepareStatement(SQL);
            statement.setInt(1, ScoreUsuario);
            statement.setInt(2, idUsuario);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                respuesta = "Subiste de dificultad";
            }
            accesodb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuesta;

    }

}
