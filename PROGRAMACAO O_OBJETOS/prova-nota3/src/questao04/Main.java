package questao04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void exibirDados(Empregado empregado) {
        System.out.println("Nome do funcionario: " + empregado.getNome());
        if (empregado instanceof Gerente) {
            System.out.println("Tipo de empregado: Gerente");
            System.out.println("Bonus: " + ((Gerente) empregado).getBonus());
            System.out.println("Salario base: " + ((Gerente) empregado).getSalarioBase());
        } else if (empregado instanceof Horista) {
            System.out.println("Tipo de empregado: Horista");
            System.out.println("Horas trabalhadas: " + ((Horista) empregado).getHorasTrabalhadas());
            System.out.println("Valor hora: " + ((Horista) empregado).getValorHoro());
        }
        System.out.println("Salario Final: " + empregado.calcularSalario());
        System.out.println("-----------------------");
    }

    public static void adicionarEmpregado(List<Empregado> listaEmpregados, Empregado empregado) {
        listaEmpregados.add(empregado);
    };


    public static void main(String[] args) {
        List<Empregado> listaEmpregados = new ArrayList<>();

        Gerente func1 = new Gerente();
        func1.setNome("Raimundo");
        func1.setCpf("365.274.871-11");
        func1.setBonus(200.00);
        func1.setSalarioBase(1412.00);

        Horista func3 = new Horista();
        func3.setNome("Douglas");
        func3.setCpf("009.476.228-11");
        func3.setHorasTrabalhadas(30);
        func3.setValorHoro(70.00);

        adicionarEmpregado(listaEmpregados, func1);
        adicionarEmpregado(listaEmpregados, func3);

        for(Empregado func : listaEmpregados){
            exibirDados(func);

        }



    }
}
