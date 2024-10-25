package cn.livraria;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Java como Programar", "Primeiros passos", 59.90, "987-458-7841-12-3");
        Livro l2 = new Livro();

        l2.nome = "Python 3";
        l2.descricao = "Primeiros passos";
        l2.valor = 55.50;
        l2.isbn = "7878-784-78-125";

        System.out.println("Livros:");

        l1.mostrarDetalhes();
        System.out.println("");
        l2.mostrarDetalhes();
    }
}
