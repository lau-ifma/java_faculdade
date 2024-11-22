package DuplamenteEncadeada;

// criacao da lista //

public class DLinkedList {
    DNode header;
    DNode trailer;
    int size;

    public  DLinkedList(){
        header = new DNode(null,null,null);
        trailer = new DNode(null, null, null);
        header.next = trailer;
        size = 0;
    }

    public void addFirst(DNode no){
        DNode w;
        w = header.next;
        no.next = w;
        no.prev = header;
        w.prev = no;
        header.next = no;
        size = size + 1;
    }

    public static void main(String[] args) {
        DLinkedList lista = new DLinkedList();

    }
}

