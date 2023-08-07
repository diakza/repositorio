/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author diakz
 */
public class Jugador {
    
//    esta clase posee los siguientes atributos: id (representa el número del jugador),
//nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está
//mojado o no el jugador).
    
    private int id;
    private String nombre;
   private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
//    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y
//siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
//el jugador se moja; por lo tanto el atributo mojado pasa a true, sino false.
    
    public void Disparorevolver(Revolverdeagua colt){
        
        colt.mojar();
        colt.siguienteChorro();
        if (colt.mojar()) {
            this.mojado=true;
        }
    }
    
    
    
    
    
    
    
    
}
