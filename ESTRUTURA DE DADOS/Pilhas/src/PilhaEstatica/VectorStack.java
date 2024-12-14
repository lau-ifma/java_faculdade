package PilhaEstatica;

import java.util.Arrays;

// fazer torre de hanoy -- exercicio proxima aula

public class VectorStack implements  IStack{
    int capacidade;
    String S[];
    int size = 0;

    public VectorStack(int capacidade){
        this.capacidade = capacidade;
        S = new String[capacidade];
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return S[size-1] == null;
    }

    @Override
    public String top() {
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia!");
        }
        return S[size-1];
    }

    @Override
    public String pop() {
        return "";
    }

    @Override
    public void push(String element) {
        if (size == capacidade){
            throw new RuntimeException("Vetor lotado!");
        }
        String no = new String(element);
        S[size] = no;
        size++;
    }


//    @Override
//    public String toString() {
//        String s = "[";
//        if (size > 0){
//            for(int i = 0; i < size();i++ ){
//                if (S[i] == top())
//                    s+= S[i] + ", ";
//                else
//                    s+= S[i];
//            }
//        }
//
//        return s + "]";
//    }


    @Override
    public String toString() {
        return "VectorStack{" +
                "capacidade=" + capacidade +
                ", S=" + Arrays.toString(S) +
                ", size=" + size +
                '}';
    }
}



