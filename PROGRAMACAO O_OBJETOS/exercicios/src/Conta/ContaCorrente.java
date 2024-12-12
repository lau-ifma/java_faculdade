package Conta;

public class ContaCorrente {
    static int total = 0; //const
    static float rendaMedia = 0;
    static float saldoTotal = 0;
    private String nome;
    private float saldo;


    public ContaCorrente(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
        total++;
        saldoTotal+= saldo;
    }

    static float CalcularRendaMedia(){
        rendaMedia = saldoTotal / total;
        return  rendaMedia;
    };

    public static float getSaldoTotal() {
        return saldoTotal;
    }

    public static void setSaldoTotal(float saldoTotal) {
        ContaCorrente.saldoTotal = saldoTotal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String text = "nome: " + nome + " | " + "saldo: " + saldo;
        return text;
    }
}
