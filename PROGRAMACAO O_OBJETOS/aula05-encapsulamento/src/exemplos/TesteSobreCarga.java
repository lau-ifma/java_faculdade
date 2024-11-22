package exemplos;

import java.util.Arrays;

public class TesteSobreCarga {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro("Livro de C");
        Livro livro3 = new Livro("Livro de java", 49.90);

        Livro[] listaLivro = new Livro[5];
        System.out.println(livro3.toString());

       ;

    }
}
