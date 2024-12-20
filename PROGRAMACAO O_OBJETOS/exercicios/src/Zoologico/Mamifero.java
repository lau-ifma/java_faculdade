package Zoologico;

public class Mamifero extends Animal {
    private int tempoGestacao;

    @Override
    public void emitirSom() {

    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
