package ifma.lista02;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        q01(matriz);
    }

    static void q01(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j){
                    System.out.println(matriz[i][j]);
                }
            }
        }

    }

}
