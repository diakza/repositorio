/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8guia6;

/**
 *
 * @author diakz
 */
public class Class3 {
    
    public static int metodo(){
int valor=0;
//declara un variable int e la inicializa en 0
try{



valor = valor + 1;
// entra al try y ahora el valor vale 1
valor = valor + Integer.parseInt ("W");
// aca tenemos un error tipo numberFormatException
valor = valor + 1;
// se saltea hasta el catch toda linea dentro del try debajo del error
System.out.println("Valor final del try: " + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt ("W");
// entra en el catch pero aca vuelve a poner mal, por lo que genera un nuevo error 
System.out.println("Valor final del catch: " + valor);
//esta linea no se ejecutaria y se romperia el codigo
} finally{
valor = valor + 1;
// entra el finally si o si como tenia 1 le suma 1
System.out.println("Valor final del finally:" + valor);
// muestra el mensaje con el nuevo valor
}
valor = valor + 1;
System.out.println("Valor antes del return:"  + valor) ;

return valor;
}
    
}
