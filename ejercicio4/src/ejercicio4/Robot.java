/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author diakz
 */
public class Robot {

    private Bateria bateria;

    private boolean dormido;

    public Robot() {
    }

    public Robot(Bateria bateria) {
        this.bateria = bateria;

    }

    public boolean isDormido() {
        return this.dormido = false;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    /*
    Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que el Robot
reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir() //despierto = false;
• Despertar() //despierto = verdad;
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int

También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez
que avanza o retrocede por cada 100 pasos pierde 10 unidades además si damos la orden al robot
de dormir, no responderá al avanzar o retroceder hasta despertarlo.
Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.

La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite
inicializar su carga y los métodos get y set para dicho atributo.
     */
 /*
    • Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos) 
    para que el robot se mueva tenemos 2 condiciones:
    1-tenga bateria.
    2-que no este dormido.
     */
    public void avanzar(int pasos) {

        if (dormido) {
            System.out.println("su robot no podra avanzar, esta dormido");
        } else {
            int auxpasos = 0;
            int cargatotal = this.bateria.getCarga();
            while (cargatotal > 0 && pasos > 0) {
                pasos -= 100;
                cargatotal -= 10;
                auxpasos += 100;
                bateria.setCarga(cargatotal);
            }
        }

//        if (this.bateria.getCarga() == 0 && pasos > 0) {
//
//            System.out.println("NO SE RECORRIERON EL TOTAL DE LOS PASOS POR FALTA DE BATERIA");
//            System.out.println("pasos restantes = " + pasos);
//
//            System.out.println("avanzo " + auxpasos + " queda de bateria " + this.bateria.getCarga() + bateria);
//        }

    }

    public boolean despertar() {
        if (dormido) {
            System.out.println("se ha despertado el robot");
            dormido = false;
        }
        return dormido;
    }

    public boolean dormidom() {
        if (dormido == false) {
            System.out.println("se ha dormido el robot");
            dormido = true;
        }
        return dormido;

    }

    public void retroceder(int pasos) {
        if (dormido) {
            System.out.println("su robot no podra avanzar, esta dormido");
        } else {
            int auxpasos = 0;
            int cargatotal = this.bateria.getCarga();
            while (cargatotal > 0 && pasos > 0) {
                pasos -= 100;
                cargatotal -= 10;
                auxpasos += 100;
                bateria.setCarga(cargatotal);
            }
        }

//        if (this.bateria.getCarga() == 0 && pasos > 0) {
//
//            System.out.println("NO SE RECORRIERON EL TOTAL DE LOS PASOS POR FALTA DE BATERIA");
//            System.out.println("pasos restantes = " + pasos);
//
//            System.out.println("avanzo " + auxpasos + " queda de bateria " + this.bateria.getCarga() + bateria);
//        }

    }

    public int energiaActual() {
        return bateria.getCarga();

    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;

    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;

    }

    public Bateria recarga() {
        bateria.setCarga(1000);
        return bateria;

    }

}

//private String nombre;
//
//    public Bateria bateria;
//    
//    boolean activo=true;
//
//    public Robot(String nombre, Bateria bateria) {
//        this.nombre=nombre;
//        this.bateria=bateria;
//    }
//
//    public void avanzar(int pasos) {
//        if (activo){    
//            if ((pasos/10)<=bateria.getcarga()){
//                System.out.println("El robot Avanzó "+pasos+" pasos");
//                bateria.setcarga(bateria.getcarga()-(pasos/10));
//            } else {
//                System.out.println("Energia insuficiente");
//            }
//        }else{
//            System.out.println("Robot Dormido, no puede avanzar");
//        }
//    }
//public void retroceder(int pasos) {
//        if (activo){
//            if ((pasos/10)<=bateria.getcarga()){
//                System.out.println("El robot retrocedio "+pasos+" pasos");
//                bateria.setcarga(bateria.getcarga()-(pasos/10));
//                
//            } else {
//                System.out.println("Energia insuficiente");
//            }
//        }else{
//            System.out.println("Robot Dormido, no puede retroceder");
//        }
//    }
//
//    public void dormir() {
//        if (activo){
//        System.out.println("Se puso a dormir el Robot");
//        activo = false;
//        }else{
//            System.out.println("El robot ya estaba apagado");
//        }
//    }private String nombre;

//    public Bateria bateria;
//    
//    boolean activo=true;
//
//    public Robot(String nombre, Bateria bateria) {
//        this.nombre=nombre;
//        this.bateria=bateria;
//    }
//
//    public void avanzar(int pasos) {
//        if (activo){    
//            if ((pasos/10)<=bateria.getcarga()){
//                System.out.println("El robot Avanzó "+pasos+" pasos");
//                bateria.setcarga(bateria.getcarga()-(pasos/10));
//            } else {
//                System.out.println("Energia insuficiente");
//            }
//        }else{
//            System.out.println("Robot Dormido, no puede avanzar");
//        }
//    }
//public void retroceder(int pasos) {
//        if (activo){
//            if ((pasos/10)<=bateria.getcarga()){
//                System.out.println("El robot retrocedio "+pasos+" pasos");
//                bateria.setcarga(bateria.getcarga()-(pasos/10));
//                
//            } else {
//                System.out.println("Energia insuficiente");
//            }
//        }else{
//            System.out.println("Robot Dormido, no puede retroceder");
//        }
//    }
//
//    public void dormir() {
//        if (activo){
//        System.out.println("Se puso a dormir el Robot");
//        activo = false;
//        }else{
//            System.out.println("El robot ya estaba apagado");
//        }
//    }