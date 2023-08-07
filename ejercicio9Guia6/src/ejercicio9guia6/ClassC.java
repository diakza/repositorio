/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9guia6;

/**
 *
 * @author diakz
 */
public class ClassC {
    
//    Dado el método metodoC de la clase C, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
    
//   public void metodoC() throws TuException{
//sentencia_c1
//try {
//sentencia_c2
//sentencia_c3
//} catch (MioException e){
//sentencia_c4
//} catch (TuException e){
//sentencia_c5
//throw (e)
//}
//
//
//
//finally
//sentencia_c6

// si se ejecuta el error mio seria  se ejecutaria la s1
    //entraria en el try  se ejecuta la s2 si es esta donde se produce el error 
    // saltaria directo al catch de mio Exception ejecuta la sentencia 4
    // y por ultimo se ejecuta el finally
    
    
    // si no hubiera ningun error se ejecuta todo normal desde la S1 hata la S3
    //luego saltaria al finally y termina ejecutanto el S6
    
    
    
    // si se produce el error tu exception Ejecutaria la s1 entraria al try donde ejecuta el S2 si esta tiene el error
    // saltaria al catch de tu Exception si el error lo tuviera en la S3 no la terminaria de ejecutar y saltaria a ese catch
    // luego en el catch ejecuta S5 y lanza el mensaje de error
    // por ultimo se ejecuta el bloqque finally ejecutando l S6.
    
}
