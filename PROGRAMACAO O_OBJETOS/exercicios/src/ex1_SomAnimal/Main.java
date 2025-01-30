package ex1_SomAnimal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();

        Cachorro c1 = new Cachorro();
        c1.setNome("Ralf");

        Cachorro c2 = new Cachorro();
        c2.setNome("Scooby");

        Gato g1 = new Gato();
        g1.setNome("Xanin");

        Gato g2 = new Gato();
        g2.setNome("Tiger");

        listaAnimais.add(c1);
        listaAnimais.add(c2);
        listaAnimais.add(g1);
        listaAnimais.add(g2);

        for (Animal animal : listaAnimais){
            animal.fazerSom();
        }

    }
}
