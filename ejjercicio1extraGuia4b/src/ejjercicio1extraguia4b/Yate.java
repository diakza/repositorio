package ejjercicio1extraguia4b;

public class Yate extends Barco {

    private int camarotes;

    private int potenciaCv;

    public Yate() {
    }

    public Yate(int camarotes, int potenciaCv, String matricula, double eslora, String anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        this.potenciaCv = potenciaCv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    
    @Override
    public double calcularModulo() {
         double modulobarco;
        
        modulobarco=super.calcularModulo()+potenciaCv+camarotes;
        
        return modulobarco;
    }
}
