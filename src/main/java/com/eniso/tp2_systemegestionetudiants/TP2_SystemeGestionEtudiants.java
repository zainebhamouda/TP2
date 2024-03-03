/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2_systemegestionetudiants;

import java.util.ArrayList;

/**
 *
 * @author zaine
 */
public class TP2_SystemeGestionEtudiants {

    public static void main(String[] args) {
        ArrayList l =new ArrayList();
        SystemeGestionEtudiants s=new SystemeGestionEtudiants(l);

        
        
        s.ajouterEtudiant("aa","bb",1,"ee");
        s.ajouterEtudiant("ss","gg",2,"pi");
        s.ajouterEtudiant("aa","py",3,"ym");
        s.ajouterEtudiant("az","yy",4,"ib");
        s.ajouterEtudiant("hn","fn",5,"nt");
        s.ajouterEtudiant("km","mu",6,"co");
        
        
        s.afficherEtudiant();
        
        s.modifierEmailEtudiant(1, "modifier");
        s.supprimerEtudiant(4);
        
        
        
        s.afficherEtudiant();
        
    }
}
