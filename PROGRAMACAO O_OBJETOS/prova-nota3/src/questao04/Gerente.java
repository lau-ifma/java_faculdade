package questao04;

public class Gerente extends Empregado {
    private double salarioBase;
    private double bonus;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.bonus ;
    }
}
