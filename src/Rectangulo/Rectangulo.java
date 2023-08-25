package Rectangulo;

public class Rectangulo {

    //Atributos
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Punto p4;
    private double desplazamiento;


    //Constructores


    public Rectangulo(Punto p1, Punto p2, double desplazamiento) {
        this.p1 = p1;
        this.p2 = p2;
        this.desplazamiento=desplazamiento;
        //Creo los puntos que me faltan, iguales a p1 y p2
        this.p3 = new Punto(p1.getX(), p1.getY());
        this.p4 = new Punto(p2.getX(), p2.getY());
        //Desplazo los puntos p1 y p2 para obtener p3 y p4
        p3.desplazarPuntoEjeY(desplazamiento);
        p4.desplazarPuntoEjeY(desplazamiento);
    }


    //Metodos
    //Getter y Setter

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP3() {
        return this.p3;
    }

    public Punto getP4() {
        return this.p4;
    }

    //No puedo setear p3 y p4 porque dependen de otros puntos

    //Obtener rectangulo
    public Rectangulo getRectangulo(){
       return this;
    }

}
