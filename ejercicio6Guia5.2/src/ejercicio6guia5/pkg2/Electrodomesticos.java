package ejercicio6guia5.pkg2;

public class Electrodomesticos extends Producto {

    private double consumo;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double consumo, int precioLista, int Stock, String marca, String descripcion) {
        super(precioLista, Stock, marca, descripcion);
        this.consumo = consumo;
        calcularPrecio();
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    
    
    
    @Override
    public void calcularPrecio() {
        
        
        precioLista*=1.25;
        
        
    }

    @Override
    public String toString() {
        return  "Electrodomesticos{" +super.toString()+ "consumo=" + consumo + '}';
    }
    
}
