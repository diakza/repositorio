package ejercicio2guia4;

public class Televisor extends Electrodomestico {

    private double resolucion;

    private boolean sintonizador;

    public Televisor(double resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    

    public Televisor() {
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
//Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el
//televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un
//sintonizador TDT incorporado, aumentará $500.
    @Override
    public void precioFinal() {
        
        super.precioFinal();
        if (resolucion>40) {
            precio+=precio*0.30;
        } if(sintonizador){
            precio+=500;
        }
        
        System.out.println(" el precio final es $ "+precio);
        
        
    }
}
