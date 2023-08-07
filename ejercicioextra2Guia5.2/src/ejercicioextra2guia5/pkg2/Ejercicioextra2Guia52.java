/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra2guia5.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejercicioextra2Guia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        ArrayList<Cantantefamoso> singer = new ArrayList();
        String nombre;
        String disco;
        int cont = 0;
        do {

            System.out.println("ingrese el nombre del cantante");

            nombre = leer.nextLine();

            System.out.println(" ingrese el nombre del disco con mas ventas");
            disco = leer.nextLine();

            Cantantefamoso bob = new Cantantefamoso(nombre, disco);
            singer.add(bob);
            cont++;

        } while (!(cont == 5));

        for (Cantantefamoso elementos : singer) {
            System.out.println(elementos);

        }
        int opcion = 0;
        do {

            System.out.println("Bienvenido al menú de opciones");
            System.out.println("1. agregar nuevo cantante ");
            System.out.println("2. mostrar a todos los cantantes");
            System.out.println("3. eliminar cantante de la lista");
            System.out.println("4. salir");

            System.out.print("Ingrese la opción que desea: ");
            opcion = leer1.nextInt();
            System.out.println("-----------------------------------------");
            String eliminado;
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre del cantante agregar");
                    nombre = leer.nextLine();
                    System.out.println("------------------------------------------");
                    System.out.println("ahora ingrese el nombre del disco mas vendido");
                    disco = leer.nextLine();
                    Cantantefamoso james = new Cantantefamoso(nombre, disco);
                    singer.add(james);

                    break;
                case 2:
                    for (Cantantefamoso elementos : singer) {
                        System.out.println(elementos);

                    }

                    break;
                case 3:
                    System.out.println("ingrese el nombre del cantante a eliminar de la lista");
                    eliminado = leer.nextLine();
                    Iterator<Cantantefamoso> iter = singer.iterator();
                    
                    while (iter.hasNext()) {
                        Cantantefamoso elemento = iter.next();
                        if (elemento.getNombre().equalsIgnoreCase(eliminado)) {
                            iter.remove();
                            System.out.println(" se le acabo el talento " + elemento);
                        }

                    }

                    break;
                case 4:

                    break;

            }

        } while (!(opcion == 4));
        for (Cantantefamoso elementos : singer) {
            System.out.println(elementos);

        }
    }
}
