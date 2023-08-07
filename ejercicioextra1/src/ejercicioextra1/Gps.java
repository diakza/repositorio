package ejercicioextra1;

public class Gps {

    private String marca;

    private String modelo;

    private Posicion ultimaubi;

    public Gps() {
    }

    public Gps(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Posicion getUltimaubi() {
        return ultimaubi;
    }

    public void setUltimaubi(Posicion ultimaubi) {
        this.ultimaubi = ultimaubi;
    }
    
    
    public void UltimaPosicion(Posicion posicion){
        
        
        System.out.println("su ultima ubicacion es"+ posicion.getLatitud()+posicion.getLongitud());
    }
     public void mover(Posicion posicion){
        
        System.out.println(" generando una nueva ubicacion ");
        posicion.setLongitud(Math.random()*100);
        posicion.setLatitud(Math.random()*100);
        
        
        
    }
}
