package ejjercicio1extraguia4b;

public class BarcoMotor extends Barco {

    private int potenciaCv;

    public BarcoMotor(int potenciaCv, String matricula, double eslora, String anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public BarcoMotor() {
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
        
        modulobarco=super.calcularModulo()+potenciaCv;
        
        return modulobarco;
    }
}
