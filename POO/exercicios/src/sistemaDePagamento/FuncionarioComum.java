package sistemaDePagamento;

public class FuncionarioComum extends Funcionario {
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensal;
    }
}
