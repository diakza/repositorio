package ejercicio3guia5.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Cine {

    private String nombre;

    private String direccion;

    HashSet<Pelicula> Proyecciones = new HashSet();
    ArrayList<Pelicula> Proyeccioneslist = new ArrayList(Proyecciones);

    public Cine() {
    }

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarPelicula(Pelicula pelicula) {

        Proyecciones.add(pelicula);
        
    }
    

    public void listarTodo() {

        for (Pelicula elementos : Proyeccioneslist) {

            System.out.println("la pelicula es " + elementos);

        }

    }

    public void listarDuranMas(int horas) {

        Collections.sort(Proyeccioneslist, mayorduracion);
        for (Pelicula elementos : Proyecciones) {
            if (horas < elementos.getDuracion()) {
                System.out.println("las peliculas de mayor duracion segun lo recibido son " + elementos);
            }
        }

    }

    public void listarMenorDuracionAMayor() {
        Collections.sort(Proyeccioneslist, menorduracion);

        for (Pelicula elementos : Proyeccioneslist) {

            System.out.println("las peliculas de mayor duracion son  " + elementos);
            for (int i = 0; i < 10; i++) {

            }
            System.out.println("");

        }
    }

    public void listarOrdenadasPorTitulo() {
        Collections.sort(Proyeccioneslist, titulos);
        String mensaje = "las peliculas ordenadas por titulo son ";
        for (Pelicula elementos : Proyeccioneslist) {

            System.out.println(mensaje + elementos);

            for (int i = 0; i < 10; i++) {

            }
            System.out.println("");
        }
    }

    public void listarOrdenadasPorDirector() {
        Collections.sort(Proyeccioneslist, directors);
        for (Pelicula elementos : Proyeccioneslist) {

            System.out.println("las peliculas ordenadas por director  son  " + elementos);
            for (int i = 0; i < 10; i++) {

            }
            System.out.println("");

        }

    }

//   
    Comparator<Pelicula> menorduracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            if (p1.getDuracion() < p2.getDuracion()) {
                return -1;
            }
            if (p1.getDuracion() == p2.getDuracion()) {
                return 0;
            }
            return 1;

        }
    };

    Comparator<Pelicula> mayorduracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            if (p2.getDuracion() < p1.getDuracion()) {
                return -1;
            }
            if (p2.getDuracion() == p1.getDuracion()) {
                return 0;
            }
            return 1;

        }
    };
    Comparator<Pelicula> titulos = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());

        }
    };

    Comparator<Pelicula> directors = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());

        }
    };

    @Override
    public String toString() {
        return "Cine{" + "nombre=" + nombre + ", direccion=" + direccion + ", Proyecciones=" + Proyecciones + ", menorduracion=" + menorduracion + ", mayorduracion=" + mayorduracion + ", titulos=" + titulos + ", directors=" + directors + '}';
    }

}
