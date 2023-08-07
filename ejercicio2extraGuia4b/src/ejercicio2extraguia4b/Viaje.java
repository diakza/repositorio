package ejercicio2extraguia4b;

import java.util.Scanner;

public class Viaje {
    Scanner leer = new Scanner(System.in);
    private String origen;

    private String destino;

    private double distancia;

    private Vehiculos carro;

    private int cantPeajes;

    private double KmOrigen;

    private double KmDestino;

    public Viaje() {
    }

    public Viaje(String origen, String destino, double distancia, Vehiculos carro, int cantPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.carro = carro;
        this.cantPeajes = cantPeajes;
    }

    public Viaje(String origen, String destino, Vehiculos carro, int cantPeajes, double KmOrigen, double KmDestino) {
        this.origen = origen;
        this.destino = destino;
        this.carro = carro;
        this.cantPeajes = cantPeajes;
        this.KmOrigen = KmOrigen;
        this.KmDestino = KmDestino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculos getCarro() {
        return carro;
    }

    public void setCarro(Vehiculos carro) {
        this.carro = carro;
    }

    public int getCantPeajes() {
        return cantPeajes;
    }

    public void setCantPeajes(int cantPeajes) {
        this.cantPeajes = cantPeajes;
    }

    public double getKmOrigen() {
        return KmOrigen;
    }

    public void setKmOrigen(double KmOrigen) {
        this.KmOrigen = KmOrigen;
    }

    public double getKmDestino() {
        return KmDestino;
    }

    public void setKmDestino(double KmDestino) {
        this.KmDestino = KmDestino;
    }

    
    
    
    
    
    
    public double CalculoDistancia() {
        System.out.println("la ciudad de origen queda en la misma ruta que la de destino? s/n ");
        String opcion=leer.next();
         double total=0;
        if (opcion.toLowerCase().equals("s")) {
            
            total=distancia;
            System.out.println("la distancia es de "+distancia+"km");
            return total;
            
        }else if(opcion.toLowerCase().equals("n")) {
            
            total=Math.abs(KmOrigen-KmDestino);
            
            System.out.println("la distancia es de "+total+"km");
            return total;
        }
        
        
        return total;
    }

    public double CalculoPeaje() {
        double total=0;
        if (carro instanceof Auto||carro instanceof Camionetas) {
            total=cantPeajes*150;
            
        }else{
            total=cantPeajes*300;
        }
        
        return total;
    }

    public double CalculoCombustible() {
        double consumo=0;
        if (carro instanceof Auto){
            
            consumo=100/7;
            System.out.println("consumo  del auto es "+consumo);
            
        } if (carro instanceof Camionetas){
            
            consumo=100/10;
            System.out.println("consumo  de la camioneta es "+consumo);
        }if (carro instanceof Camiones) {
            
            consumo=100/12;
            System.out.println("consumo  del camiones "+consumo);
        }
        
        
        return consumo;
    }

    public double CostoTotal() {
        
        double total=0;
        
       total= CalculoDistancia()*CalculoCombustible()+CalculoPeaje();
        
        
        
        
        return total;
    }
}
