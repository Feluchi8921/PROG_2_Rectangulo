package Rectangulo;

public class main {
    public static void main (String args[]){
        //Creo los puntos
        Punto p1 = new Punto(3,0);
        Punto p2 = new Punto(6,0);

        //Creo el Rectangulo
        Rectangulo rectangulo = new Rectangulo(p1,p2);

        //Imprimo el rectangulo
        System.out.println("El rectángulo es:"+rectangulo.getRectangulo());
    }
}
