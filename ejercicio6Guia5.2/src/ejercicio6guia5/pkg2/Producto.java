package ejercicio6guia5.pkg2;

public class Producto {

    protected int precioLista;

    protected int Stock;

    protected String marca;

    protected String descripcion;

    public Producto() {
    }

    public Producto(int precioLista, int Stock, String marca, String descripcion) {
        this.precioLista = precioLista;
        this.Stock = Stock;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public int getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(int precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "precioLista=" + precioLista + ", Stock=" + Stock + ", marca=" + marca + ", descripcion=" + descripcion + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
   

    public void calcularPrecio() {
        
        
        
        
    }
}
