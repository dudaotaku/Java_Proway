package executar;

import com.sun.tools.javac.Main;
import modelagem.Aluno;

import java.util.Scanner;

public class AlunoMain {

    public static void main(String[] args) {
        //declarar ou criar uma "variavel" do tipo da classe aluno
        Aluno aluno1 = new Aluno();
        Scanner s = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("---------Menu da turma--------");
            System.out.println("(1) - Cadastrar aluno\n" +
                    "(2) - visualizar informação do aluno\n" +
                    "(3) - Ativar cadastro\n" +
                    "(4) - Inativar cadastro\n" +
                    "(0) - sair");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    aluno1.CadastrarAluno();
                    break;
                case 2:
                    aluno1.ExibirDados();
                    break;
                case 3:
                    aluno1.Ativar();
                    break;
                case 4:
                    aluno1.Inativar();
                    break;
                case 0:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("opção invalida!!");
            }
        }while(opcao != 0);
    }
}
