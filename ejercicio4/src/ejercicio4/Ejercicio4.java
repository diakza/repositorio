/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bateria bateria = new Bateria(1000);
        Robot robot = new Robot(bateria);
        Hombre pibardo = new Hombre("carlos");
        Hombre pibardo2 = new Hombre("juan");
        System.out.println("carlos juega con el robot");
        pibardo.jugarconrobot(robot);
        System.out.println(" ahora juan juega con el robot");
        pibardo2.jugarconrobot(robot);
    }

}
// Bateria bateria1 = new Bateria(1000);
//        Robot robot1 = new Robot("Tito", bateria1);
//        Hombre hombre1 = new Hombre("Emiliano", "Stuer", 35);
//        hombre1.jugarConRobot(robot1);
//        
//    