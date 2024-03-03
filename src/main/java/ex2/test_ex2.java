/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author zaine
 */
public class test_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livre l1 = new Livre(); 
        Livre l2 = new Livre("abc","def"); 
        Livre l3 = new Livre("ghj","yoo",2022); 
        Livre l4 = new Livre("azur","hello",2021,6); 
        l1.ToString();
        l2.ToString();
        l3.ToString();
        l4.ToString();
    }
    
}
