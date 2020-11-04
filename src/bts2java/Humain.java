/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bts2java;

/**
 *
 * @author rlaroussi
 */
public class Humain implements Mortel {
    private String nom;
    
    public Humain() {}
    
    public Humain(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String meurt() {
        return this.nom+" est décédé";
    }
}
