/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1guia6;

import java.util.ArrayList;

/**
 *
 * @author diakz
 */
public class Ejercicio1Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Demuestre como provocar intencionalmente una excepción del tipo
//NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
//error.
        try {
            String string = null;
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una excepción: ");
        }

    }

}
