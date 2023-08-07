package guia4ejercicio4;

public  class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero() {
    }

    public Guerrero(boolean caballo, Position ubicacion, String nick ) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }
//Sobreescribir el comportamiento de Disparar para que si tiene menos de 30 unidades de energía
//pierda el caballo.
    @Override
    public void Disparar() {
        super.Disparar();
        if (energia<30) {
            caballo=false;
            System.out.println(" perdio su caballo");
        }
            
        
    }

    @Override
    public void Girar() {
        System.out.println("posicion inicial "+orientacion);
        super.Girar();
        
    }
//Sobreescribir el comportamiento de Avanzar para que si tiene un caballo avanzará de a 10 pasos
//caso contrario se comportará como el método de la clase padre.
    @Override
    public void Avanzar(int pasos) {
        
        if (caballo==false) {
            super.Avanzar(pasos);
            
        }else
            super.Avanzar(pasos*10);
        
    }
}
