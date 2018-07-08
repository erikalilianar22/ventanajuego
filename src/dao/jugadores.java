/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Jugador.Jugador;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erikav
 */
public class jugadores {
    private final String TABLE_NAME = "jugadores";
    private final String id= "_id";
    private final String nombre = "nombre";
    
    //obtiene a los jugadores
    public void guardar (Jugador jugador){
        java.sql.Connection con= null;
        try{
            con = (Connection) Conexion.getInstance();
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO"+jugador+"("+nombre+","+")"+"VALUES(?)");
            preparedStatement.setString(1, jugador.getNombre());
            preparedStatement.execute();
            preparedStatement.close();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
