package ifma.lista01;

public class CadastrarAlunos {
    Aluno[] alunos = {};
    private int size;
    private int maxSize;

    public CadastrarAlunos(int tamanhoVetor){
        alunos = new Aluno[tamanhoVetor];
        size = 0;
        maxSize = tamanhoVetor;
    }

    public void mostrarAlunos(){
        for (int i = 0; i < size; i++) {
            System.out.println(alunos[i].toString());
        }
    }

    public void adicionarNoFinal(Aluno aluno){
        if(size == maxSize){
            throw new RuntimeException("Vetor cheio!");
        }
        alunos[size] = aluno;
        size++;
    }

    public void adicionarNoInicio(Aluno aluno){
        if(size == maxSize) {
            throw new RuntimeException("Vetor cheio!");
        }
        Aluno[] novoArray = new Aluno[maxSize];
        novoArray[0] = aluno;
        for (int i = 0; i < size; i++) {
            novoArray[i + 1] = alunos[i];
        }
        alunos = novoArray;
        size++;
    }

    public void removerNoInicio(){
        if(size == 0){
            throw new RuntimeException("Vetor vazio!");
        }
        Aluno[] novoArray = new Aluno[maxSize];
        alunos[0] = null;
        for (int i = 1; i < size; i++) {
            novoArray[i - 1] = alunos[i];
        }
        alunos = novoArray;
        size--;
    }

    public void removerNoFinal(){
        if(size == 0){
            throw new RuntimeException("Vetor vazio!");
        }
        alunos[size - 1] = null;
        size--;
    }

    public boolean verificaIndice(int indice){
        if( alunos[indice] == null || indice < 0 || indice >= size ){
            return false;
        }
        return true;
    }

    public String removerComIndice(int indice){
        if(verificaIndice(indice) == true){
            String nomeAluno = alunos[indice].getNome();
            if(indice == size){
                removerNoFinal();
            }
            else if (indice == 0){
                removerNoInicio();
            }
            else {
                alunos[indice] = null;
                for (int i = indice; i < size; i++) {
                    if(i + 1 != size){
                        alunos[i] = alunos[i + 1];
                    } else if (i + 1 == size) {
                        alunos[i] = null;
                    }
                }
                size = size -1;
            }
            return nomeAluno;
        }
        throw new RuntimeException("Aluno não encontrado!");
    }

    public void ordenaVetor(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(alunos[j].getCodigo() > alunos[i].getCodigo()){
                    Aluno x = alunos[j];
                    alunos[j] = alunos[i];
                    alunos[i] = x;
                }
            }
        }
    }


}
