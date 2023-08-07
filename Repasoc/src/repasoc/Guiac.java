/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoc;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Guiac {
//    Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está
//entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    public static void validar() {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("ingrese una nota del 0 al 10");

        nota = leer.nextInt();

        while (nota > 10) {

            System.out.println("vuelva a ingresar una opcion correcta");
            nota = leer.nextInt();
        }

    }
//Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

    public static void positivo() {
        Scanner leer = new Scanner(System.in);
        int valor;
        int suma;
        int num;
        System.out.println("ingrese el limite positivo");
        valor = leer.nextInt();
        suma = 0;
        num = 0;
        while (suma < valor) {

            suma = suma + num;
            System.out.println("ingrese otro numero");
            num = leer.nextInt();
        }
        System.out.println("supero el limite");
    }
//Realizar un método que pida dos números enteros positivos por teclado y muestre por pantalla
//el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego
//volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
//si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el
//siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario selecciona
//el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int nro1 = leer.nextInt();
        System.out.println("Ingrese el primer numero ");
        int nro2 = leer.nextInt();
        String opcion;
        do {
            System.out.println("---------------MENU---------------\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción: ");
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    System.out.println("La suma es: " + (nro1 + nro2));
                    break;

                case "2":
                    if (nro2 <= nro1) {
                        int resta = nro1 - nro2;
                        System.out.println("La resta es: " + resta);
                    } else {
                        System.out.println("la resta no se puede realizar");
                    }
                    break;
                case "3":
                    int multiplicacion = nro1 * nro2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;

                case "4":
                    if (nro2 == 0) {
                        System.out.println("La operación no se puede realizar. División por cero");
                    } else {
                        int division = nro1 / nro2;
                        System.out.println("La division es: " + division);
                    }
                    break;

                case "5":
                    System.out.println("Estas seguro (s/n)");
                    opcion = leer.next();
            }
        } while (!(opcion.equals("s")) && !(opcion.equals("S")));

    }
//Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota:
//recordar el uso de la sentencia break.

    public static void sumando20() {
        Scanner leer = new Scanner(System.in);
        int suma = 0, contador = 0;
        while (contador < 20) {

            System.out.println("Ingrese el numero ");
            int nro1 = leer.nextInt();

            if (nro1 > 0) {
                suma = suma + nro1;
            }
            if (nro1 == 0) {
                System.out.println("Ha ingresado un cero, el programa se termina");
                break;
            }

            contador++;
        }
        System.out.println("La suma de los 20 numeros ingresados es " + suma);
    }

//    Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
//tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
//tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
//“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que
//no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe
//indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
//investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(),
//equals().
    public static void rs232() {
        Scanner leer = new Scanner(System.in);
        String frase = "a";

        int correctas = 0;
        int incorrectas = 0;
        String corte = "&&&&&";
        while (!frase.equals(corte)) {
            System.out.println("ingrese una frase de 5 caracteres");
            frase = leer.nextLine();
            if ((frase.length() <= 5) && (frase.charAt(0) == 'x') && (frase.endsWith("o"))) {
                correctas++;

            } else if ("&&&&&".equals(frase)) {
                break;

            } else {
                incorrectas++;
            }

        }
        System.out.println("la cantidad de correctas son " + correctas);
        System.out.println("la cantidad de incorrectas son " + incorrectas);
    }

//    Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”.
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//* *
//* *
//* * * *
    public static void galleta() {

        Scanner leer = new Scanner(System.in);
        int elementos;
        int contador, contador2, contador3, contador4;
        contador = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        System.out.println("ingrese la cantidad de elementos deseados");
        elementos = leer.nextInt();
        while (elementos > contador) {
            contador++;

            System.out.print("*");
        }
        
        System.out.println();
        for (int i = 0; i < elementos - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < elementos - 2; j++) {
                System.out.print(" ");
}
            System.out.println("*");
//
        }
//
        while (elementos > contador2) {
            contador2++;

            System.out.print("*");
        }
    }
//while (contador1 < num){
//            int contador2=0;
//            while (contador2 < num){
//                
//                if (contador1 == 0 || contador1 == num-1 || contador2 == 0 || contador2 == num-1){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//                contador2++;
//            } 
//            System.out.println("");
//            contador1++;
    public static void ejercicio() {
//    Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.println("ingrese cuatro numero comprendidos del 1 al 20");

        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        if (num1 > 0 && num1 < 20) {
            System.out.print(num1);
            for (int i = 0; i < num1; i++) {

                System.out.print(" *");

            }
            System.out.println();
        }
        if (num2 > 0 && num2 < 20) {
            System.out.print(num2);
            for (int i = 0; i < num2; i++) {

                System.out.print(" *");

            }
            System.out.println();
        }
        if (num3 > 0 && num3 < 20) {
            System.out.print(num3);
            for (int i = 0; i < num3; i++) {

                System.out.print(" *");

            }
            System.out.println();
        }

        if (num4 > 0 && num4 < 20) {
            System.out.print(num4);
            for (int i = 0; i < num4; i++) {

                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
