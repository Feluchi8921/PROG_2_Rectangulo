package Rectangulo;

public class Punto {
    //Atributos
    private double x;
    private double y;

    //Constantes
    public static final double DESPLAZAMIENTO=5;
    //Constructores

    public Punto(double x, double y) {
        this.x = 0;
        this.y = 0;
    }

    //Metodos
    //Getter y Setter

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Metodo desplazar
    public double desplazarPuntoEjeY(double x, double y){
       return this.y+=DESPLAZAMIENTO;
    }
}
