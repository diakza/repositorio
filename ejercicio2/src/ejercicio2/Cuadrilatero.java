/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author josec
 */
public class Cuadrilatero {
    private int largo;
    private int alto;

    public Cuadrilatero() {
    }
    
    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public void calcularPerimetro(){
        int resultado=(alto*2)+(largo*2);
        System.out.println("El perimetro es: "+resultado);
    }
    
    public void calcularArea(){
        int resultado=alto*largo;
        System.out.println("El area es: "+resultado);
    }
    
    public boolean esUnCuadrado(){
        boolean resultado = alto==largo;
        return resultado;        
    }
}
