package questao02;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Gerente func1 = new Gerente();
        func1.setNome("Raimundo");
        func1.setSalario(1000.00);
        func1.setBonus(150.00);

        Gerente func2 = new Gerente();
        func2.setNome("Frank");
        func2.setSalario(3000.00);
        func2.setBonus(300.00);


        listaFuncionarios.add(func1);
        listaFuncionarios.add(func2);

        for(Funcionario func : listaFuncionarios){
            System.out.println("Nome do funcionario: " + func.getNome());
            System.out.println("Salario: " + func.calcularSalario());
            System.out.println("-----------------------");
        }

    }
}
