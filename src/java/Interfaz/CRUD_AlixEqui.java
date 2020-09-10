/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import Modelo.AliadoxEquipo;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public interface CRUD_AlixEqui {
    public List listar();
    public AliadoxEquipo list(int id);
    public boolean add(AliadoxEquipo comxequi);
    public boolean edit(AliadoxEquipo comxequi);
    public boolean eliminar(int id);
 
}
