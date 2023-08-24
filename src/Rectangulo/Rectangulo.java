package Rectangulo;

public class Rectangulo {
    //COnstantes
    public static final double DESPLAZAMIENTO=5;

    //Atributo
    private Punto p1;
    private Punto p2;

    private Punto p3;
    private Punto p4;

    //Constructores

    public Rectangulo() {
    }

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
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
        p4.desplazarPunto(0,DESPLAZAMIENTO);
      return p4;
    }

    //Lo obtengo desplazando p2

    public Punto getP4() {
        return ;
    }
    //No puedo setear p3 y p4 porque dependen de otros puntos

    //Obtener rectangulo
    public String getRectangulo(){
        return "P1: "+getP1()+", P2= "+getP2()+", "+getP3()+", P4: "+getP4();
    }

}
