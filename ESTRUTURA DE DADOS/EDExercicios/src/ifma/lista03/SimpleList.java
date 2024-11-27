package ifma.lista03;

public class SimpleList {
    Node header;
    Node trailer;
    int size;

    public SimpleList(){
        header = new Node(null,null,null);
        trailer = new Node(null, null, null);
        header.next = trailer;
        size = 0;
    }

    public void addFirst(Node no){
        Node w;
        w = header.next;
        no.next = w;
        no.prev = header;
        w.prev = no;
        header.next = no;
        size = size + 1;
    }

    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

    }

}
