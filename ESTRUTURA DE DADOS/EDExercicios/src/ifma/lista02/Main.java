package ifma.lista02;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = {  
                            // d. secundaria = i+j == 2 
                {1, 2, 3},  // [0,2] 
                {4, 5, 6},  // [1,1]
                {7, 8, 9},  // [2,0]
        };

        // q01(matriz);
        // q02(matriz);
        // q03(matriz);
        // q04(matriz);
        // q05(matriz);
        // q06(matriz);
        // q07(matriz);
        // q08(matriz);
        // q09(matriz);
        // q10(matriz);
        // q11(matriz);
        // q12(matriz);
        // q13(matriz);
        q14(matriz);

    }

    static void q01(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            // matriz[i][i] = 0;
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){ matriz[i][j] = 0;}
                System.out.print(matriz[i][j]+ " ");
            }
        }
    }

    static void q02(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1){
                    matriz[i][j] = 0; 
                }
                System.out.print(matriz[i][j]+ " ");
            }
        }
    }

    static void q03(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    static void q04(int[][] matriz){
        int somaDS = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1){
                    somaDS+=matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal S: "  + somaDS);
    }

    static void q05(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    static void q06(int[][] matriz){
        int qtdElementos = 0; 
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1){
                    qtdElementos++;
                    soma+= matriz[i][j];
                }
            }
        }
        System.out.printf("Media: %.2f" , soma/qtdElementos);
    }

    static void q07(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    static void q08(int[][] matriz){
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1){
                    if (matriz[i][j] > maior){
                        maior = matriz[i][j];
                    }
                }
            }
        }
        System.out.printf("Maior: %d", maior);
    }

    static void q09(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.err.println();

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1){
                    System.out.print(matriz[i][j]+ " ");
                }
            }
        }
    }

    static void q10(int[][] matriz){
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1){
                    if (matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                }
            }
        }
        System.out.printf("Menor: %d", menor);
    }

    static void q11(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
    
    static void q12 (int[][] matriz){
        int mult = 1;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1){
                    mult *= matriz[i][j];
                }
            }
        }
        System.out.printf("Produto: %d", mult);
    }

    static void q13 (int[][] matriz){
        int B[][] = {{0,0,0}, {0,0,0}, {0,0,0}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2 == 0){
                    B[i][j] = matriz[i][j] * matriz[i][j];
                }else{
                    B[i][j] = (int) Math.pow(matriz[i][j], 3);
                }
            }
        }

        for (int x = 0; x < B.length; x++){
            System.out.println();
            for (int y = 0; y < B[x].length; y++){
                System.out.print(B[x][y] + " ");
            }
        } 
    }

    static void q14 (int[][] matriz){
        // int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};  -- [2][0]. [1][1]
        for (int j = 0; j < 3; j++) { // lendo colunas  
            System.out.println();
            for (int i = matriz.length - 1; i >= 0; i--) { // lendo linhas
                System.out.print(matriz[i][j]+ " ");
            }
        }
    } 





}
    
