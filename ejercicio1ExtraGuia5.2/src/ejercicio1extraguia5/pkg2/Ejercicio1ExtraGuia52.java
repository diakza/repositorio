/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extraguia5.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio1ExtraGuia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int suma = 0;
        int prom = 0;

        int num = 0;
        String opcion = "";
        do {
            System.out.println(" ingrese numeros enteros");
            num = leer.nextInt();
            if (num != -99) {

                numeros.add(num);
                suma += num;
            }

        } while (!(num == (-99)));

        System.out.println("listado de numeros");
        System.out.println("---------------------");
        for (Integer elementos : numeros) {

            System.out.println(elementos);
        }
        System.out.println("--------------------------");
        System.out.println("suma de los valores es = " + suma);
        System.out.println("------------------------------");
        System.out.println("el promedio es de " + suma / numeros.size());

    }

}
