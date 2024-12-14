package PilhaEstatica;

public class FullStackException extends RuntimeException {

    private FullStackException(){
        super("Pilha cheia!");
    }
}
