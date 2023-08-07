/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4ejercicio4;

/**
 *
 * @author diakz
 */
public class Guia4ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Position ubi = new Position(100, 200);
        Guerrero carlos = new Guerrero(true, ubi, "thor");
       
         carlos.Avanzar(10);
        
        carlos.Girar();
        System.out.println("-------------------");
        carlos.Disparar();
        System.out.println("--------------------");
       
    }

}
