package Estruturas;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Deseja continuar com o menu? ");
        String resposta = leitor.next();

        while(resposta.equals("Não")){
            System.out.println("Deseja continuar com o menu? ");
            resposta = leitor.next();
        }

        int opcao = 0;
        do{
            System.out.println("Deseja continuar com o menu? " +
                    "\n(1) - Sim" +
                    "\n(2) - Não"
            );
            opcao = leitor.nextInt();
        }while (opcao != 2);
    }
}
