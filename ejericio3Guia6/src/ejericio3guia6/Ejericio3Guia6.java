/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio3guia6;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejericio3Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

//        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
//dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase
//Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por
//ultimo realizar una división con los dos números y mostrar el resultado.
        System.out.println("ingrese un numero");
        String cad1 = leer.nextLine();

        System.out.println("ingrese otro numero");
        String cad2 = leer.nextLine();

        Divisionnumero.dividir(cad1, cad2);

    }
}
