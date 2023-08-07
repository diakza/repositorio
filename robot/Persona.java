package robot;
import java.util.*;
public class Persona {
    private String nombre;
    private final Scanner scanner=new Scanner(System.in);

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void JugarConRobot(Robot robi){
        int opcion=0;
        do {
            System.out.print("ingrese cantidad de pasos a avanzar: ");
            int pasos = scanner.nextInt();
            robi.Avanzar(pasos);
            System.out.print("ingrese cantidad de pasos a retroceder : ");
            pasos = scanner.nextInt();
            robi.Retroceder(pasos);
            System.out.println("Energia actual: " + robi.energiaActual());
            do {
                System.out.println("¿desea dormir al robot? 1 para si 2 para no");
                opcion=scanner.nextInt();
                switch (opcion){
                    case 1:
                        robi.Dormir();
                        return;
                    case 2:
                        robi.Despertar();
                        break;
                    default:
                        System.out.println("opcion no valida...");
                        opcion=scanner.nextInt();
                }
            }while (!(opcion==1) && !(opcion==2));
        }while (!robi.getDormido());
    }
}

