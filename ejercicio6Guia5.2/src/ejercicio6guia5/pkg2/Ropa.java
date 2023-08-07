package ejercicio6guia5.pkg2;

public class Ropa extends Producto {

    private String tipoTela;

    public Ropa(String tipoTela, int precioLista, int Stock, String marca, String descripcion) {
        super(precioLista, Stock, marca, descripcion);
        this.tipoTela = tipoTela;
        calcularPrecio();
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public void calcularPrecio() {
        
        precioLista*=1.40;
        
    }

    @Override
    public String toString() {
        return "Ropa{" + "tipoTela=" + tipoTela +super.toString()+ '}';
    }
    
    
    
}
