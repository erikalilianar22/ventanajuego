/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaces.metodos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.jugadorbase;

/**
 *
 * @author erikav
 */
public class jugadorbaseDao implements metodos<jugadorbase>{
    private static final String SQL_INSERT="INSERT INTO jugador(id, nombre) VALUES (?, ?)";
    private static final String SQL_UPDATE="UPDATE jugador SET nombre=? WHERE id=?";
    private static final String SQL_READALL="SELECT *FROM jugador";
    private static final Conexion con= Conexion.conectar();

    @Override
    public boolean create(jugadorbase g) {
        PreparedStatement ps;
        try{
            ps=con.getCnx().clientPrepareStatement(SQL_INSERT);
            ps.setInt(1, g.getId());
            ps.setString(2,g.getNombre());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(jugadorbaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(jugadorbase c) {
        PreparedStatement ps;
        try{
            System.out.println(c.getId());
            ps=con.getCnx().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNombre());
            if(ps.executeUpdate()<0){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(jugadorbaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public ArrayList<jugadorbase> readAll() {
        ArrayList<jugadorbase> all =new ArrayList<>();
        Statement s;
        ResultSet rs;
        try{
            s=con.getCnx().prepareStatement(SQL_READALL);
        } catch (SQLException ex) {
            Logger.getLogger(jugadorbaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }
    
}
