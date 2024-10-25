package cn.livraria;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Livro 01", "descris", 23, "xxx");
        System.out.println(l1.nome);
        l1.mostrarDetalhes();
    }
}
