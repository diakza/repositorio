/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.extra.pkg2;

/**
 *
 * @author diakz
 */
public class Dado {

  private  int num;

    public Dado(int num) {
        this.num = num;
    }

    public Dado() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void gralNro() {

        num = (int) (Math.random() * 7);
        if (num > 0) {
            System.out.println("num " + num);
        } else {
            num = 1;
            System.out.println("num " + num);
        }

    }

    public int vernro() {
return num;
    }

    @Override
    public String toString() {
        return "Dado{" + "num=" + num + '}';
    }
}
