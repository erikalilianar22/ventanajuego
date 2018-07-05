/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author erikav
 */
public class Jugador {
    //public String nombre;
    public SimpleStringProperty nombre= new SimpleStringProperty();
    
    public Jugador(){
    }
    
    
    
/*
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */

    public String getNombre() {
        return nombre.get();
    }


    
}
