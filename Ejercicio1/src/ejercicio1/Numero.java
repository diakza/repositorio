/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author josec
 */
public class Numero {
    private int numero;
   

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean esPar(){
        boolean par;
        par = this.numero%2==0;
        return par;
    }
    
    public boolean esPositivo(){
        boolean positivo;
        positivo = this.numero>=0;    
        return positivo;
    }     
    
    public boolean esMultiploDe(int numero){
        boolean multiplo;
        multiplo = this.numero%numero==0;
        return multiplo;
    
    }
}
