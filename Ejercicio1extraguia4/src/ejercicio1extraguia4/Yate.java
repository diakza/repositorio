package ejercicio1extraguia4;

public class Yate extends Barco {

    private int camarotes;

    private int cv;

    public Yate() {
    }

    public Yate(int camarotes, int cv, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public double modulobarco() {
         
       
   double  preciofinal;
  
        preciofinal= super.modulobarco()+camarotes+cv;
        return preciofinal;
       
 
    }

}
