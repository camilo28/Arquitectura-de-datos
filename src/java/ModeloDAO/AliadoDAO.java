/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaz.CRUD_Aliado;
import Modelo.Aliado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public class AliadoDAO implements CRUD_Aliado {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aliado a = new Aliado();

    @Override
    public List listar() {
        ArrayList<Aliado> list = new ArrayList<>();
        String sql = "select * from aliado";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Aliado a = new Aliado();
                a.setId(rs.getInt("Id"));
                a.setDni(rs.getString("DNI"));
                a.setNom(rs.getString("Nombres"));
                list.add(a);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Aliado list(int id) {
         String sql = "select * from aliado where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                a.setId(rs.getInt("Id"));
                a.setDni(rs.getString("DNI"));
                a.setNom(rs.getString("Nombres"));

            }
        } catch (Exception e) {
        }
        return a;
    }

    @Override
    public boolean add(Aliado per) {
        String sql = "insert into aliado(DNI, Nombres)values('" + per.getDni() + "','" + per.getNom() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    @Override
    public boolean edit(Aliado per) {
         String sql = "update aliado set DNI='" + per.getDni() + "',Nombres='" + per.getNom() + "'where Id=" + per.getId();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }


    @Override
    public boolean eliminar(int id) {
       String sql = "delete from aliado where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
            
        }
        return false;
    }
}
