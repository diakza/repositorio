package ejercicio.pkg3;

public class Rueda {

    private String marca;

    private double psi;

    public Rueda(String marca, double psi) {
        this.marca = marca;
        this.psi = 28.0;
    }

    
    public Rueda() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPsi() {
        return psi;
    }

    public void setPsi(double psi) {
        this.psi = psi;
    }
    
    public void Desinflar() {
        if (psi <= 28.0 || psi > 14.0) {
            psi = (psi - 0.5);
        }
        
        System.out.println("Debe controlar la presion de su rueda");

    }

    public void inflar() {
        if (psi < 14.0) {
            System.out.println("Se ha inflado la rueda");
            psi = 28.0;
        }

    }

    public void Pinchar() {
        if (psi <= 14.0) {
            System.out.println("Su rueda esta pinchada");

        }
    }
    
    
}


   
