package ejercicio.pkg3;

public class Auto {

    private String color;

    private String patente;

    private int combustible=50;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        
    }

    

    public Auto() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    
    
    
    
    
    
    
    
}
