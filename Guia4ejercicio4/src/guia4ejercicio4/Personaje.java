package guia4ejercicio4;

public abstract class Personaje {

    protected Position ubicacion;

    protected String nick;

    protected int vida;

    protected int energia;

    protected char orientacion;

    public Personaje() {
    }

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
        this.vida = 3;
        this.energia = 100;
        this.orientacion = 'n';
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void Disparar() {
        int disparo = 0;
        while (energia > 0&&!(disparo==8)) {
            disparo++;
            System.out.println("ha disparado ");
            energia -= 10;
            System.out.println("la energia actual es " + energia);
        }

    }

    public void Girar() {
        int cont = 0;

        while (!(cont == 2)) {
            if (orientacion == 'n') {
                cont++;
                orientacion = 'e';
                System.out.println("girando hacia " + orientacion);

            }
            if (orientacion == 'e') {
                cont++;
                orientacion = 's';
                System.out.println("girando hacia " + orientacion);

            }
            if (orientacion == 's') {
                cont++;
                orientacion = 'o';
                System.out.println("girando hacia " + orientacion);
                break;
            }
            if (orientacion == 'o') {
                cont++;

                orientacion = 'n';
                System.out.println("girando hacia " + orientacion);

            }

            System.out.println("ha girado una vuelta");
        }

    }

    public void Avanzar(int pasos) {

        switch (orientacion) {
//            
            case 'n':
                ubicacion.setY(ubicacion.getY() + pasos);
                break;
            case 'e':
                ubicacion.setX(ubicacion.getX() + pasos);
                break;
            case 'o':
                ubicacion.setX(ubicacion.getX() - pasos);
                break;
            case 's':
                ubicacion.setY(ubicacion.getY() - pasos);
                break;
        }
        if (orientacion == 'n') {

            System.out.println("cantidad de pasos dados " + pasos + "ubicacion actual y= " + ubicacion.getY());
        }
        if (orientacion == 's') {
            System.out.println("cantidad de pasos dados " + pasos + "ubicacion actual  y= " + ubicacion.getY());
        }
        if (orientacion == 'e') {
            System.out.println("cantidad de pasos dados " + pasos + "ubicacion actual x= " + ubicacion.getX());
        }
        if (orientacion == 'o') {
            System.out.println("cantidad de pasos dados " + pasos + "ubicacion actual x= " + ubicacion.getX());

        }

    }

}
