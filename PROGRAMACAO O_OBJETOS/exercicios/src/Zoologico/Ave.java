package Zoologico;

public class Ave extends Animal{
    private String tipoPenas;

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu...");
    }

    public String getTipoPenas() {
        return tipoPenas;
    }

    public void setTipoPenas(String tipoPenas) {
        this.tipoPenas = tipoPenas;
    }
}
