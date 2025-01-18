package Zoologico;

public class Reptil extends  Animal{
    private float temperaturaCorporal;


    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    @Override
    public void emitirSom() {
        System.out.println("Ssssssss");
    }
}
