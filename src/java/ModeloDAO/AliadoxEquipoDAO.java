/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaz.CRUD_AlixEqui;
import Modelo.AliadoxEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public class AliadoxEquipoDAO implements CRUD_AlixEqui{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    AliadoxEquipo alixequi = new AliadoxEquipo();
    @Override
    public List listar() {
       ArrayList<AliadoxEquipo> list = new ArrayList<>();
        String sql = "select * from aliadoxequipo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AliadoxEquipo alixequi = new AliadoxEquipo();
                alixequi.setId(rs.getInt("Id"));
                alixequi.setAliado(rs.getInt("aliado"));
                alixequi.setEquipo(rs.getInt("equipo"));
                list.add(alixequi);
            }
        } catch (Exception e) {
        }
        return list;
    }


    @Override
    public AliadoxEquipo list(int id) {
          String sql = "select * from aliadoxequipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                alixequi.setId(rs.getInt("Id"));
                alixequi.setAliado(rs.getInt("aliado"));
                alixequi.setEquipo(rs.getInt("equipo"));

            }
        } catch (Exception e) {
        }
        return alixequi;
    }

    @Override
    public boolean add(AliadoxEquipo alixequi) {
        String sql = "insert into aliadoxequipo(aliado, equipo)values(" + alixequi.getAliado()+ "," + alixequi.getEquipo()+ ")";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    @Override
    public boolean edit(AliadoxEquipo alixequi) {
         String sql = "update aliadoxequipo set aliado="+ alixequi.getAliado()+ ",equipo="+alixequi.getEquipo()+" where Id=" + alixequi.getId();
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
         String sql = "delete from aliadoxequipo where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
