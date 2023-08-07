/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("por favor ingrese otro numero para calcular");
        int num2 = leer.nextInt();
        double total = 0;

        System.out.println("Bienvenido al menú de opciones");
        System.out.println("1. si desea sumar los numeros ");
        System.out.println("2. si desea restar los numeros ");
        System.out.println("3. si desea multiplicar los numeros");
        System.out.println("4. si desea divir los numeros ");
        System.out.println("5. Salir");

        System.out.print("Ingrese la opción que desea: ");
        int opcion = leer.nextInt();
        do {
            switch (opcion) {
                case 1:if(num1 >num2){
                    System.out.println("el numero mayor es "+ num1);
                }
                    

                    break;
                case 2:
                    System.out.println("el resultado de la resta es " + (num1 - num2));

                    break;
                case 3:
                    System.out.println("el resultado de la multiplicacion es " + (num1 * num2));

                    break;
                case 4:
                    total = num1 / num2;
                    System.out.println("el resultado de la division es " + total);

                    break;
                case 5:
                    System.out.println(" ha terminado el programa");

                    break;
                default:
                    // Mostrar un mensaje de error si la opción no es válida
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while((opcion==5));
    }

}
