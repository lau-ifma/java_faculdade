package ifma.lista04;

import java.text.DecimalFormat;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        String n1 = df.format(nota1);
        String n2 = df.format(nota2);
        return "(" + nome + ", " + n1 + ", " + n2 + ")";
    }
}
