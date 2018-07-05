/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanajuego;

import Jugador.Jugador;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

/**
 *
 * @author erikav
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label nombre;
    @FXML
    private TextField Textnombre;
    @FXML
    private Button button;
    
    List<Jugador> jugadores;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Guardar");
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void mouseDentroBoton(MouseDragEvent event) {
        Jugador jugador= new Jugador();
        jugador.nombre.set(Textnombre.getText());
        jugadores.add(jugador);
        
    }
    
}
