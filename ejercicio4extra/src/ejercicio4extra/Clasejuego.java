/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4extra;

/**
 *
 * @author diakz
 */
public class Clasejuego {
    
    
    private Jugador player1, player2;
    private Revolverdeagua magnum;

    public Clasejuego(Jugador player1, Jugador player2, Revolverdeagua magnum) {
        this.player1 = null;
        this.player2 = null;
        this.magnum = null;
    }

    public Clasejuego() {
    }

    public Jugador getPlayer1() {
        return player1;
    }

    public void setPlayer1(Jugador player1) {
        this.player1 = player1;
    }

    public Jugador getPlayer2() {
        return player2;
    }

    public void setPlayer2(Jugador player2) {
        this.player2 = player2;
    }

    public Revolverdeagua getMagnum() {
        return magnum;
    }

    public void setMagnum(Revolverdeagua magnum) {
        this.magnum = magnum;
    }
    
    public void llenarJuego(Jugador manco,Jugador manco2,Revolverdeagua colt){
        
        if (player1==null&&player2==null&&magnum==null) {
            player1=manco;
            player2=manco2;
            magnum=colt;
        } 
    }
    
    public void ronda(){
        magnum.llenarRevolver();
        System.out.println("posicion de agua "+magnum.getPosicionagua()+"posicion de tambor "+magnum.getPosiciontambor());
        while(player1.isMojado()==false||player2.isMojado()==false){
            
            player1.Disparorevolver(magnum);
            player2.Disparorevolver(magnum);
            
            
        }
        
        
        if (player1.isMojado()) {
            System.out.println("sos un manco y te moriste "+player1.getNombre());
        }else
            System.out.println("sos un manco y te moriste"+player2.getNombre());
        
        
    }
    
}
//esta clase posee los siguientes atributos: 2 Jugadores y Revolver
////
////Métodos:
////• llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método recibe los 2 jugadores
////y el revolver para guardarlos en los atributos del juego.
////• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el
////gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
////siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
////debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
////atributos de la clase Juego.


