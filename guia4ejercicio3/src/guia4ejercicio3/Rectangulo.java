package guia4ejercicio3;

public class Rectangulo implements Calculosformas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double Calculararea() {
        
        double area= base*altura;
        return area;
        
    }

    @Override
    public double CalcularPerimetro() {
        double perimetro = base*2+altura*2;
        
        return perimetro;
    }
}
