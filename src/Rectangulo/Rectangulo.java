package Rectangulo;

public class Rectangulo {
    //COnstantes
    public static final double DESPLAZAMIENTO=5;

    //Atributo
    private Punto p1;
    private Punto p2;

    //Constructores

    public Rectangulo() {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Rectangulo(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
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
    //Lo obtengo desplazando p1
    public Punto getP3() {
        Punto p3 = new Punto(0, p1.desplazarPuntoEjeY(0, 5));
        return p3;
    }


    //Lo obtengo desplazando p2
    public Punto getP4() {
        Punto p4 = new Punto(0, p2.desplazarPuntoEjeY(0, 5));
        return p4;
    }

    //No puedo setear p3 y p4 porque dependen de otros puntos

    //Obtener rectangulo
    public String getRectangulo(){
        return "P1: "+getP1()+", P2= "+getP2()+", "+getP3()+", P4: "+getP4();
    }

}
