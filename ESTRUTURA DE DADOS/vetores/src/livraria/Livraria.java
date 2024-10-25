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
       return size ==0;
   }

   public void adicionar(Livro livro) throws RuntimeException{
       if (size == livros.length){
          throw new RuntimeException("nao da mais!!");
       }
       livros[size] = livro;
       size++;
   }

//   public Livro buscarLivro(String nomeLivro)  throws RuntimeException{
//       for (int i = 0; i <= livros.length; i++){
//           Livro livro = livros[i];
//           if (livro.nome.equals(nomeLivro)){
//               System.out.println("Livro encontrado!");
//               return livro;
//           }
//           throw new RuntimeException("nao encontrado!!");
//       }
//   }

}
