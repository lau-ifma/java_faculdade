package questao03;

public abstract class Veiculo {
    private boolean ligado = false;
    private String marca;
    private String modelo;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar(){
        if (!ligado){
            ligado = true;
            System.out.println("Veiculo " + this.getModelo() + " foi ligado!");
        }else {
            System.out.println("Veiculo " + this.getModelo() + " ja esta ligado");
        }
    };

    public void desligar(){
        if (ligado){
            ligado = false;
            System.out.println("Veiculo " + this.getModelo() + " foi desligado");
        }else {
            System.out.println("Veiculo " + this.getModelo() + " ja esta desligado");
        }

    };
}
