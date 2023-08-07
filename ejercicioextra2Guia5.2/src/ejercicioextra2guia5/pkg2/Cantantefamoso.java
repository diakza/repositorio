/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioextra2guia5.pkg2;

/**
 *
 * @author diakz
 */
public class Cantantefamoso {

    private String nombre;
    private String disco;

    public Cantantefamoso() {
    }

    public Cantantefamoso(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    
    
    
    @Override
    public String toString() {
        return "Cantantefamoso{" + "nombre=" + nombre + ", disco=" + disco + '}';
    }
    

}
