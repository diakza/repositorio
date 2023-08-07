/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author diakz
 */
public class Revolverdeagua {
    
    
    private int posiciontambor;
    private int posicionagua;

    public Revolverdeagua(int posiciontambor, int posicionagua) {
        this.posiciontambor = posiciontambor;
        this.posicionagua = posicionagua;
    }

    public Revolverdeagua() {
    }

    public int getPosiciontambor() {
        return posiciontambor;
    }

    public void setPosiciontambor(int posiciontambor) {
        this.posiciontambor = posiciontambor;
    }

    public int getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(int posicionagua) {
        this.posicionagua = posicionagua;
    }
    
    
//    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben
////ser aleatorios.
////• mojar(): devuelve true si la posición del agua coincide con la posición actual
////• siguienteChorro(): cambia a la siguiente posición del tambor.
////• toString(): muestra información del revolver (posición actual y donde está el agua)
    
    public void llenarRevolver(){
       this.posicionagua =(int) ((Math.random() * 6) + 1);
      this.posiciontambor =(int) ((Math.random() * 6) + 1);
        
    }
    
    
    
    public boolean mojar(){
        
        if (this.posicionagua==this.posiciontambor) {
            
        }
        return true;
        
        
    }
    
    public void siguienteChorro(){
        this.posiciontambor++;
        if(mojar()){
            
            
        }else
        
        if (this.posicionagua==6||this.posiciontambor==6) {
            
            
            this.posicionagua=1;
            this.posiciontambor=1;
            
        }
        
    }

    
    
    @Override
    public String toString() {
        return "Revolverdeagua{" + "posiciontambor=" + posiciontambor + ", posicionagua=" + posicionagua + '}';
    }
    
    
    
    
    
    
}
