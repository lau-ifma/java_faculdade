package exemplovetor;

import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        String nomes[] = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome: ");
            nomes[i] = sc.next();
        }

        for (int j = 0; j < nomes.length; j++){
            System.out.println(nomes[j]);
        }

    }

}


