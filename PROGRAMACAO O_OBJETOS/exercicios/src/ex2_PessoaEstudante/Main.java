package ex2_PessoaEstudante;

public class Main  {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();

        e1.setNome("Joao Batista Da Silva");
        e1.setCpf("034.452.009-12");
        e1.setIdade(23);
        e1.setMatricula("013349");

        System.out.println(e1.toString());
    }
}
