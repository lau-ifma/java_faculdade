package PilhaEstatica;

public interface IStack {
    int size();

    boolean isEmpty();

    String top();

    String pop();

    void push(String element);

}
