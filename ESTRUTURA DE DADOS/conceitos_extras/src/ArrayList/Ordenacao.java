package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("nome 4");
        names.add("nome 2");
        names.add("nome 1");
        names.add("nome 3");

        //ordenando elementos
        Collections.sort(names);
        for (String nome : names){
            System.out.println(nome);
        }

    }
}
