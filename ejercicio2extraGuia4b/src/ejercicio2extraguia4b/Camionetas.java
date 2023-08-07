package ejercicio2extraguia4b;

public class Camionetas extends Vehiculos {

    public Camionetas() {
    }

    public Camionetas(Combustible combustible, String patente, String marca) {
        super(combustible, patente, marca);
    }

    
    
    
    
    
    @Override
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
