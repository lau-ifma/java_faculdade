package Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico Zoo = new Zoologico();

        Ave a1 = new Ave();
        a1.setId(1);
        a1.setNome("Falcão");
        a1.setEspecie("Gaviao");
        a1.setTipoPenas("Penas marrom com branco");

        Mamifero m1 = new Mamifero();
        m1.setId(2);
        m1.setNome("Bob");
        m1.setEspecie("Cachorro");
        m1.setTempoGestacao(2);

        Reptil r1 = new Reptil();
        r1.setId(3);
        r1.setNome("Cebola");
        r1.setEspecie("Lagarto");
        r1.setTemperaturaCorporal(25);

        Funcionario f1 = new Funcionario();
        f1.setId(1);
        f1.setNome("Fernando");
        f1.setEspecialidade("Cuidador de mamíferos");

        Funcionario f2 = new Funcionario();
        f2.setId(1);
        f2.setNome("Carlos");
        f2.setEspecialidade("Cuidador de repteis");

        Funcionario f3 = new Funcionario();
        f3.setId(1);
        f3.setNome("Maria");
        f3.setEspecialidade("Cuidador de aves");

        Zoo.animais.add(a1);
        Zoo.animais.add(m1);
        Zoo.animais.add(r1);

        Zoo.funcionarios.add(f1);
        Zoo.funcionarios.add(f2);
        Zoo.funcionarios.add(f3);

;    }
}
