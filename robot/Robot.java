package robot;

public class Robot {
    private Bateria bateria;
    private boolean dormido;

    public Robot(Bateria bateria){this.bateria=bateria; dormido=false;}
    public Bateria getBateria(){return this.bateria;}
    public boolean getDormido(){return this.dormido;}
    public void Avanzar(int pasos){
        if(dormido==true){
            System.out.println("el robot no puede avanzar, esta dormido...");
            return;
        }
        int pasosaux=0;
        int cargaTotal=this.bateria.getCarga();
        while(cargaTotal>0 && pasos >0){
            pasos-=100;
            cargaTotal-=10;
            pasosaux+=100;
        }
        bateria.setCarga(cargaTotal);
        if(this.bateria.getCarga()==0 && pasos>0){
            System.out.println("NO SE RECORRIERON EL TOTAL DE LOS PASOS POR FALTA DE BATERIA");
            System.out.println("pasos restantes = " + pasos);
        }
        System.out.println("se han recorrido: "+pasosaux+" pasos");
        System.out.println("ah quedado "+this.bateria.getCarga()+" bateria");
    }

    public void Retroceder(int pasos){
        if(dormido==true){
            System.out.println("el robot no puede retroceder, esta dormido...");
            return;
        }
        int pasosaux=0;
        int cargaTotal=this.bateria.getCarga();
        while(cargaTotal>0 && pasos >0){
            pasos-=100;
            cargaTotal-=10;
            pasosaux+=100;
        }
        bateria.setCarga(cargaTotal);
        if(this.bateria.getCarga()==0 && pasos>0){
            System.out.println("NO SE RECORRIERON EL TOTAL DE LOS PASOS POR FALTA DE BATERIA");
            System.out.println("pasos restantes = " + pasos);
        }
        System.out.println("se han retrocedieron: "+pasosaux+" pasos");
        System.out.println("ah quedado "+this.bateria.getCarga()+" bateria");
    }
    public void Dormir(){
        if(this.dormido==true)
            System.out.println("el robot ya esta dormido");
        else
            System.out.println("el robot se durmio...");
        this.dormido=true;
    }

    public void Despertar(){
        if(this.dormido==false)
            System.out.println("el robot ya esta despierto");
        else
            System.out.println("el robot se despierta...");
        dormido=false;
    }

    public void Recargar(){
        this.bateria.setCarga(1000);
    }

    public boolean bateriaLlena(){return energiaActual()==1000;}
    public boolean bateriaVacia(){return energiaActual()==0;}

    public int energiaActual(){return this.bateria.getCarga();}
}
