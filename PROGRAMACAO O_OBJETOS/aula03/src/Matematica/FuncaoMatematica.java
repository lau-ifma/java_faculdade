package Matematica;

public class FuncaoMatematica {

    public int Funcao1 (int x){
        int fx = x * (x * x) + 2 * x + 7;
        return fx;
    }

    public static void main(String[] args) {
        FuncaoMatematica f1 = new FuncaoMatematica();
        int res = f1.Funcao1(3);
        System.out.println(res);

    }

}

