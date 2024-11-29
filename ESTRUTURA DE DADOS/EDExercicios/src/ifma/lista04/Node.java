package ifma.lista04;

public class Node {
    Aluno aluno;
    Node next, previous;   // Ponteiros para os seguintes e anteriores
   
    public Node() {
    }

    public Node(Aluno aluno) {
        this.aluno = aluno;
    }

}


