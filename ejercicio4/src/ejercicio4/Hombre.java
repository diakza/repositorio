/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Hombre {

    Scanner leer = new Scanner(System.in);
    private String nombre;
    private Robot robot;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public Hombre() {
    }

    public void jugarconrobot(Robot robot) {

        int opcion = 0;
        do {
            System.out.print("ingrese cantidad de pasos a avanzar: ");
            int pasos = leer.nextInt();
            robot.avanzar(pasos);
            System.out.print("ingrese cantidad de pasos a retroceder : ");
            pasos = leer.nextInt();
            robot.retroceder(pasos);
            System.out.println("Energia actual: " +robot.energiaActual() );
            do {
                System.out.println("¿desea dormir al robot? 1 para si, 2 para no");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                          robot.dormidom();
                        return;
                    case 2:
                        robot.despertar();
                        break;
                    default:
                        System.out.println("opcion no valida...");
                        opcion = leer.nextInt();
                }
            } while ((opcion == 1) && (opcion == 2));
        } while (!robot.dormidom());
    }
}


// Scanner scan = new Scanner(System.in);
//
//    private String nombre;
//
//    private String apellido;
//
//    private int edad;
//    
//    public Robot robot1;
//
//    public Hombre(String nombre, String apellido, int edad) {
//        this.nombre=nombre;
//        this.apellido=apellido;
//        this.edad=edad;
//    }
//    
//    public void asignarRobot(Robot robot){
//    robot1=robot;
//    }
//public void jugarConRobot(Robot robot) {
//        System.out.println("Robot "+robot.getNombre());
//        System.out.println("Carga inicial "+robot.bateria.getcarga());
//        System.out.println("Ingrese los pasos que quiere avanzar");
//        robot.avanzar(scan.nextInt());
//        System.out.println("Ingrese los pasos que desea retroceder");
//        robot.retroceder(scan.nextInt());
//        System.out.println("Bateria restante: "+robot.energiaActual());
//        robot.dormir();
//        System.out.println("Ingrese los pasos que desea retroceder");
//        robot.retroceder(scan.nextInt());
//
//      
//    }
//public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//
//
//}