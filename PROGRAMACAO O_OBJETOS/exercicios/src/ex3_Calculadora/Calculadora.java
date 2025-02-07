package ex3_Calculadora;

public class Calculadora {
    
    // Métodos sobrecarregado
    public int somar(int a, int b) {
        return a + b;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }
    
    public double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Testando com int
        System.out.println("Soma int: " + calc.somar(5, 3));
        System.out.println("Subtração int: " + calc.subtrair(5, 3));
        System.out.println("Multiplicação int: " + calc.multiplicar(5, 3));
        System.out.println("Divisão int: " + calc.dividir(6, 3));
        System.out.println("");
        // Testando com double
        System.out.println("Soma double: " + calc.somar(5.5, 3.2));
        System.out.println("Subtração double: " + calc.subtrair(5.5, 3.2));
        System.out.println("Multiplicação double: " + calc.multiplicar(5.5, 3.2));
        System.out.println("Divisão double: " + calc.dividir(6.4, 3.2));
    }
}
