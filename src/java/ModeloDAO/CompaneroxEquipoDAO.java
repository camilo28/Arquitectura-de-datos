/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaz.CRUD_ComxEqui;
import Modelo.Companero;
import Modelo.CompaneroxEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public class CompaneroxEquipoDAO implements CRUD_ComxEqui{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    CompaneroxEquipo comxequi = new CompaneroxEquipo();
    
    
    @Override
    public List listar() {
        ArrayList<CompaneroxEquipo> list = new ArrayList<>();
        String sql = "select * from companeroxequipo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CompaneroxEquipo comxequi = new CompaneroxEquipo();
                comxequi.setId(rs.getInt("Id"));
                comxequi.setCompanero(rs.getInt("companero"));
                comxequi.setEquipo(rs.getInt("equipo"));
                list.add(comxequi);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public CompaneroxEquipo list(int id) {
           String sql = "select * from companeroxequipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                comxequi.setId(rs.getInt("Id"));
                comxequi.setCompanero(rs.getInt("companero"));
                comxequi.setEquipo(rs.getInt("equipo"));

            }
        } catch (Exception e) {
        }
        return comxequi;
    }

    @Override
    public boolean add(CompaneroxEquipo comxequi) {
        String sql = "insert into companeroxequipo(companero, equipo)values(" + comxequi.getCompanero()+ "," + comxequi.getEquipo()+ ")";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(CompaneroxEquipo comxequi) {
        String sql = "update companeroxequipo set companero="+ comxequi.getCompanero()+ ",equipo="+comxequi.getEquipo()+" where Id=" + comxequi.getId();
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
        String sql = "delete from companeroxequipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
