/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploexeption;

/**
 *
 * @author diakz
 */
class NewException extends Exception {

    public NewException() {
    }

    /**
     * Constructs an instance of <code>NewException1</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NewException(String msg) {
        System.out.println(msg);
    }
}
