package Banco;

class ContaCorrente {
    float saldo;
    String nome;

    public ContaCorrente (String nome){
        this.nome = nome;
        saldo = 0;

    }

    void depositaValor(float valor){
        if (valor > 0){
             saldo+=valor;
            System.out.println("Deposito no valor de " + valor + " realizado com sucesso!");
        }
    }

    void retiraValor(float valor) {
        if (valor <= saldo){
            saldo -= valor;
        }
    }

}
