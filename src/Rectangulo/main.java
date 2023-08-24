package Rectangulo;

public class main {
    public static void main (String args[]){

        //Creo los objetos
        //Rectangulo
        Rectangulo rectangulo = new Rectangulo();
        //Creo los puntos
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        //Seteo los puntos
        p1.setPunto(0,2);
        p2.setPunto(0,6);

        //Imprimo el rectangulo
        System.out.println("El rectángulo es:"+rectangulo.getRectangulo());
    }
}
