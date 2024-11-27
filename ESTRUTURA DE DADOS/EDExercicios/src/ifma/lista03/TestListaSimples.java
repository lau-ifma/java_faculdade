package ifma.lista03;

public class TestListaSimples {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);
        lista.adicionarFim(4);
        lista.adicionarFim(5);

        System.out.println("lista inicial: " + lista);
        System.out.println("Maior valor: "+lista.MaiorValor());
        System.out.println("Menor valor: "+lista.MenorValor());
        System.out.println("Media: "+lista.Media());

        System.out.println(lista.removerComeco() + " removido no começo");
        System.out.println(lista.removerFinal() + " removido no final");
    
        System.out.println("lista final: " + lista);
        System.err.println();
       
    }
        
        

}

