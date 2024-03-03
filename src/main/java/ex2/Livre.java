/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author zaine
 */
public class Livre {
    
    private String titre;
    private String auteur;
    public int annee;
    public int isbn;

    public Livre() {
        this.titre = "bonjour";
        this.auteur = "jjj";
        this.annee =2020 ;
        this.isbn = 8;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee=2023;
        this.isbn=9;
    }

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.isbn=10;
    }

    public Livre(String titre, String auteur, int annee, int isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.isbn = isbn;
    }
    
    
    public String gettitre(){
    
      return this.titre;
      
    }
    public String getauteur(){
    
      return this.auteur;
      
    }
    public int getannee(){
    
      return this.annee;
      
    }
    public int getisbn(){
    
     return this.isbn;
    }
    public void settitre(String titre){
    
        this.titre=titre;
    }
    public void setauteur(String auteur){
        this.auteur=auteur;
    }
    public void setannee(int annee){
       this.annee=annee;
    
    }
    public void setisbn(int isbn){
       this.isbn=isbn;
    
    }
    public void ToString(){
    
       System.out.println("titre= "+this.titre+"/Auteur= "+this.auteur+"/Annee de publiction= "+this.annee+"/ISBN= "+this.isbn);
    }
    
}
