//
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
//// /Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
//en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package repasoa;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class GuiaA {

    public static void convertor() {

        Scanner leer = new Scanner(System.in);
        double celcius;
        double Fahrenheit;
        System.out.println("ingrese la cantidad de grados celcius deseada");
        celcius = leer.nextDouble();
        Fahrenheit = 2 + (9 * celcius / 5);
        System.out.println("el equivalente de " + celcius + " es " + Fahrenheit);

    }
    
    
    //Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
//triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().
    public static void lector(){
        
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero entero");
        num1=leer.nextInt();
        System.out.println("el doble del numero es " + num1*2 );
        System.out.println("el triple del numero es " + num1 *3);
        System.out.println("la raíz cuadrada de ese numero es " +(int)Math.sqrt(num1));
        
        
        
        
        
    }
    

}




