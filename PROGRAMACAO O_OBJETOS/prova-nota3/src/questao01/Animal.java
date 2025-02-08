package questao01;

public abstract class Animal {
    private String nome;

    public Animal(){}

    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}



