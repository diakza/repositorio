/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1guia5;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Arreglo {

//    Método sumarLista que reciba por parámetro un arreglo unidimensional de
//enteros y muestre por pantalla la suma y promedio de los mismos.
//    
    Scanner leer = new Scanner(System.in);

    public static void sumaLista(double arreglo[]) {

        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma += arreglo[i];

        }

        promedio = suma / arreglo.length;
        System.out.println(" el promedio fue de  " + promedio);

    }

//    Método buscarMayor que reciba por parámetro un arreglo bidimensional e
//irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
//    
    public static int buscarMayor(int arreglo[][]) {
        int mayor = 0;

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo.length + 1; j++) {

                if (arreglo[i][j] > mayor) {

                    mayor = arreglo[i][j];

                }

            }

        }

        return mayor;

    }

//    c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
//de vocales que tiene la cadena.
    public static int cuentaVocales(String frase) {

        //String[] lista = new String[frase.length()];
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char h = frase.charAt(i);
            if (h == 'a' || h == 'e' || h == 'i' || h == 'o' || h == 'u') {

                contador++;

            }

        }
        return contador;
    }
    
//    Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
//retorne la cantidad de veces que se repite en la cadena el carácter recibido.
//    
    public static int cuentaCaracter(String frase,char letra) {
        
        
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i)==letra) {

                contador++;

            }

        }
      return contador;
        
    }
    
    
}
