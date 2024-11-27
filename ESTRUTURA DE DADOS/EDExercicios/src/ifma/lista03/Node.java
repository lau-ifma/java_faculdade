package ifma.lista03;

public class Node {
    String element;
    Node next, prev;

    public Node(String e, Node n, Node p){
        element = e;
        next = n;
        prev = p;
    }
}
