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
public class Etudiant extends Humain{
    
    private int note;
    
    public Etudiant(String nom, int note) {
        super(nom);
        this.note = note;
    }
    
    public double getNote() {
        return note;
    }
    
    public void setNote(int note) {
        this.note = note;
    }
  
    public String toString() {
        return this.getNom();
    }
}
