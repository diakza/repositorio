/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Arreglos {

    public static void ejer2() {

//          En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que
//rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden
//descendente.
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = i + 1;

        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(" " + vector[i]);
        }

    }

    public static void ejer3() {

        Scanner leer = new Scanner(System.in);

//        3) En un nuevo proyecto, en el método main de su clase principal, se pide crear un algoritmo que
//rellene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el
//vector. El programa mostrará donde se encuentra el número y si se encuentra repetido
        System.out.println("ingrese un numero");
        int n = leer.nextInt();
        int[] vector1 = new int[n];

        for (int i = 0; i < n; i++) {

            vector1[i] = (int) (Math.random() * 10);
            System.out.println("su numero es " + vector1[i]);

        }
        int cont = 0;
        System.out.println("ingrese el numero para comparar dentro del vector ");
        int opcion = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector1[i] == opcion) {
                cont++;
                System.out.println("posicion " + i);
                System.out.println("cantidad de veces repetidas " + cont);
            } else if (cont == 0) {
                System.out.println("no se ha encontrado dicho numero");
                break;
            }
//            
        }
    }

    public static void ejer4() {

        //          En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
//que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) ((Math.random()) * 9);

                System.out.print(" " + matriz[i][j]);

            }
            System.out.println("");

        }
        System.out.println("---------------------------");
        for (int l = 0; l < matriz.length; l++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.print(" " + matriz[k][l]);
            }
            System.out.println("");
        }

    }

    public static void ejer5() {
        Scanner leer = new Scanner(System.in);

//          En un nuevo proyecto, en el método main de su clase principal, se pide realice un algoritmo que
//compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando
//
//ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -
//AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por
//columnas (o viceversa).
        System.out.println("Indique la cardinalidad de su matriz:");
        int N = leer.nextInt();
        int[][] matriz = new int[N][N];
        System.out.println("Ingrese los valores de su matriz:");
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                matriz[f][c] = leer.nextInt();
            }
        }
        System.out.println("- - - - - - - - - -" + '\n' + "COMPROBACIÓN");
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.print("[" + matriz[f][c] + "] ");
            }
            System.out.println("");
        }
        int[][] matrizT = new int[N][N];
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                matrizT[f][c] = matriz[c][f];
            }
        }
        System.out.println("- - - - - - - - - -" + '\n' + "TRANSPUESTA");
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                System.out.print("[" + matrizT[f][c] + "] ");
            }
            System.out.println("");
        }
        int contador = 0;
        for (int f = 0; f < N; f++) {
            for (int c = 0; c < N; c++) {
                if (matriz[f][c] == -matrizT[f][c]) {
                    contador++;
                }
            }
        }
        if (contador == Math.pow(N, 2)) {
            System.out.println("- - - - - - - - - -" + '\n' + "La matriz es ANTI SIMÉTRICA" + '\n' + "- - - - - - - - - -");
        }
    }

    public static void ejer6() {
        Scanner leer = new Scanner(System.in);
        //    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma
//de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir
//un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá
//comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
//    

        System.out.println("ingrese el tamaño que desea para su matriz ");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.println("ingrese un numero para llenar su matriz del 1 al 9");
                num = leer.nextInt();
                if (num < 10 && num >= 1) {
                    matriz[i][j] = num;

                } else {
                    while (num > 9 && num < 1) {

                        System.out.println("ingrese un numero para llenar su matriz del 1 al 9");
                        num = leer.nextInt();

                    }

                }

            }

        }
        int[] filas = new int[n];
        int[] colum = new int[n];
        int[] diag1 = new int[n];
        int[] diag2 = new int[n];

        for (int i = 0; i < matriz.length; i++) {

            filas[i] = 0;
            colum[i] = 0;
            diag1[i] = 0;
            diag2[i] = 0;

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                filas[i] += matriz[i][j];
                colum[j] += matriz[i][j];
                if (i == j) {
                    diag1[n - 1] += matriz[i][j];
                }
                if (i + j == n - 1) {
                    diag2[n - 1] += matriz[i][j];
                }

            }
        }
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("fila " + i + ": " + filas[i]);
            System.out.println("columna " + i + ": " + colum[i]);

        }
        System.out.println(" diagonal principal " + diag1[n - 1]);
        System.out.println("diagonal secundaria " + diag2[n - 1]);
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {

            if (filas[i] == colum[i] && filas[i] == diag1[n - 1] && filas[i] == diag2[n - 1]) {

                cont++;
                break;

            }

        }
        if (cont == 1) {
            System.out.println("su cuadrado es magico");
        } else {
            System.out.println("su cuadrado no es magico");
        }

    }

    public static void ejer7() {
//        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
//se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la
//matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar
//en la matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la matriz
//P. En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza
//el primer elemento de la submatriz P.
        int[][] matrizP = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};

        for (int[] filas : matrizP) {

            System.out.println(Arrays.toString(filas));
        }

        int[][] matrizM = new int[10][10];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {

                matrizM[i][j] = (int) (Math.random() * 9);
                System.out.print(" " + "[" + matrizM[i][j] + "]");
            }
            System.out.println(" ");

        }
//
        matrizM[4][4] = 36;
        matrizM[4][5] = 5;
        matrizM[4][6] = 67;
        matrizM[5][4] = 89;
        matrizM[5][5] = 90;
        matrizM[5][6] = 75;
        matrizM[6][4] = 14;
        matrizM[6][5] = 22;
        matrizM[6][6] = 26;
        System.out.println("-----------------------------");
        
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {

                
                System.out.print(" " + "[" + matrizM[i][j] + "]");
            }
            System.out.println(" ");

        }
        
        
        
        boolean flag = false;
        int contador = 0;

        for (int i = 0; i < matrizM.length-matrizP.length; i++) {
            for (int j = 0; j < matrizM.length-matrizP.length; j++) {

                if (matrizM[i][j] == matrizP[0][0]) {

                    for (int k = 0; k < matrizP.length; k++) {
                        for (int l = 0; l < matrizP[k].length; l++) {

                            if (matrizM[i+k][j+l] == matrizP[k][l]) {

                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("la matriz de menor tamaño se encontro en la fila " + i + " columna " + j);
                        contador++;
                    }
                }
                

            }
        }
if (contador == 0) {
                    System.out.println("la matriz no esta contenida ");

                }
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al menú de opciones");
        System.out.println("1. ejer2 ");
        System.out.println("2. ejer3 ");
        System.out.println("3. ejer4 ");
        System.out.println("4. ejer5 ");
        System.out.println("5. ejer6");
        System.out.println("6. ejer7");

        System.out.print("Ingrese la opción que desea: ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 2:
                ejer2();

                break;
            case 3:
                ejer3();

                break;
            case 4:
                ejer4();

                break;
            case 5:
                ejer5();

                break;
            case 6:
                ejer6();

                break;
            case 7:
                ejer7();
                break;
            case 8:

                break;
        }
    }
}
