package Rectangulo;

public class Punto {
    //Atributos
    private double x;
    private double y;

    //Constructores

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //Metodos
    //Getter y Setter

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Metodo desplazar
    public void desplazarPuntoEjeY(double desplazamiento){
         this.y+=desplazamiento;
    }
}
