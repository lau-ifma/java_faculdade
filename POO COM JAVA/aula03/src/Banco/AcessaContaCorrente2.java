package Banco;

public class AcessaContaCorrente2 {
    public static void main(String[] args) {
        ContaCorrente c2 = new ContaCorrente("João");

        System.out.println("nome = "+c2.nome);
        c2.depositaValor(1000);
        System.out.println("Saldo: " +c2.saldo);
        System.out.println("");

        c2.depositaValor(300);
        System.out.println("Saldo: " +c2.saldo);

    }
}
