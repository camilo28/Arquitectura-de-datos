/*
 * To change this license header, choose License Headers in Project Proequities.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaz.CRUD_Equipo;
import Modelo.Equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public class EquipoDAO implements CRUD_Equipo {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Equipo p = new Equipo();

    @Override
    public List listar() {
        ArrayList<Equipo> list = new ArrayList<>();
        String sql = "select * from equipo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Equipo equi = new Equipo();
                equi.setId(rs.getInt("Id"));
                equi.setNom(rs.getString("Nombres"));
                list.add(equi);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Equipo list(int id) {
        String sql = "select * from equipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                p.setId(rs.getInt("Id"));
                p.setNom(rs.getString("Nombres"));

            }
        } catch (Exception e) {
        }
        return p;
    }


@Override
        public boolean add(Equipo equi) {
             String sql = "insert into equipo(Nombres)values('" + equi.getNom() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;}

    @Override
        public boolean edit(Equipo equi) {
          String sql = "update equipo set Nombres='" + equi.getNom() + "'where Id=" + equi.getId();
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
          String sql = "delete from equipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
        }
    
}
