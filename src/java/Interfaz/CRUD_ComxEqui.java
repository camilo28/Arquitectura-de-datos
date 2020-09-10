/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.CompaneroxEquipo;
import java.util.List;

/**
 *
 * @author Camilo Barbosa
 */
public interface CRUD_ComxEqui {
    public List listar();
    public CompaneroxEquipo list(int id);
    public boolean add(CompaneroxEquipo comxequi);
    public boolean edit(CompaneroxEquipo comxequi);
    public boolean eliminar(int id);
}
