package Pilha;

public class Node {
    String element;
    Node next;

    public Node(String element){
        this.element = element;
    }

    @Override
    public String toString() {
        return "(" + element + ")";
    }
}
