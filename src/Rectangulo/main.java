package Rectangulo;

public class main {
    public static void main (String args[]){
        //Creo los puntos y le paso los valores por parametro
        Punto p1 = new Punto(3,0);
        Punto p2 = new Punto(6,0);

        //Creo el Rectangulo
        Rectangulo rectangulo = new Rectangulo(p1,p2,5);

        //Imprimo el rectangulo
        System.out.println("El rectángulo esta formado por los puntos:\nP1: ("+rectangulo.getP1().getX() +","+rectangulo.getP1().getY()+")"+
                            " P2: ("+rectangulo.getP2().getX() +","+rectangulo.getP2().getY()+")"+
                            " P3: ("+rectangulo.getP3().getX() +","+rectangulo.getP3().getY()+")"+
                            " P4: ("+rectangulo.getP4().getX() +","+rectangulo.getP4().getY()+")");

    }

}
