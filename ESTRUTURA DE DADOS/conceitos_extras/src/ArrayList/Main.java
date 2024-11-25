package ArrayList;
import java.util.ArrayList;
import  java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("nome 1");
        names.add("nome 2");
        names.add("nome 3");
        names.add("nome 4");

        //buscar elemento pelo indice -- get()
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        //retorna o tamanho
        System.out.println("size: " + names.size());

        //busca o indice a partir do elemento
        int index = names.indexOf("nome 2");
        System.out.println("index of 'nome 2' : " + index);

        // verificar de ta vazio
        System.out.println("List is Empty: " + names.isEmpty());

        // verificar se a lista contem um elemento x
        System.out.println("contains 'nome 4' : "+ names.contains("nome 4"));

        // limpar a lista (remover todos os elementos)
        names.clear();
        System.out.println("list is Empty: " + names.isEmpty());
    }

}
