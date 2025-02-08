package questao03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Palio");
        carro.setQtdPortas(4);
        carro.setPotenciaMotor(1.0);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CBR 600");
        moto.setCilindradas(600);

        listaVeiculos.add(carro);
        listaVeiculos.add(moto);

        for (Veiculo veiculo : listaVeiculos) {
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            if (veiculo instanceof Carro) {
                System.out.println("Qtd de portas: " + ((Carro) veiculo).getQtdPortas());
                System.out.println("Potencia do motor: " + ((Carro) veiculo).getPotenciaMotor());
            } else if (veiculo instanceof Moto) {
                System.out.println("Cilindradas: " + ((Moto) veiculo).getCilindradas());
            }
            veiculo.ligar();
            System.out.println("------------------");
        }
    }
}
