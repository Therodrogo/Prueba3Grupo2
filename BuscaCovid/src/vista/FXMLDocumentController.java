/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author pablo,nicolas eduardo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button principiante;
    @FXML
    private Button Intermedio;
    @FXML
    private Button Avanzado;
    
    int Tabla [][] ;
    @FXML
    private Pane menuInicio;
    @FXML
    private Pane juego;
    @FXML
    private Button jugar;
    @FXML
    private ImageView fondo;
    int totalBombas=0;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        menuInicio.setVisible(true);
        juego.setVisible(false);
        
        
        
    }    

    @FXML
    private void crearPrincipiante(MouseEvent event) {
        int tamanio = 9;
        totalBombas=13;
        crearTabla(tamanio,totalBombas);
    }

    @FXML
    private void crearIntermedio(MouseEvent event) {
        int tamanio = 16;
        totalBombas=40;
         crearTabla(tamanio,totalBombas);
    }

    @FXML
    private void crearAvanzado(MouseEvent event) {
        int tamanio = 32;
        totalBombas=160;
         crearTabla(tamanio,totalBombas);
    }
    public void crearTabla(int tamanio,int Bombas){
        Tabla  = new int [tamanio][tamanio];
        
        Random random = new Random();



        for (int i = 0; i < Bombas; i++) {
            int x = random.nextInt(tamanio);
            int y = random.nextInt(tamanio);
            if (Tabla[x][y]!=1) {
                Tabla[x][y] = 1;
                System.out.println(x+" , "+y);
            }else{
                i--;
            }

            

        }

//        for (int i = 0; i < Tabla.length; i++) {
//
//            for (int j = 0; j < Tabla.length; j++) {
//                System.out.print(Tabla[i][j]);
//            }
//            System.out.println("");
//        }
        
        
        
    }

    @FXML
    private void iniciarJuego(MouseEvent event) {
        menuInicio.setVisible(false);
        juego.setVisible(true);
        fondo.setVisible(false);
        
    }
}   
