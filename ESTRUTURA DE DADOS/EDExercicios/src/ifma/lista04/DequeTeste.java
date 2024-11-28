package ifma.lista04;

public class DequeTeste {
    public static void main(String[] args) {
        DequeList lista = new DequeList();

        Aluno a1 = new Aluno("Douglas", 8.0, 7.5);
        Aluno a2 = new Aluno("Laura", 7.0, 9.5);
        Aluno a3 = new Aluno("Sofia", 4.0, 7.5);

        lista.addFirst(a1);
        lista.addFirst(a2);
        lista.addFirst(a3);

        System.out.println(lista);
        
        System.out.println("Primeiro: " + lista.getFirst().aluno.toString());
        System.out.println("Ultimo: " + lista.getLast().aluno.toString());

        System.out.println("\nAluno " + lista.removeFirst() + " removido do inicio");
        System.out.println(lista);

        System.out.println("\nAluno " + lista.removeLast() + " removido do final");
        System.out.println(lista);
        // lista.removeLast();


    }       

}
