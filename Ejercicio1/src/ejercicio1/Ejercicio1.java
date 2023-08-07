/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author josec
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        Numero entero = new Numero(1459);
        System.out.println("El numero es par?: "+entero.esPar());
        System.out.println("El numero es positivo?: "+entero.esPositivo());
        System.out.println("El numero es multiplo de "+num+": "+entero.esMultiploDe(num));
    }
    
}
