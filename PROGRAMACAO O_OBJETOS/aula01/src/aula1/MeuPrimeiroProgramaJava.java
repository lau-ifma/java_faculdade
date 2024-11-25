package aula1;

public class MeuPrimeiroProgramaJava {

    public static void main(String[] args) {
       Cachorro pet = new Cachorro();
       pet.dono = "Raimundo!";
       pet.idade = 2;
       pet.nome = "Spike";
       pet.raca = "Hotweiller";

       System.out.println("Nome do pet: " + pet.nome);
       pet.latir();
       pet.morder();
    }
}
