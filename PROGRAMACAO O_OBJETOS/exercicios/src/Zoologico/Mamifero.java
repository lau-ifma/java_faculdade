package Zoologico;

public class Mamifero extends Animal {
    private int tempoGestacao;

    @Override
    public void emitirSom() {
        System.out.println("Au Au");

    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
