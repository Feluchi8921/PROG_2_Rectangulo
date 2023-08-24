package Rectangulo;

public class main {
    public static void main (String args[]){
        //Creo los puntos
        Punto p1 = new Punto(3,0);
        Punto p2 = new Punto(6,0);
        Punto p3 = new Punto(3,4);
        Punto p4 = new Punto(6,4);

        //Creo los objetos
        //Rectangulo
        Rectangulo rectangulo = new Rectangulo(p1,p2,p3,p4);


        //Imprimo el rectangulo
        System.out.println("El rectángulo es:"+rectangulo.getRectangulo());
    }
}
