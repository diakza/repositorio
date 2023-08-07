package ejercicio1extraguia4;

public class Barcomotor extends Barco {

    private int potenciacv;

    public Barcomotor() {
    }

    public Barcomotor(int potenciacv, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciacv = potenciacv;
    }

    public int getPotenciacv() {
        return potenciacv;
    }

    public void setPotenciacv(int potenciacv) {
        this.potenciacv = potenciacv;
    }
    
    @Override
    public double modulobarco(){
        
         super.modulobarco();
          double preciofinal;
          preciofinal=super.modulobarco()+potenciacv;
  
        return preciofinal;
       
    }
    
    
    
    
    
    
}
