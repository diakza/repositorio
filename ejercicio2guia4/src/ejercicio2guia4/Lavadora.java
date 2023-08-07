package ejercicio2guia4;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
///Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
////tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
////incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
////Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
////al precio.
    @Override
    public void precioFinal() {
        
       super.precioFinal();
        if (carga>30) {
            precio+=500;
        }
        System.out.println("precio final es $ "+precio);
        
    }
}
