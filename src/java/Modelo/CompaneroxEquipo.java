/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.ManyToOne;

/**
 *
 * @author Camilo Barbosa
 */
public class CompaneroxEquipo {
    int id;
    
    private int companero;
   
    private int equipo;

    public CompaneroxEquipo() {
    }

    public CompaneroxEquipo(int id, int companero, int equipo) {
        this.id = id; 
        this.companero = companero;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanero() {
        return companero;
    }

    public void setCompanero(int companero) {
        this.companero = companero;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

   

    
    
}
