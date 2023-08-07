package ejercicio1extraguia4;

public class Barco {

    protected String matricula;

    protected double eslora;

    protected int anioFabricacion;

   

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        
        
    }

   
    
    
    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    

    
    
    
    
    
    
    
    
    
    public double modulobarco(){
                          
        
        double moduloBarco=eslora*10;
  
        
       return moduloBarco;
        
    }
}
