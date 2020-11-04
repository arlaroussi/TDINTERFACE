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
public class Prof extends Humain {
    public double salaire;
    
    public Prof() {
    }
    
    public Prof(String nom) {
        super(nom);
    }
    
    public Prof(String nom, double salaire) {
        super(nom);
        this.salaire = salaire;
    }
    
    public double getSalaire() {
        return salaire;
    }
    
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    public void setNom(String nom) {
        super.setNom(nom);
        System.out.println("Nom : "+this.getNom());
    }
}
