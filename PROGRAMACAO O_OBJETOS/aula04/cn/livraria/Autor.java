package cn.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    Autor(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void mostrarDetalhes(){
        System.out.println("Nome do autor: " + this.nome);
        System.out.println("Email do autor: " + this.email);
        System.out.println("CPF do autor: " + this.cpf);
    }
}
