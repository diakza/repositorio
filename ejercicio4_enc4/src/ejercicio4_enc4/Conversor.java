/*
 * En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos
estáticos:
 convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
 convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Conversor.
a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido.pen the template in the editor.
 */
package ejercicio4_enc4;

/**
 *
 * @author diakz
 */
public class Conversor {
    private double dolar;
    private double pesos;
    
    
    
    public void Conversor()
{

}
    public  Conversor(double dolar,double pesos)
    { this.dolar=dolar;
    this.pesos=pesos;
        
        
    }

    public int getDolar() {
        return dolar;
    }

    public void setDolar(int dolar) {
        this.dolar = dolar;
    }

    public int getPesos() {
        return pesos;
    }

    public void setPesos(int pesos) {
        this.pesos = pesos;
    }
    
    
    
    public double convertirPesos()
    {
       
        double resultado = dolar * 396;
        return resultado;
         
        
    }
    
    public double convertirDolar()
    { 
        double resultado = pesos / 396;
                return resultado;
               
        
    }
    
}





