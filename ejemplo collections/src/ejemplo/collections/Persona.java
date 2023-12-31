/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.collections;

import java.util.Comparator;

/**
 *
 * @author diakz
 */
public class Persona {
    
    private int dni;

private String nombre;

public Persona(int dni,String nombre){

this.dni=dni;

this.nombre=nombre;

}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




public String toString(){

return dni+" "+nombre;

}

//public int compareTo(Object ob){
//
//int doc=((Persona)ob).dni;
//
//return this.dni < doc ?-1 :(dni==doc ?0:1);
//
//}
//public int compareTo(Object ob){
//String nom=((Persona)ob).nombre;
//return nombre.compareTo(nom) < 0 ?-1 :(nombre.compareTo(nom)==0 ?0:1);
//
//
//}

public static Comparator<Persona> comparaNombre = new Comparator<Persona>(){  // Creamos un objeto comparator  
    public int compare(Persona p1, Persona p2){
    return p1.nombre.compareTo(p2.nombre);
    
    }
};
public static Comparator<Persona> comparaDni = new Comparator<Persona>(){  // Creamos un objeto comparator  
    public int compare(Persona p1, Persona p2){
    return p2.dni < p1.dni ?-1 :(p2.dni==p1.dni ?0:1);
    
    }
};


}
}
