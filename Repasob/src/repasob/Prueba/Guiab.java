/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasob.Prueba;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Guiab {

//    Implementar un método que reciba por parámetro dos números enteros y determine cuál es
//el mayor y lo muestre por pantalla.
    public static void elMayor() {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        num2 = leer.nextInt();
        System.out.println("el mayor es " + Math.max(num2, num1));

    }

    public static void pair() {
        //        Crear un método que reciba por parámetro un numero y determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("no es par");
        }
    }

    public static void comparacion() {
//        Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un
//mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals()
//de String.
        Scanner leer = new Scanner(System.in);
        String frase, frase2;
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        frase2 = "eureka";
        if (frase.equals(frase2)) {
            // se llama como un objeto
            System.out.println("correcto");

        } else {
            System.out.println("incorrecto");
        }

    }

    public static void cadena() {
////       Realiza un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
//el método lenght() de String. 
        System.out.println("ingrese una frase de hasta 8 caracteres");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.length() <= 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }

    }

//    Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una
//‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
//“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    public static void validar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("correcto");

        } else {
            System.out.println("incorrecto");
        }

    }

//Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
//que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una
//variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar
//lo siguiente:
// Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
// Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
//gasolina”.
// Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
//hormigón”.
// Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
//alimenticia”.
// Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
//válido para tipo de bomba”
    public static void motores() {
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese un numero del 1 al 4 ");
        tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");

        }

    }

}
