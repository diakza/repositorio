package ejercicio2guia4;

public abstract class Electrodomestico {

    protected double precio;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    

    public Electrodomestico() {
    }

    public char comprobarConsumoEnergetico() {
        
       switch(consumoEnergetico){
            case 'A': 
                   
            case 'B': 
                      
            case 'C': 
                     
            case 'D': 
                      
            case 'E': 
                      
            case 'F':
                    return consumoEnergetico;
            default: 
                   return 'F';           
       }
        
        
    }

    public String comprobarColor() {
        
       color = color.toLowerCase();
        switch (color) {
            case "blanco":
            case "negro":
            case "azul":
            case "rojo":
            case "gris":
                return color;
            default:
                return "blanco";
        }
        
    }

    public void precioFinal() {
        
       
        
        
  switch (consumoEnergetico) {
            case 'a': precio+=1000;
             break;
            case 'b': precio+=800;
             break;
            case 'c':precio+=600;
            break;
            case 'd':precio+=500;
            break;
            case 'e':precio+=300;
            break;
            case 'f':precio+=100;
               break; 
            
                
        }
    
        if (peso>=1&&peso<=19) {
            precio+=100;
        }else if(peso>=20&&peso<=49){
            precio+=500;
        }else if(peso>=50&&peso<=79){
            precio+=800;
            
        }else
            precio+=1000;
  
  
   }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
}


