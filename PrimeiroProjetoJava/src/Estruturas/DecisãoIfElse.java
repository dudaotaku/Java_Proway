package Estruturas;

import java.util.Scanner;

public class DecisãoIfElse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int media = leitor.nextInt();

         if (media >= 8) {
            System.out.println("Aprovado");
         }else if (media < 4){
            System.out.println("Reprovado");
         }else{
            System.out.println("Recuperação");     }
    }
}
