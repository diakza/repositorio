/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploexeption;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diakz
 */
public class EjemploExeption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NewException {

        // TODO code application logic here
        metodollamador();

    }

    /**
     *
     * @throws ejemploexeption.NewException1
     * @throws NewException1
     */
    public static void metodo() throws NewException {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + 1 + Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("no andaaaaaa");
            valor = valor + 1 + Integer.parseInt(null);
        }

    }

    public static void metodollamador()throws NewException {
        try {
            metodo();

        } catch (Exception e){
                
           throw new NewException("sojdgusod");

        }
    }

}
