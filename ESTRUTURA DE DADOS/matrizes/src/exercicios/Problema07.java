package exercicios;

public class Problema07 {
    public static void main(String[] args) {
        int m[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - i; j++) {

                System.out.print(m[j][i]);
            }
            System.out.println();
        }

    }
}
