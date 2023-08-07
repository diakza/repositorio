/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

/**
 *
 * @author diakz
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Pensador p1 = new Pensador(5934);
        
         System.out.println("su numero espejo es "+p1.invertir());
        
         System.out.println("--------------------");
         System.out.println("su ultimo digito es "+p1.ultimoDigito());
         System.out.println("--------------------");
         System.out.println("su primer digito es "+p1.primerDigito());
         System.out.println("--------------------");
         System.out.println("su par posterior es "+p1.parPosterior());
         System.out.println("--------------------");
         System.out.println("su par anterior es "+p1.parAntes());
         
        
        
        
    }
    
        
    
    
    
}
