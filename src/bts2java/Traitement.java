/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bts2java;

import java.util.*;

/**
 *
 * @author rlaroussi
 */
public class Traitement {
    
    public static void main (String argv[]) {
        
        ArrayList<Etudiant> listeE = new ArrayList<Etudiant>();
        
        Etudiant etd1 = new Etudiant("Baptiste", 15);
        listeE.add(etd1);
        Etudiant etd2 = new Etudiant("Samia", 17);
        listeE.add(etd2);
        
        ArrayList<Agrege> listeA = new ArrayList<Agrege>();
        
        Agrege agreg1 = new Agrege("Alpha");
        listeA.add(agreg1);
        
        Agrege agreg2 = new Agrege("Beta");
        listeA.add(agreg2);
        
        for (Object etd:listeE ) {
            System.out.println(etd.toString());
        }
        
        for (int i=0; i<listeE.size(); i++) {
            System.out.println(listeE.get(i).meurt());
        }
    }
}