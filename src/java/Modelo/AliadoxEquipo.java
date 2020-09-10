/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camilo Barbosa
 */
public class AliadoxEquipo {
    int id;
    int aliado;
    int equipo;

    public AliadoxEquipo() {
    }

    public AliadoxEquipo(int id, int aliado, int equipo) {
        this.id = id;
        this.aliado = aliado;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAliado() {
        return aliado;
    }

    public void setAliado(int aliado) {
        this.aliado = aliado;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
    
}
