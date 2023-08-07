package ejercicio6guia5.pkg2;

public class Perfumeria extends Producto {

    private double cc;

    public Perfumeria() {
    }

    public Perfumeria(double cc, int precioLista, int Stock, String marca, String descripcion) {
        super(precioLista, Stock, marca, descripcion);
        this.cc = cc;
        calcularPrecio();
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    @Override
    public void calcularPrecio() {
        double aux = cc;
        double porcentaje = 0;
        while (aux >= 100) {
            aux -= 100;
            porcentaje += 20;
        }
        precioLista = (int) (precioLista + (precioLista / 100 * porcentaje));
    }

    @Override
    public String toString() {
        return "Perfumeria{" + super.toString()+"cc=" + cc + '}';
    }

    
}
