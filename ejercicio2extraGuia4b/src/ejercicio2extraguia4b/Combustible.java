package ejercicio2extraguia4b;

public class Combustible {

    private String tipoCombustible;

    private double precio;

    public Combustible(String tipoCombustible, double precio) {
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }

    public Combustible() {
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
