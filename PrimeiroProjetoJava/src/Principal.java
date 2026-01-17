import java.util.Scanner;

public class Principal {

    //atalho_main - função responsalvel por permitir que a classe seja executavel
    public static void main(String[] args) {

        //espaço para inserir as linhas de comando
        //comando de saida de dados - atalho sout
        System.out.println("Hello World!...");

        //declaração de variaveis
        //variavel sempre se inicia com letra minuscula
        String aluno = "Mieruko-chan";

        Integer codigo = 7; // variaveis de objetos
        int matricula = 2610; // variaveis primitivas

        Double mediaSemestral = 8.9; // variaveis de objetos
        double mediaAnual = 9.0; // variaveis primitivas

        Boolean situacaoCadastro = true; // variaveis de objetos
        boolean aprovado = true; // variaveis primitivas

        //comando de entrada de dados;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = leitor.next();
        System.out.println("Seja bem vindo: " + nomeUsuario + "!!");

    }
}








