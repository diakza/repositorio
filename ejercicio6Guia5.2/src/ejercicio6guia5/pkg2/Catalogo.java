package ejercicio6guia5.pkg2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Catalogo {

    ArrayList<Electrodomesticos> lg = new ArrayList();
    ArrayList<Perfumeria> rougue = new ArrayList();
    ArrayList<Ropa> zara = new ArrayList();

    public void menu() {

        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Bienvenido al menú de opciones");
            System.out.println("1.si desea agregar electrodomesticos al catalogo ");
            System.out.println("2. si desea agregar perfumes al catalogo ");
            System.out.println("3. si desea agregar ropa al catalogo ");
            System.out.println("4. mostrar la cantidad de productos");
            System.out.println("5. mostrar catalogo de electrodomesticos");
            System.out.println("6. mostrar catalogo de perfumes");
            System.out.println("7. mostrar catalogo de ropa");

            System.out.println("8. Salir");
            System.out.print("Ingrese la opción que desea: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Electrodomesticos samsung = new Electrodomesticos(100, 35000, 2, "samsung", "lavarropas ");
                    Electrodomesticos tv = new Electrodomesticos(50, 20000, 2, "samsung", " 50 pulgadas");
                    lg.add(tv);
                    lg.add(samsung);
                    System.out.println("agregados correctamente");
                    break;
                case 2:
                    Perfumeria parfum = new Perfumeria(100, 55000, 5, "dior", "sauvage");
                    Perfumeria jean = new Perfumeria(200, 45000, 5, "jean-paul galtier", "scandal");
                    rougue.add(jean);
                    rougue.add(parfum);
                     System.out.println("agregados correctamente");

                    break;
                case 3:

                    Ropa campera = new Ropa("lycra", 20000, 2, "nike", "rompeviento");
                    Ropa zapatillas = new Ropa("cuero", 60000, 2, "adidas", "star");
                    zara.add(campera);
                    zara.add(zapatillas);
                     System.out.println("agregados correctamente");

                    break;
                case 4:
                    cantidadDeProductos();

                    break;
                case 5:
                    mostrarElectro();

                    break;

                case 6:
                    mostrarPerfumes();
                    break;

                case 7:
                    mostrarRopa();
                    break;
                case 8:
                    break;
            }
        } while (!(opcion == 8));
    }

    public void cantidadDeProductos() {
        System.out.println("la cantidad de perfumes es " + rougue.size());
        System.out.println("-----------------------------------------");
        System.out.println("la cantidad de ropa  es " + zara.size());
        System.out.println("-----------------------------------------");
        System.out.println("la cantidad de electrodomesticos es " + lg.size());

    }

    public void mostrarElectro() {
        for (Electrodomesticos electrodomesticos : lg) {
            System.out.println(electrodomesticos);
        }
    }

    public void mostrarPerfumes() {
        for (Perfumeria elementos : rougue) {
            System.out.println(elementos);
        }

    }

    public void mostrarRopa() {
        for (Ropa elementos : zara) {
            System.out.println(elementos);

        }
    }
}
