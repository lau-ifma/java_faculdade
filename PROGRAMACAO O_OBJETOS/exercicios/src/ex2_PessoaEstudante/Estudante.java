package ex2_PessoaEstudante;

public class Estudante extends Pessoa{
    private String matricula;

    @Override
    public String toString() {
        return "Estudante{\n" +
                "\tmatricula: '" + getMatricula() + '\n' +
                "\tnome: '" + getNome() + '\n' +
                "\tidade: '" + getIdade() + '\n' +
                "\tcpf: '" + getCpf() + '\n' +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
