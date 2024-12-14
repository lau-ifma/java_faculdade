package Testes;

// procedural
public class Circulo {
    static final double PI = 3.1419;
    static double CalcularArea(double raio){
      return PI * (raio * raio);
    }

    public static void main(String[] args) {
        double x = Circulo.CalcularArea(30);
        System.out.println(x);
    }
}
