/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2_systemegestionetudiants;

/**
 *
 * @author zaine
 */
public class Etudiant {
    
     private String nom;
       private String prenom;
       private int ns;
       private String email;
       
       
    public Etudiant(String nom, String prenom, int ns, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.ns = ns;
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getNS() {
        return this.ns;
    }

    public String getEmail() {
        return this.email;
    }
    public void SetNom(String Nom){
       
        this.nom=Nom;
    
    
    
    }   
    public void SetPrenom(String Prenom){
       
        this.prenom=Prenom;
   
    }
    public void SetNS(int NS){
       
        this.ns=NS;
   
    }
    public void SetEmail(String Email){
       
        this.email=Email;
   
    }
    public void ToString(){
    System.out.println("Nom= "+this.nom+"/Prenom= "+this.prenom+"/Nombre d'inscription= "+this.ns+"/Email= "+this.email);
    
    }
    
}
