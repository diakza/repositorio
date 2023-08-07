package robot;

public class Main {
    public static void main(String[] args) {
        Bateria bateria=new Bateria(1000);
        Robot robot= new Robot(bateria);
        Persona person= new Persona("juan");
        Persona person1= new Persona("pedro");

        System.out.println("JUAN JUEGA CON ROBOT: ");
        person.JugarConRobot(robot);
        System.out.println(" ");
        System.out.println("PEDRO JUEGA CON ROBOT");
        person1.JugarConRobot(robot);
    }
}