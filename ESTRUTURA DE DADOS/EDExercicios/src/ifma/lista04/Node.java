package ifma.lista04;

public class Node {
    Aluno aluno;
    String element;   // Valor armazenado pelo Nodo
    Node next, previous;   // Ponteiros para os nodos seguintes e anteriores
   
    public Node() {
    }

    // public Node(String element) {
    //     this.element = element;
    // }
    
    public Node(Aluno aluno) {
        this.aluno = aluno;
    }

    // public Node(String element, Aluno aluno) {
    //     this.element = element;
    //     this.aluno = aluno;
    // }

}


