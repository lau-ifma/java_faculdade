package PilhaEstatica;

public class TesteVectorStack {
    public static void main(String[] args) {
        VectorStack vector = new VectorStack(3);

        vector.push("Joao");
        vector.push("Maria");
        vector.push("Bruno");
        System.out.println(vector.top());
        System.out.println(vector);
    }
}
