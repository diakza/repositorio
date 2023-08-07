package ejercicio3guia5.pkg2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3Guia52 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner dow = new Scanner(System.in);

        Cine cine = new Cine("roma", "rivadavia");

        System.out.println("nombre del cine:" + cine.getNombre());
        String opc;
        String opct;
        String opcd;
        int opcdur;
        do {

            System.out.println(" ingrese titulo");
            opct = leer.nextLine();

            System.out.println("--------------------------------------");

            System.out.println(" ingrese el nombre del director de su pelicula ");

            opcd = leer.nextLine();
            System.out.println("ingrese duracion de la peli");

            opcdur = leer.nextInt();
            leer.nextLine();
            System.out.println("---------------------------------------");

            System.out.println("----------------------------------------");
            System.out.println("");
            Pelicula peli = new Pelicula(opct, opcd, opcdur);
            cine.agregarPelicula(peli);

//          
            System.out.println("¿desea seguir agregando? responda con s/n");
            opc = dow.nextLine();

        } while (!(opc.equalsIgnoreCase("n")));

        System.out.println("---------------------------------------");

        System.out.println("el listado de peliculas desordenadas");
        cine.listarTodo();

        System.out.println("------------------------------------");

        cine.listarDuranMas(2);

        System.out.println("------------------------------------");

        cine.listarOrdenadasPorTitulo();

        System.out.println("----------------------------------------");

        cine.listarOrdenadasPorDirector();
        System.out.println("---------------------------------------");

        cine.listarMenorDuracionAMayor();
//        

//while (it.hasNext()) {
//if (it.next() == 3) { // Borramos si está el numero 3
//it.remove();
//}
//}
    }
}
