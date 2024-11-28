package SimplesmenteEncadeada;

public class TestListaSimples {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        lista.adicionarInicio("Jeovane");
        lista.adicionarInicio("Mario");

        lista.adicionarFim("Pedro");
        lista.adicionarFim("Eduardo");

        System.out.println("lista inicial: " + lista);
        System.err.println();

        lista.removerComeco();
        System.out.println("lista apos remocao no comeco: " + lista);
        System.err.println();

        lista.removerFinal();
        System.out.println("lista apos remocao no final: " + lista);
        System.out.println();
       
    }
        
        

}
