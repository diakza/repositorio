/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatriz1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author diakz
 */
public class Ejemplomatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        imprimirMatriz(CrearMatriz(4));
        System.out.println("----------------------");
        
         imprimirMatrizInvert(CrearMatriz(4));

    }

    public static int[][] CrearMatriz(int n) {

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }

        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int[] filas : matriz) {

            for (int columna : filas) {

                if (columna == 1) {
                    System.out.print(" X ");

                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println("");
        }

    }

    public static void imprimirMatrizInvert(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >= 0; j--) {

                if (matriz[i][j] == 1) {
                    System.out.print(" X ");

                } else {
                    System.out.print(" - ");
                }

            }
            System.out.println("");
        }
        
    }
}
