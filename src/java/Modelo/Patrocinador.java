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
public class Patrocinador {
    int id;
    String nit;
    String nom;

    public Patrocinador(int id, String nit, String nom) {
        this.id = id;
        this.nit = nit;
        this.nom = nom;
    }

    public Patrocinador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
