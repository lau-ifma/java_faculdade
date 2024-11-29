package sistemaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> listaFunc = new ArrayList<>();

        FuncionarioComissionado func1 = new FuncionarioComissionado();
        func1.setNome("Raimundo");
        func1.setCpf("365.274.871-11");
        func1.setComissao(50.00);
        func1.setSalarioBase(1412.00);

        FuncionarioComum func2 = new FuncionarioComum();
        func2.setNome("Francisco");
        func2.setCpf("264.891.008-12");
        func2.setSalarioMensal(1800.00);

        FuncionarioHorista func3 = new FuncionarioHorista();
        func3.setNome("Douglas");
        func3.setCpf("009.476.228-11");
        func3.setHorasTrabalhadas(10);
        func3.setValorHoro(70.00);


        listaFunc.add(func1);
        listaFunc.add(func2);
        listaFunc.add(func3);

        for(Funcionario func : listaFunc){
            System.out.println("Nome do funcionario: " + func.getNome());
            System.out.println("Salario: " + func.calcularSalario());
            System.out.println("-----------------------");
        }

    }
}
