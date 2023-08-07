/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicio1 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          // Crear una persona
        Persona persona = new Persona("Juan", "Pérez", 25, "12345678");

        // Crear cuatro perros
        Perro perro1 = new Perro("Firulais", "Labrador", 3, "Grande");
        System.out.println("nombre"+perro1.getNombre());
        Perro perro2 = new Perro("Luna", "Poodle", 5, "Pequeño");
        Perro perro3 = new Perro("Rocky", "Pastor alemán", 7, "Grande");
        Perro perro4 = new Perro("Coco", "Chihuahua", 2, "Pequeño");
        persona.toString();
        // Hacer que la persona adopte cada uno de los perros
        persona.adoptarPerro(perro1);
        persona.adoptarPerro(perro2);
        persona.adoptarPerro(perro3);
        persona.adoptarPerro(perro4);

        // Pedir a la persona que nos diga cuál es el perro más viejo
//        Perro masViejo = persona.perroMasGrande();
//        System.out.println("El perro más viejo es " + masViejo.getNombre() + " que tiene " + masViejo.getEdad() + " años.");
    }
}
    


