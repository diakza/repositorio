package ejercicio2extraguia4;

public class Combustible {

    private double precio;

    private String tipoCombustible;

    public Combustible(double precio, String tipoCombustible) {
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
    }

    public Combustible() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
    
    
    
}
