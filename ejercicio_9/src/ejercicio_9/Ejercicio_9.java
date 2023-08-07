/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.ArrayList;

/**
 *
 * @author diakz
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Fecha nueva = new Fecha(20,01,2022);
         nueva.esBisiesto();
                 System.out.println("es bisiesto?"+nueva.esBisiesto());
                 
                 
                 Fecha old = new Fecha (20,01,2024);
                 System.out.println("es bisiesto?"+old.esBisiesto());
                 
                 System.out.println(old.calcularAños(nueva));
         
         
         
         ArrayList<Integer> numeros = new ArrayList();
         
         
         numeros.add(45);
         System.out.println(numeros);
         
         
         
    }
   
}
