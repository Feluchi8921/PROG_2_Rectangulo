package Rectangulo;

public class Punto {
    //Atributos
    private double x;
    private double y;

    //Constantes
    public static final double DESPLAZAMIENTO=5;

    //Contructores
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    //Metodos
    //Get
    public void getPunto(){
        System.out.println("El punto geometrico es: ("+this.x+"; "+this.y+")");
    }
    public double getX(){
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    //Set
    public void setPunto(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setDesplazamiento(double y){
        this.y=y;
    }

    //Desplazar
    public void desplazarPunto(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

}
