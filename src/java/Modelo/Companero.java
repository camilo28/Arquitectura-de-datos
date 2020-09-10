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
public class Companero {
    int id;
    String dni;
    String nom;

    public Companero() {
    }

    public Companero( String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Companero{" + "id=" + id + ", dni=" + dni + ", nom=" + nom + '}';
    }
    
}
