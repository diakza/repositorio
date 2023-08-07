/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.extra.pkg2;

/**
 *
 * @author diakz
 */
public class Jugador {
    private String nombre;
    private int clasificacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.clasificacion = 0;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

   
    

   
   
//    tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método
//generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
//verClasificación(): Retornará la clasificación del jugador.
//Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y
//los métodos:
//generarNro(): Que genera un número al azar entre 1 y 6 que se lo asigna a su variable atributo
//numero, si el atributo tiene un valor mayor a 0, significa que ese dado ya generó un valor y lo
//mantendrá.
//verNro(): Retornará el valor guardado en la variable numero.
    
    
    public void tirarDado(Dado dado){
               
        dado.gralNro();
        this.clasificacion+= dado.getNum();
        
        
        
            
            
           
        
        
        
    }
    public int verClasificacion(){
       return this.clasificacion;
        
    }
    
    
}
