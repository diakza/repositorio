/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_jpane;

import javax.swing.JOptionPane;

/**
 *
 * @author diakz
 */
public class Ejemplo_jpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her

        int[] arreglo = new int[10];
        int i = 0, suma = 0;
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (i = 0; i <= 9; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Igrese un numero "));

        }

        for (int j : arreglo) {
            suma += arreglo[j];

        }

        JOptionPane.showMessageDialog(null, "La suma es " + String.valueOf(suma));
        for (i = 9; i > 0; i--) {
            JOptionPane.showMessageDialog(null, arreglo[i]);
        }

        System.out.println("MATRIZ---------------");
        mostrar(matriz);

    }

    public static void mostrar(int[][] m) {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }

    }

}


