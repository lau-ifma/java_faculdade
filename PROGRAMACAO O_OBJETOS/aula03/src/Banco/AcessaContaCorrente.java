package Banco;

public class AcessaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("lau");

        System.out.println("ANTES");
        System.out.println("nome = "+c1.nome);
        c1.depositaValor(1000);


        System.out.println("\nDEPOIS");
        c1.nome = "Raimundo";
        System.out.println("nome = "+c1.nome);

    }
}
