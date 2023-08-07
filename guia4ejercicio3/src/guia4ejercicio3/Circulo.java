package guia4ejercicio3;

public class Circulo implements Calculosformas {

    
    
    private  double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    
    @Override
    public double Calculararea() {
      double area=PI*(Math.pow(radio, 2)); 
      
      return area;
    }

    @Override
    public double CalcularPerimetro() {
       double perimetro=PI*radio*2;
       return perimetro;
    }
}
