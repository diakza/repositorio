/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3.guia2;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejer3Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        String mayus;
        String minum;
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        mayus= frase.toUpperCase();
        minum=frase.toLowerCase();
        System.out.println("su frase en mayusculas "+mayus);
        System.out.println("su frase en minusculas "+minum);
        
        
        
        
    }
    
        
        
        
        // TODO code application logic here
    }
    

//Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
//minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.