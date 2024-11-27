package ifma.lista03;

import java.text.DecimalFormat;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
   }

    public void adicionarInicio(int element) {
        Node novoNo = new Node(element);
        novoNo.next = head;
        head = novoNo;
        if (size == 0) {       // Caso a lista esteja vazia
            tail = novoNo;
        }
        size++; 
    }

    public void adicionarFim(int element) {
        if (size == 0){
            adicionarInicio(element);
        }
        else{
            Node novoNo = new Node(element);
            novoNo.next = null;
            tail.next = novoNo;
            tail = novoNo;
            size++;   
        }
    }


    public int removerComeco() {
        if (isEmpty()) {
        throw new RuntimeException("Lista vazia");
        }
        int temp = head.element;
        head = head.next;
        size--;
        return temp;
    }


    public int removerFinal() {
        if (isEmpty()) {
        throw new RuntimeException("Lista vazia");
        }
        Node v = head;
        while (v.next != tail) {
        v = v.next;
        }
        int temp = tail.element;
        tail = v;
        tail.next = null;
        size--;
        return temp;
       }



    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        String s = "[" + head.element;
        Node node = head.next;
        while (node != null) {
            s += ", " + node.element;
            node = node.next;
        }
        return s + "]";
    }

    public int MaiorValor(){
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }

        int maior =  head.element;
        Node node = head.next;
        while (node != null) {
            if (node.element > maior) {
                maior = node.element;  
            }
            node = node.next;
        }
        return maior;
    }


    public int MenorValor(){
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }

        int menor =  head.element;
        Node node = head.next;
        while (node != null) {
            if (node.element < menor) {
                menor = node.element;  
            }
            node = node.next;
        }
        return menor;
    }

    public String Media(){
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }

        double soma =  head.element;
        Node node = head.next;
        int qtd = 1;
        while (node != null) {
            soma+= node.element;
            qtd++;
            node = node.next;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        String media = df.format(soma/qtd);
        
        return media;
    }





}
