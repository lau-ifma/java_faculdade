package ifma.lista04;

public class DequeList {
    int size;
    Node header, trailer;   // Nodos sentinelas

    public DequeList() {
        size = 0;
        header = new Node();
        trailer = new Node();
        trailer.previous = header;  // Faz a ref. “previous” do trailer apontar p/ header
        header.next = trailer;  // Faz a ref. “next” da header apontar p/ trailer
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(Aluno aluno) {
        Node primeiro = header.next;
        Node novoItem = new Node(aluno);
        novoItem.next = primeiro;
        novoItem.previous = header;
        header.next = novoItem;
        primeiro.previous = novoItem;
        size++;
    }

    public Node getFirst(){
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        Node primeiro = header.next;
        return primeiro;
    }

    public Node getLast(){
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        Node ultimo = trailer.previous;
        return ultimo;
    }


    public String removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        Node primeiro = getFirst();
        Node segundo = primeiro.next;
        header.next = segundo;
        segundo.previous = header;
        size--;
        return primeiro.aluno.nome;
    }

    public String removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        Node ultimo = getLast();
        Node penultimo = ultimo.previous;
        penultimo.next = trailer;
        trailer.previous = penultimo;
        size--;
        return ultimo.aluno.nome;
}


    // public void addLast(String element) {
    //     Node ultimo = trailer.previous;
    //     Node novoItem = new Node(element);
    //     novoItem.next = trailer;
    //     novoItem.previous = ultimo;
    //     ultimo.next = novoItem;
    //     trailer.previous = novoItem;
    //     size++;
    // }

    // public String removeLast() {
    //     if (isEmpty()) {
    //         throw new RuntimeException("Lista Vazia");
    //     }
    //     Node ultimo = trailer.previous;
    //     Node penultimo = ultimo.previous;
    //     penultimo.next = trailer;
    //     trailer.previous = penultimo;
    //     size--;
    //     return ultimo.element;
    // }

   
       
    

    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        Node node = header.next;
        String s = "[" + node.aluno.toString(); 
        node = node.next;
        while (node != trailer) {
            s += ", " + node.aluno.toString();
            node = node.next;
        }
        return s + "]";
       }


}
