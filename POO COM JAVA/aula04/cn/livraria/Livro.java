package cn.livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;

    Livro(String nome, String descricao, double valor,String isbn){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    void mostrarDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Valor: " + this.isbn);
    }
}
