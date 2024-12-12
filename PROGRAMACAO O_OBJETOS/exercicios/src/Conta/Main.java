package Conta;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Contas ------");

        ContaCorrente conta1 = new ContaCorrente("lauanderson", 1500.00f);
        System.out.println( ContaCorrente.total + " - " + conta1);

        ContaCorrente conta2 = new ContaCorrente("Maria", 3500.00f);
        System.out.println( ContaCorrente.total + " - " + conta2);

        ContaCorrente conta3 = new ContaCorrente("Carlos", 14100.00f);
        System.out.println( ContaCorrente.total + " - " + conta3);

        System.out.println("\nSaldo total: " + ContaCorrente.saldoTotal);
        System.out.println("Total de contas: " + ContaCorrente.total);
        System.out.println("media: " + ContaCorrente.rendaMedia);

    }
}
