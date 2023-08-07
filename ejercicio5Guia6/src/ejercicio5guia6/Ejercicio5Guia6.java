/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5guia6;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio5Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

//        Escribir un programa en Java que juegue con el usuario a adivinar un número.
//La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
//que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
//computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor
//que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e
//imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si
//el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo
//por pantalla. En este último caso también se debe contar el carácter fallido como un
//intento.
        int opcion = 0;
        int cont = 0;
        int num = (int) (Math.random() * 500);
        
        try {
            do {
                System.out.println("ingrese un numero si lo adivina se gana un auto ");
                opcion = leer.nextInt();
                System.out.println(num);
                if (opcion > num) {
                    System.out.println("te pasaste capo");
                    cont++;
                } else if (opcion < num) {
                    System.out.println("tas lejos capo");
                    cont++;
                } else if (opcion == num) {
                    System.out.println("te ganaste un auto");
                    cont++;
                    break;
                }

            } while (true);
            System.out.println(" te ganaste el auto con tan solo " + cont + " intentos");
        } catch (Exception e) {
            cont++;
            System.out.println("por gil te perdiste el auto ");
        }finally{
           System.out.println("cantidad de intentos fallidos "+cont);
        }
    }

}
