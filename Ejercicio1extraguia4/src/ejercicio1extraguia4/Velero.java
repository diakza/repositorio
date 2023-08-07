package ejercicio1extraguia4;

public class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public double modulobarco(){
        
          double preciofinal;
            
    preciofinal=super.modulobarco()+mastiles;
  
        return preciofinal;
       
           
        
        
         
    }
    
    
    
}
