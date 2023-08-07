/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicioextra3guia5.pkg2;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejericicioextra3Guia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Libro2> libros = new HashSet();

        /* String condicion;
        String titulo;
        String autor;
        int numerosDeEjemplares;
        int ejemplaresPrestados;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Ingrese el titulo");
            titulo=sc.next();
            System.out.println("Ingrese el el autor");
            autor=sc.next();
            System.out.println("Ingrese el numero de ejemplares");
            numerosDeEjemplares=sc.nextInt();
            System.out.println("Ingrese los ejemplares prestados");
            ejemplaresPrestados=sc.nextInt();
            Libro libro=new Libro(titulo,autor);
            libros.add(libro);
            System.out.println("Desea ingresar mas mas libros Y/N");
            condicion=sc.next();

        }while(!(condicion.equalsIgnoreCase("N")));*/
        libros.add(new Libro2("Hippie el guerrero", "Luciana Lopilato",
                1, 0));
        libros.add(new Libro2("EL senor de los anillos", "Tolkien",
                5, 0));
        libros.add(new Libro2("Games of Thrnes", "George Martin", 4, 4));
        Bibloteca bibloteca = new Bibloteca(libros);
        bibloteca.prestamo("Hippie el guerrero", "Luciana Lopilato");
        bibloteca.prestamo("Hippie el guerrero", "Luciana Lopilato");
        bibloteca.mostarLibros();
        bibloteca.devolucion("Hippie el guerrero", "Luciana Lopilato");
        bibloteca.devolucion("Hippie el guerrero", "Luciana Lopilato");
        bibloteca.mostarLibros();

    }

}
