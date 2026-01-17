package Estruturas.Exercicios;

import java.util.Scanner;

public class Decisão {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Exercicio
        //Peça para o usuario um dia da semana (em numero inteiro) e com base no dia da semana,
        //imprima o cardapio do restaurante do dia correspondente
        //Exemplo:
        // Entrada > 5
        //saida > quinta-feira : carne com batata

        //parte 2
        // identifique se o usuario é vegetariano, nesse caso não podera ser exibido cardapio
        // com carne para o dia escolhido!!

        String nomeCliente = " ";
        int diaSemana = 0;
        int veg = 0;
        System.out.println("Digite seu nome: ");
        nomeCliente = leitor.next();

        System.out.println("Bem vindo: " + nomeCliente + "\nO cliente é vegetariano?" +
                "\n(1) - Sim" +
                "\n(2) - Não");
        veg = leitor.nextInt();

        System.out.println("Qual cardapio o cliente deseja visualizar?" +
                "\n(1) - Segunda-Feira" +
                "\n(2) - Terça-Feira" +
                "\n(3) - Quarta-Feira" +
                "\n(4) - Quinta-Feira" +
                "\n(5) - Sexta-Feira" +
                "\n(6) - Sabado" +
                "\n(7) - Domingo"
        );
        diaSemana = leitor.nextInt();

        if (veg == 1) {
            switch (diaSemana) {
                case 1:
                    System.out.println("Segunda-Feira - Bobó de Palmito");
                    break;
                case 2:
                    System.out.println("Terça-Feira - Curry Cremoso de grão de bico");
                    break;
                case 3:
                    System.out.println("Quarta-Feira - Hambúrguer de Grão de Bico");
                    break;
                case 4:
                    System.out.println("Quinta-Feira - Strogonoff de Cogumelos,");
                    break;
                case 5:
                    System.out.println("Sexta-Feira -  Bobó de Banana");
                    break;
                case 6:
                    System.out.println("Sabado - Falafel");
                    break;
                case 7:
                    System.out.println("Domingo - Tabule de couve-flor");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } else {
            switch (diaSemana) {
                case 1:
                    System.out.println("Segunda-Feira - carne com batata");
                    break;
                case 2:
                    System.out.println("Terça-Feira - Curry Cremoso");
                    break;
                case 3:
                    System.out.println("Quarta-Feira - Hambúrguer");
                    break;
                case 4:
                    System.out.println("Quinta-Feira - Strogonoff de carne");
                    break;
                case 5:
                    System.out.println("Sexta-Feira -  Bobó de camarão");
                    break;
                case 6:
                    System.out.println("Sabado - Falafel");
                    break;
                case 7:
                    System.out.println("Domingo - Tabule de couve-flor");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
