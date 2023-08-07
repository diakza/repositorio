package ejercicio.extra1guia5;

import java.util.Arrays;
import java.util.Scanner;

public class Pila {
    
   private int tope;
    private String[] elementos;
    
    public Pila(int t) {
        this.tope = -1;
        this.elementos = new String[t];
    }

    public int getTope() {
        return tope;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }
    
   
    public void agregar(String elemento){
       if(!pilaLlena()) {
           this.tope++;
           this.elementos[this.tope] = elemento;
       }
    }
    public String verTope(){
      return this.elementos[this.tope];         
    }
    
    public String quitar(){
    String aux = this.elementos[this.tope];    
    this.elementos[this.tope] = "";
    this.tope--;
    return aux;
    }
    public boolean pilaVacia(){
      return this.tope == -1;
    }
     public boolean pilaLlena(){   
      return this.tope + 1 == this.elementos.length; 
    }
}
