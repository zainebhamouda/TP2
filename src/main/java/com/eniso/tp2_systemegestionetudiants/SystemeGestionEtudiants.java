/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2_systemegestionetudiants;

import java.util.ArrayList;

/**
 *
 * @author zaine
 */
public class SystemeGestionEtudiants {
    
    private final ArrayList<Etudiant> liste ;

    public SystemeGestionEtudiants (ArrayList<Etudiant> liste) {
        this.liste = new ArrayList();
    }
   
    public void ajouterEtudiant(String nom,String prenom,int nI,String email){
     Etudiant e = new Etudiant(nom,prenom,nI,email);
     liste.add(e);
    }
    public void afficherEtudiant(){
     for (Etudiant e :liste) {
       e.ToString();
     
     }
    
    }
    public void modifierEmailEtudiant(int nI,String nouvelEmail){
       for (Etudiant e :liste ){
         if(e.getNS()==nI){
           e.SetEmail(nouvelEmail);
          
         }
       }
    }
    public void supprimerEtudiant(int numeroInscription){
       for (int i=0;i<liste.size();i++){
       if(this.liste.get(i).getNS()==numeroInscription){
         liste.remove(i);
       }
       
       }
    
    
    }
    
}
