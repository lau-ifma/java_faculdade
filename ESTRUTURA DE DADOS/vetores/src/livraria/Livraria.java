package livraria;

public class Livraria {
   int size;
   int capacidade = 100;
   Livro livros[];

   Livraria(int tam){
       livros = new Livro[tam];
   }

    public int size(){
        return  size;
    }

   public boolean isEmpty(){
       return size == 0;
   }

   public void adicionar(Livro livro) throws RuntimeException{
       if (size == livros.length){
          throw new RuntimeException("nao da mais!!");
       }
       livros[size] = livro;
       size++;
   }

   public Livro buscarLivro(String nomeLivro)  throws RuntimeException{
       if(isEmpty()){
           throw new RuntimeException("Vetor vazio");
       }

       for (int i = 0; i < size; i++){
           Livro livro = livros[i];
           if (livro.nome.equals(nomeLivro)){
               System.out.println("Livro encontrado!");
               return livro;
           }
           throw new RuntimeException("nao encontrado!!");
       }

       return null;
   }


    public String removeNoFinal()  throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        String temp = livros[size -1].getNome();
        livros[size-1] = null;
        size--;
        return temp;
    }


    public String removeNoInicio()  throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        String temp = livros[0].getNome();
        livros[0] = null;

        for(int i = 1; i < size; i++){
            livros[i -1] = livros[i];

        }
        livros[size -1]= null;
        size--;
        return null;

    }

}





