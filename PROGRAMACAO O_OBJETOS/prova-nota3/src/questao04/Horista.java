package questao04;

public class Horista extends Empregado {
    private int horasTrabalhadas;
    private double valorHora;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoro() {
        return valorHora;
    }

    public void setValorHoro(double valorHoro) {
        this.valorHora = valorHoro;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
}
