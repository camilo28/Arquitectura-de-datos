/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Patrocinador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaz.CRUD_Patrocinador;

/**
 *
 * @author Camilo Barbosa
 */
public class PatrocinadorDAO implements CRUD_Patrocinador {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Patrocinador p = new Patrocinador();

    @Override
    public List listar() {
        ArrayList<Patrocinador> list = new ArrayList<>();
        String sql = "select * from patrocinador";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Patrocinador per = new Patrocinador();
                per.setId(rs.getInt("Id"));
                per.setNit(rs.getString("NIT"));
                per.setNom(rs.getString("Nombres"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Patrocinador list(int id) {
        String sql = "select * from patrocinador where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                p.setId(rs.getInt("Id"));
                p.setNit(rs.getString("NIT"));
                p.setNom(rs.getString("Nombres"));

            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Patrocinador per) {
        String sql = "insert into patrocinador(NIT, Nombres)values('" + per.getNit() + "','" + per.getNom() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Patrocinador per) {
        String sql = "update Patrocinador set NIT='" + per.getNit() + "',Nombres='" + per.getNom() + "'where Id=" + per.getId();
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
        String sql = "delete from Patrocinador where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
