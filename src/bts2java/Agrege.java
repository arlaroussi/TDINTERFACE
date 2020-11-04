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
public class Agrege extends Titulaire {
    
    public Agrege(String nom) {
        super();
    }
    public void setDefaultCouleur(String couleur) {
        this.couleur = "Green";
    };
    
    public String toString() {
        return this.getNom();
    }
}
