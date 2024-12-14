package Torre;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super("Pilha Vazia!");
    }
}
