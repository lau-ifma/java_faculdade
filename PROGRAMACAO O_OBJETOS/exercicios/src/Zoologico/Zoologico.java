package Zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    List<Animal> animais = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();
    static int totalAnimais = 0;

    public void adicioarAnimal(Animal novoAnimal){
        animais.add(novoAnimal);
        totalAnimais+=1;
    }

    public void adicionarFuncionario(Funcionario novoFuncionario){
        funcionarios.add(novoFuncionario);
    }

    public void cuidarAnimais(){
    }

    public void alterarNomeAnimal (Animal animal, String novoNome){
        String temp = animal.getNome();
        animal.setNome(novoNome);
        System.out.println("O nome do animal " + temp + " foi alterado para " + novoNome );

    }


}
