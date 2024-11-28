// package DuplamenteEncadeada2;

public class DequeTeste {
    public static void main(String[] args) {
        DequeList lista = new DequeList();
        // lista.addFirst("Jeovane");
        // lista.addFirst("Mario");
        // lista.addFirst("Pedro");

        lista.addLast("Jeovane");
        lista.addLast("Mario");
        lista.addLast("Pedro");

        // lista.removeLast();
        lista.removeFirst();
        System.out.println(lista);
    }       

}
