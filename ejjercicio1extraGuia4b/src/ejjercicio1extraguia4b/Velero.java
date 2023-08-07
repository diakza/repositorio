package ejjercicio1extraguia4b;

public class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, double eslora, String anioFabricacion) {
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
    public double calcularModulo() {
        
        
         double modulobarco;
        
        modulobarco=super.calcularModulo()+mastiles;
        
        return modulobarco;
    }
}
