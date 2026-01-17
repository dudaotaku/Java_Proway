import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String> listaAlunos = new ArrayList<String>();

        //adicionar um elemento na lista

        listaAlunos.add("Harry Potter");
        listaAlunos.add("Hermione");
        listaAlunos.add("Rony");



        //utiliza para descobrir se a lista está vazia ou não;
        boolean listaVazia = listaAlunos.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia);

        String alunoPorIndex = listaAlunos.get(1); //o elemento que esta na posição digitada;
        System.out.println(alunoPorIndex);

        int posicao = listaAlunos.indexOf("Hermione"); // descobrir o index de um elemento na lista;
        System.out.println("Posição do aluno na lista: " + posicao);

        System.out.println(listaAlunos);

        System.out.println("--------- Lista de alunos ---------");
        for (String nome : listaAlunos){
            System.out.println(nome);
        }

        //Remover elemento da lista
        listaAlunos.remove(2);
        System.out.println(listaAlunos);
    }
}
