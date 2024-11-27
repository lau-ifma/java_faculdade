package SimplesmenteEncadeada;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
   }

    public void adicionarInicio(String element) {
        Node novoNo = new Node(element);
        novoNo.next = head;
        head = novoNo;
        if (size == 0) {       // Caso a lista esteja vazia
            tail = novoNo;
        }
        size++;  
    }

    public void adicionarFim(String element) {
        Node novoNo = new Node(element);
        novoNo.next = null;
        tail.next = novoNo;
        tail = novoNo;
        size++;   
    }


    public String removerComeco() {
        if (isEmpty()) {
        throw new RuntimeException("Lista vazia");
        }
        String temp = head.element;
        head = head.next;
        size--;
        System.out.println(temp+" removido!");
        return temp;
    }


    public String removerFinal() {
        if (isEmpty()) {
        throw new RuntimeException("Lista vazia");
        }
        Node v = head;
        while (v.next != tail) {
        v = v.next;
        }
        String temp = tail.element;
        tail = v;
        tail.next = null;
        size--;
        System.out.println(temp +" removido!");
        return temp;
       }



    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        String s = "[" + head.element;
        Node node = head.next;
        while (node != null) {
            s += ", " + node.element;
            node = node.next;
        }
        return s + "]";}

}
