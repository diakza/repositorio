package ejercicio2extraguia4;

import java.util.Scanner;

public class Viaje {

    Scanner leer = new Scanner(System.in);
    private String origen;

    private String destino;

    private double distancia;

    private Vehiculos carro;

    private int cantPeajes;

    private double kmOrigen;

    private double kmDestino;

   

    public Viaje() {
    }

    public Viaje(String origen, String destino, double distancia, Vehiculos carro, int cantPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.carro = carro;
        this.cantPeajes = cantPeajes;
        
    }

    public Viaje(Vehiculos carro, double kmOrigen, double kmDestino, int cantPeajes) {
        this.carro = carro;
        this.kmOrigen = kmOrigen;
        this.kmDestino = kmDestino;
        
        this.cantPeajes = cantPeajes;
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
        return kmOrigen;
    }

    public void setKmOrigen(double kmOrigen) {
        this.kmOrigen = kmOrigen;
    }

    public double getKmDestino() {
        return kmDestino;
    }

    public void setKmDestino(double kmDestino) {
        this.kmDestino = kmDestino;
    }

    

    public double calculoDeDistancia() {
        String opcion;
        double distancia2=0;
        System.out.println("el origen y el destino se encuentran en la misma ruta? " + "s/n");
        opcion = leer.next();
        if (opcion.toLowerCase().equals("s")) {
            System.out.println("la distancia es "+distancia);
            return this.distancia;

        } else { distancia2=Math.abs(kmDestino-kmOrigen);
            System.out.println("la distancia es "+distancia2);
        }
        return distancia2;
    }

    
    
    public double calculoDePeajes() {
        int costoPeaje;
        if (carro instanceof Auto || carro instanceof Camionetas) {
            costoPeaje = cantPeajes * 100;
            System.out.println("el costo es "+costoPeaje);
        } else {
            costoPeaje = cantPeajes * 200;
            System.out.println("el costo es "+costoPeaje);
        }

        return costoPeaje;
    }

    public double calculoCombustible() {
        double consumo=0;
        
        if (carro instanceof Auto  ) {
        consumo=100/7; 
            System.out.println("consumo del auto "+consumo);
    }if (carro instanceof Camionetas) {
            consumo=100/10;
            System.out.println("consumo del camioneta "+consumo);
        }if (carro instanceof Camiones) {
            consumo=100/12;
            System.out.println("consumo del camion "+consumo);
        }
        return consumo;
    }
    public void calculoTotal() {
        
       double total,total2;
       
         total=(calculoDeDistancia()*carro.calcularCostoDeCombustible())/100 ;
        total2=(total*calculoCombustible())+calculoDePeajes();
        
        System.out.println("total del costo de su viaje es "+total2);
    }

}
