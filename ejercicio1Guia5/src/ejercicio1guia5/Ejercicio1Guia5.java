/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1guia5;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matriz[][] = {{5, 6, 3}, {8, 4, 9}};
        double[] lista = {1, 2, 3};

        Arreglo.sumaLista(lista);
        System.out.println("--------------------");
        System.out.println("el mayor es " + Arreglo.buscarMayor(matriz));
        System.out.println("--------------------");
        System.out.println("cantidad de vocales encontradas " + Arreglo.cuentaVocales("celular"));
        System.out.println("--------------------");
        System.out.println("el caracter se repite " + Arreglo.cuentaCaracter("elefante", 'e') + " veces");
    }

}
