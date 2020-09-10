/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import Modelo.Aliado;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public interface CRUD_Aliado {
    public List listar();
    public Aliado list(int id);
    public boolean add(Aliado per);
    public boolean edit(Aliado per);
    public boolean eliminar(int id);
 
}
