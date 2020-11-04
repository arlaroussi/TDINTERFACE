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
abstract class Titulaire extends Prof {
    
    protected String couleur;
    
    public String getCouleur() {
        return couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    abstract public void setDefaultCouleur(String couleur);    
    
}
