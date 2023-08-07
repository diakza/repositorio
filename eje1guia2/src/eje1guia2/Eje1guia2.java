/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1guia2;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Eje1guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese un numero entero");
        num1=leer.nextInt();
        System.out.println("ingrese otro numero entero");
        num2=leer.nextInt();
        System.out.println("la suma es "+(num1+num2));
        
        
        
        // TODO code application logic here
    }
//    Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
//mostrando por consola la suma de los mismos.
}
