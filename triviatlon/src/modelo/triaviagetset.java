/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class triaviagetset {

    private int idUsuario;
    private String nombreUsuario;
    private String apeUsuario;
    private int ScoreUsuario;
    
    private int idPregunta;
    private String categoria;
    private String pregunta;
    private String respuesta;
    private String falsarespuesta1;
    private String falsarespuesta2;
    private String falsarespuesta3;

    public triaviagetset() {
        this.idUsuario = 1;
        this.nombreUsuario = "";
        this.apeUsuario = "";
        this.ScoreUsuario = 1;
        
        this.idPregunta = 1;
        this.categoria = "";
        this.pregunta = "";
        this.respuesta = "";
        this.falsarespuesta1 = "";
        this.falsarespuesta2 = "";
        this.falsarespuesta3 = "";
        
    }
    
    
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApeUsuario() {
        return apeUsuario;
    }

    public int getScoreUsuario() {
        return ScoreUsuario;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }

    public void setScoreUsuario(int ScoreUsuario) {
        this.ScoreUsuario = ScoreUsuario;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getFalsarespuesta1() {
        return falsarespuesta1;
    }

    public String getFalsarespuesta2() {
        return falsarespuesta2;
    }

    public String getFalsarespuesta3() {
        return falsarespuesta3;
    }

    public void setFalsarespuesta1(String falsarespuesta1) {
        this.falsarespuesta1 = falsarespuesta1;
    }

    public void setFalsarespuesta2(String falsarespuesta2) {
        this.falsarespuesta2 = falsarespuesta2;
    }

    public void setFalsarespuesta3(String falsarespuesta3) {
        this.falsarespuesta3 = falsarespuesta3;
    }
    
    
    
    
    
}
