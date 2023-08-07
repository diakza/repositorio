/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5guia5.pkg2;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio5Guia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerint = new Scanner(System.in);
        Colegio cole = new Colegio("san andres", "rivadavia");
//        String nombre, String apellido, int anio, int legajo
        String nombre;
        String apellido;
        int legajo;
        String opcion;
        do {
            
            System.out.println("ingrese el nombre del alumno");
            nombre = leer.nextLine();
            System.out.println("-------------------------");
            System.out.println(" ingrese el apellido del alumno");
            apellido = leer.nextLine();
            System.out.println("-------------------------");
            System.out.println(" ingrese el numero de legajo del alumno");
            legajo = leerint.nextInt();
            System.out.println("-------------------------");
            
            Alumno alum = new Alumno(nombre, apellido, legajo);
            cole.agregarAlumnos(alum);
            System.out.println("¿desea ingresar mas alumnos? S/N");
            opcion = leer.nextLine();
            
        } while (!(opcion.equalsIgnoreCase("n")));
        
        cole.listarAlfabeticamente();
        System.out.println("-----------------------------");
       
        cole.listarApellido('a');
        System.out.println("--------------------------------");
        
         cole.quitarAlumno(2324);
    }
    
}
