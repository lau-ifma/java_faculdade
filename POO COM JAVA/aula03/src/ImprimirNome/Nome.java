package ImprimirNome;

public class Nome {
    public void mostrar (String nome){
        System.out.println(nome);
    }

    public static void main(String[] args) {
        Nome nome1 = new Nome();
        nome1.mostrar("LAUuu");
    }
}
