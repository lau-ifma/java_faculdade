package Pilha;

public class TesteIStack {
    public static void main(String[] args) {
        NodeStack pilha = new NodeStack();

        pilha.push("Joao");
        pilha.push("Maria");
        pilha.push("Carlos");

        System.out.println(pilha); // falta formatar o toString
    }
}
