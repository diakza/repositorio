package ejjercicio1extraguia4b;

public class Barco {

    protected String matricula;

    protected double eslora;

    protected String anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, String anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        double modulobarco;
        modulobarco = this.eslora * 10;

        return modulobarco;
    }
}
