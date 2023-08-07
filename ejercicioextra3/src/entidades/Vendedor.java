/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author diakz
 */
public class Vendedor {
    
    
    
    private String nombre;
    private Cliente elcliente;

    public Vendedor(String nombre, Cliente elcliente) {
        this.nombre = nombre;
        this.elcliente = elcliente;
    }

    public Vendedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getElcliente() {
        return elcliente;
    }

    public void setElcliente(Cliente elcliente) {
        this.elcliente = elcliente;
    }
    
}
