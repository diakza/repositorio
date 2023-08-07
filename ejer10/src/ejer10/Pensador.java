/////*En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará
////un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para
////dicho atributo y los siguientes métodos adicionales:
////
// parAntes(): Este método retornará el valor par próximo anterior al valor guardado.
//
// parPosterior(): Este método retornará el valor par próximo posterior al valor
//guardado.
// primerDigito(): Este método retornará el primer dígito del valor guardado.
// ultimoDigito(): Este método retornará el último dígito del valor guardado.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//a) Crear una instancia de la clase Pensador.
//b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
package ejer10;

/**
 *
 * @author diakz
 */
public class Pensador {

    private int num;

    public Pensador(int num) {
        this.num = num;
    }

    public Pensador() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

//    // invertir(): Este método retornará el valor guardado en el atributo con sus cifras
////invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
    public int invertir() {
        int espejo = 0;
        int n1 = num;//acá creo esta variable para no afectar "num", ya que haremos asignación
        while (n1 > 0) {
            espejo = espejo * 10 + n1 % 10;
            n1 = (int) Math.floor(n1 / 10);
            //n1 /= 10;//otra forma de trunc
        }
        return espejo;
        
//        este metodo otra forma
//        while (num>0) {
//          int ultdigito = num%10;  
//           invertido=(invertido*10)+ultdigito; 
//            num=num/10;
//        }
//        
//        return invertido;
    }

//     parAntes(): Este método retornará el valor par próximo anterior al valor guardado.
//    public int parAntes(){
//        
//    }
    public int ultimoDigito() {
        int num1 = num;
        return (num1 % 10);

    }

    public int primerDigito() {
        int nump = num;
        while (nump > 10) {
            nump = (int) Math.floor(nump / 10);

        }
return nump;
    }
    
    public int parAntes(){
        if(num%2==0){
            return (num-2);
        } else{
            return (num-1);
        }
        
    }
     public int parPosterior(){
        if(num%2==0){
            return (num+2);
        } else{
            return (1+num);
        }
        
    }
    
    
}
