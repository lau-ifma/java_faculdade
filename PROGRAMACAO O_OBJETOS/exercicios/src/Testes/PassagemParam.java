package Testes;

public class PassagemParam {

    public static void main(String[] args) {
        int valor = 3;
        alterar(valor);
        System.out.println("valor: " + valor);
    }

    public static int alterar(int valor){
        valor = 100;
        return valor;
    }

}


