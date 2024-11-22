package sistemaDePagamento;

public class FuncionarioComissionado extends Funcionario {
    private double salarioBase;
    private double comissao;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.comissao;
    }
}
