package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos listaDeAlunos = new CadastrarAlunos(5);

        Aluno aluno1 = new Aluno(6, "011", "Maria");
        listaDeAlunos.adicionarNoFinal(aluno1);

        Aluno aluno2 = new Aluno(1, "010", "Carol");
        listaDeAlunos.adicionarNoFinal(aluno2);

        Aluno aluno3 = new Aluno(4, "012", "Joao");
        listaDeAlunos.adicionarNoInicio(aluno3);

        Aluno aluno4 = new Aluno(2, "014", "Carlos");
        listaDeAlunos.adicionarNoInicio(aluno4);


        System.out.println("lista de alunos: ");
        listaDeAlunos.mostrarAlunos();

        System.out.println("lista de alunos ordenada: ");
        listaDeAlunos.ordenaVetor();
        listaDeAlunos.mostrarAlunos();

        System.out.println("\nRemovendo aluno com indice:"+ 2);
        String alunoRemovido = listaDeAlunos.removerComIndice(2);
        System.out.println("Aluno " + alunoRemovido + " foi removido!");


        System.out.println("\nRemovendo aluno do final:");
        listaDeAlunos.removerNoFinal();


        System.out.println("Removendo aluno do inicio:");
        listaDeAlunos.removerNoInicio();

        System.out.println("--------------------------");
        System.out.println("\nLista de alunos atualizada:");
        listaDeAlunos.mostrarAlunos();

    }
}
