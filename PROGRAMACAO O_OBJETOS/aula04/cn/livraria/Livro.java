package cn.livraria;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Livro(){}

    void mostrarDetalhes(){
        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        autor.mostrarDetalhes();
        System.out.println("------------");
    }
}
