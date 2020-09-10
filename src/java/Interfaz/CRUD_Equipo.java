/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Equipo;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public interface CRUD_Equipo {
    public List listar();
    public Equipo list(int id);
    public boolean add(Equipo per);
    public boolean edit(Equipo per);
    public boolean eliminar(int id);
}
