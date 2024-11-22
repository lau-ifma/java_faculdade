package cn.livraria;

public class Principal {
    public static void main(String[] args) {
        Livro livro01 = new Livro();

        Autor autor01 = new Autor();
        autor01.setNome("joaozinho Java dev");
        autor01.setEmail("joaozinhodev@gamil.com");
        autor01.setCpf("425.458.223-11");

        livro01.setNome("Java Basico");
        livro01.setDescricao("Livro básico de fundamentos em java");
        livro01.setValor(50.0);
        livro01.setIsbn("7878-857-777");
        livro01.setAutor(autor01);

        livro01.mostrarDetalhes();

    }
}
