/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.CRUD;
import modelo.TriviatlonDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import vista.StartGame;
import java.util.Random;
import vista.Juegoterminado;
import vista.Winner;

/**
 *
 * @author Usuario
 */
public class controlador implements ActionListener {

    int bandera = 0;
    StartGame empezar = new StartGame();
    CRUD vistacrud = new CRUD();
    TriviatlonDAO trivia = new TriviatlonDAO();
    Juegoterminado gameover = new Juegoterminado();
    Winner win = new Winner();
    String abc = null;

    public controlador(StartGame empezar, CRUD vistacrud, TriviatlonDAO trivia) {

        this.vistacrud = vistacrud;
        this.trivia = trivia;
        this.empezar = empezar;
        this.vistacrud.BTNINSERTAR.addActionListener(this);
        this.empezar.ButtonA.addActionListener(this);
        this.gameover.jButton1.addActionListener(this);

        /*this.vistacrud.BTNCONSULTAR.addActionListener(this);
        
        this.vistacrud.BTNELIMINAR.addActionListener(this);
        this.vistacrud.BTNACTUALIZAR.addActionListener(this);*/
    }

    /*public StringBuffer casteo(int bandera) {

        Object[] columna = new Object[1];
        columna[0] = trivia.listartrivia().get(bandera).getRespuesta();
        StringBuffer cadena = new StringBuffer();
        for (int x = 0; x < columna.length; x++) {
            cadena = cadena.append(columna[x]);
        }
        System.out.println(cadena);
        return cadena;
    }*/
    public String casteo(int bandera) {

        Object[] columna = new Object[1];
        columna[0] = trivia.listartrivia().get(bandera).getRespuesta();
        String cadena = "";
        for (int x = 0; x < columna.length; x++) {
            cadena += columna[x];

        }
        //System.out.println(cadena);
        return cadena;
    }

    public int maximoUser() {

        int a = 0;

        Object[] columna = new Object[1];

        Object[] columna2 = new Object[1];

        int numUsers = trivia.maximoUser().size();

        for (int i = 0; i < numUsers; i++) {
            columna[0] = trivia.maximoUser().get(i).getIdUsuario();

            columna2[0] = (columna);

        }
        String cadena = "";
        for (int x = 0; x < columna2.length; x++) {
            cadena += columna[x];
        }
        a = Integer.parseInt(cadena) - 1;
        return a;
    }
    public String llenarIDUser(int bandera) {
        System.out.println(bandera);
        Object[] columna = new Object[3];
        Object[] columna1 = new Object[1];

        columna[0] = trivia.listarUsuario().get(bandera).getNombreUsuario();
        columna[1] = trivia.listarUsuario().get(bandera).getIdUsuario();
        columna1[0] = trivia.listarUsuario().get(bandera).getScoreUsuario();

        String cadena2 = "";
        for (int j = 0; j < columna1.length; j++) {
            cadena2 += "Tu Score es: " + columna1[j];
        }
        String cadena = "";
        for (int x = 0; x < columna.length; x++) {
            cadena += columna[x] + " - ";
        }
        return ("Hola " + cadena + cadena2);

    }

    /*public void llenarIDUser(JLabel kkk, int bandera) {
        System.out.println(bandera);
        Object[] columna = new Object[3];
        Object[] columna1 = new Object[1];

        columna[0] = trivia.listarUsuario().get(bandera).getNombreUsuario();
        columna[1] = trivia.listarUsuario().get(bandera).getIdUsuario();
        columna1[0] = trivia.listarUsuario().get(bandera).getScoreUsuario();

        String cadena2 = "";
        for (int x = 0; x < columna1.length; x++) {
            cadena2 += "Tu Score es: " + columna1[x];
        }
        String cadena = "";
        for (int x = 0; x < columna.length; x++) {
            cadena += columna[x] + " - ";
        }
        empezar.jLabel2.setText("Hola " + cadena + cadena2);

    }*/

    public void llenartabla(JTable Jtdatostrivia, int banda) {

        DefaultTableModel modelot = new DefaultTableModel();
        Jtdatostrivia.setModel(modelot);

        modelot.addColumn("Pregunta_Nro");
        modelot.addColumn("Categoria");
        modelot.addColumn("Pregunta");
        modelot.addColumn("A");
        modelot.addColumn("B");
        modelot.addColumn("C");
        modelot.addColumn("D");

        Object[] columna = new Object[7];

        int numtTriv = trivia.listartrivia().size();
        int bandera = banda;

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> nns = new ArrayList<>();

        for (int i = 3; i < 7; i++) {
            numeros.add(i);
            //System.out.println(i);
        }

        Random random = new Random();

        while (numeros.size() > 1) {

            int ramIn = random.nextInt(numeros.size());

            nns.add(numeros.get(ramIn));

            numeros.remove(ramIn);

        }

        if (!nns.contains(3)) {
            nns.add(3);

        } else if (!nns.contains(4)) {
            nns.add(4);
        } else if (!nns.contains(5)) {
            nns.add(5);
        } else if (!nns.contains(6)) {
            nns.add(6);
        }

        if (bandera < numtTriv) {
            columna[0] = trivia.listartrivia().get(bandera).getIdPregunta();
            columna[1] = trivia.listartrivia().get(bandera).getCategoria();
            columna[2] = trivia.listartrivia().get(bandera).getPregunta();
            columna[nns.get(0)] = trivia.listartrivia().get(bandera).getRespuesta();
            columna[nns.get(1)] = trivia.listartrivia().get(bandera).getFalsarespuesta1();
            columna[nns.get(2)] = trivia.listartrivia().get(bandera).getFalsarespuesta2();
            columna[nns.get(3)] = trivia.listartrivia().get(bandera).getFalsarespuesta3();
            modelot.addRow(columna);

        } else {

        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == vistacrud.BTNINSERTAR) {
            empezar.setVisible(true);
            String Nombre = vistacrud.Nombre.getText();
            String Apellido = vistacrud.Apellido.getText();
            Integer Score = 0;

            String respuesta = trivia.insertUsuario(Nombre, Apellido, Score);

            if (respuesta != null) {
                JOptionPane.showMessageDialog(null, respuesta);

            } else {
                JOptionPane.showMessageDialog(null, "Error");

            }

            vistacrud.hide();

            empezar.jLabel2.setText(llenarIDUser(maximoUser()));
            llenartabla(empezar.Jtdatostrivia, 0);
            //empezar.SCORE.hide();

        }
//////////////////////////////////////////////////////////////////////////////
        if (ae.getSource() == empezar.ButtonA) {
            //empezar.jLabel2.hide();
            //empezar.SCORE.show();
            
            
            String a = empezar.jLabelSelection.getText();
            String b = casteo(0);
            String c = casteo(bandera);
            bandera++;
            if (a.equals(b) || a.equals(c)) {
                ///////////////////////////////////////////////////////////
                empezar.jLabel2.setText(llenarIDUser(maximoUser())+1);
                String actScore = trivia.ActualizarScore(maximoUser()+1, bandera);
                
                if(bandera==25){
                    empezar.hide();
                    win.show();
                    
                
                }

                if (actScore != null) {
                    JOptionPane.showMessageDialog(null, actScore);
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Haz perdido la cabeza");
                empezar.hide();
                gameover.show();
                gameover.jLabel2.setText(llenarIDUser(maximoUser()));
            }
            empezar.jLabelSelection.setText("");
            
            llenartabla(empezar.Jtdatostrivia, bandera);
            

        }
        
        if (ae.getSource() == gameover.jButton1){
            vistacrud.show();
            gameover.hide();
            vistacrud.Nombre.setText("");
            vistacrud.Apellido.setText("");
        }
        System.out.println(bandera);
///////////////////////////////////////////////////////////////////////////////        

    }

}
