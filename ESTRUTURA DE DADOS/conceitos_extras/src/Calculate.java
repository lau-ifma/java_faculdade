// execucao terminal:
// javac Calculate.java  ,  java Calculate somar 4 6
public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if (args[0].equals("somar")){
            sum(x,y);
        }else if (args[0].equals("subtrair")){
            sub(x,y);
        }else {
            System.out.println("Nenhuma instrucao definida!");
        }
    }

    static void sum(int x, int y){
        System.out.println(x+y);

    } static void sub (int x, int y){
        System.out.println(x-y);
    }
}
