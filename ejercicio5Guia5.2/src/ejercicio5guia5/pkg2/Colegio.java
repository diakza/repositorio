package ejercicio5guia5.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Colegio {

    private String nombre;

    private String direccion;

    HashSet<Alumno> clase = new HashSet();
    ArrayList<Alumno> lista = new ArrayList(clase);

    public Colegio() {
    }

    public Colegio(String nombre, String direccion) {
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

    public void agregarAlumnos(Alumno alumno) {

        clase.add(alumno);

    }

    public void listarAlfabeticamente() {
        List<Alumno> alumnos = new ArrayList(clase);
        Collections.sort(alumnos, apellido);
        System.out.println("ordenados alfabeticamente por apellido");
        for (Alumno elementos : alumnos) {
            System.out.println(elementos);
        }

    }

    public void listarApellido(char caracter) {
        List<Alumno> alumnos = new ArrayList(clase);

        System.out.println("ha ingresado " + caracter);

        System.out.println("estos son los alumnos con esta inicial");
        for (Alumno elementos : alumnos) {

            if (elementos.getApellido().charAt(0) == caracter) {

                System.out.println(elementos);
            }

        }

    }

    public void quitarAlumno(int legajo) {
        LinkedList<Alumno> alumnos1 = new LinkedList(clase);

        Iterator<Alumno> iter = alumnos1.iterator();

        while (iter.hasNext()) {
            Alumno elemento = iter.next();
            System.out.println(elemento);
            if (elemento.getLegajo() == legajo) {
                iter.remove();
                System.out.println("alumno expulsado" + elemento);
            }
        }
        
    }

    Comparator<Alumno> apellido = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno p1, Alumno p2) {

            return p1.getApellido().compareTo(p2.getApellido());

        }
    };

    @Override
    public String toString() {
        return "Colegio{" + "nombre=" + nombre + ", direccion=" + direccion + ", clase=" + clase + ", lista=" + lista + ", apellido=" + apellido + '}';
    }

}
