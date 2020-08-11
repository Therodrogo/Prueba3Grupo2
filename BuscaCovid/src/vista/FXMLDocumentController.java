/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        menuInicio.setVisible(true);
        juego.setVisible(false);
    }    

    @FXML
    private void crearPrincipiante(MouseEvent event) {
        int tamanio = 9;
        crearTabla(tamanio);
    }

    @FXML
    private void crearIntermedio(MouseEvent event) {
        int tamanio = 16;
        crearTabla(tamanio);
    }

    @FXML
    private void crearAvanzado(MouseEvent event) {
        int tamanio = 32;
        crearTabla(tamanio);
    }
    public void crearTabla(int tamanio){
        Tabla  = new int [tamanio][tamanio];
        
    }

    @FXML
    private void iniciarJuego(MouseEvent event) {
        menuInicio.setVisible(false);
        juego.setVisible(true);
        fondo.setVisible(false);
    }
}   
