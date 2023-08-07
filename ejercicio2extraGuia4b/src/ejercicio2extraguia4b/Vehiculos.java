package ejercicio2extraguia4b;

public class Vehiculos {

    protected Combustible combustible;

    protected String patente;

    protected String marca;

    

    public Vehiculos(Combustible combustible, String patente, String marca) {
        this.combustible = combustible;
        this.patente = patente;
        this.marca = marca;
    }
    public Vehiculos() {
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    
    
    
    public double calcularCostodeCombustible() {
        
       double costofinal=0;
        if (combustible.getTipoCombustible().toLowerCase().equals("nafta")) {
           combustible.setPrecio(260);
           costofinal=combustible.getPrecio();
        
        }else if(combustible.getTipoCombustible().toLowerCase().equals("diesel")){
            
            combustible.setPrecio(300);
            costofinal=combustible.getPrecio();
        }else if(combustible.getTipoCombustible().toLowerCase().equals("gas")){
            
            
            combustible.setPrecio(80);
            costofinal=combustible.getPrecio();
        }
        
        return costofinal;
    }
}
