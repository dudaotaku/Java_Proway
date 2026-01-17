package Estruturas.Exercicios;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Estruture um menu para a interaça com a conta bancaria de um usuario
        // O menu deve contar as seguintes Opções:
        // 1 - Saque
        // 2 - Deposito
        // 3 - Consulta
        // 4 - Reserva
        // 5 - Saldo reservado
        // 0 - Sair
        //
        // O menu deve continuar executando até o momento que o usuário decidir parar a interação

        int menu = 0;
        double saldoConta = 250.00;
        double deposito = 0;
        double reserva = 0;
        double saque = 0;
        double saldoReserva = 0 ;


        do{
            System.out.println("----------- Banco bradesco ---------");
            System.out.println("\n1 - Saque" +
                            "\n2 - Deposito" +
                            "\n3 - Consulta" +
                            "\n4 - Reserva" +
                            "\n5 - Saldo reservado" +
                            "\n6 - Sacar reservado" +
                            "\n0 - Sair"
                    );
            menu = leitor.nextInt();

            switch (menu){
                case 1:
                    if (saldoConta != 0){
                        System.out.println("R$: " + saldoConta);
                        System.out.println("Quanto o cliente deseja sacar?");
                        saque = leitor.nextDouble();
                        if(saque<=saldoConta){
                            saldoConta -= saque;
                            System.out.println("Saque realizado com sucesso!!");
                        }else{
                            System.out.println("Saldo insuficiente");
                        }
                    }else{
                        System.out.println("Conta sem saldo disponivel");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    deposito = leitor.nextDouble();
                    saldoConta += deposito;
                    System.out.println("Depositado com sucesso!!");
                    break;
                case 3:
                    if (saldoConta != 0){
                        System.out.println("R$: " + saldoConta);
                    }else{
                        System.out.println("Conta sem saldo disponivel");
                    }
                    break;
                case 4:
                    if (saldoConta!=0){
                        System.out.println("Quanto o cliente deseja reservar? ");
                        reserva = leitor.nextDouble();
                        if(reserva<=saldoConta){
                            saldoConta -= reserva;
                            saldoReserva += reserva;
                            System.out.println("Reserva realizada com sucesso");
                        }else{
                            System.out.println("Saldo insuficiente");
                            System.out.println("R$: " + saldoConta);
                        }
                    }else {
                        System.out.println("Conta sem saldo disponivel");
                    }
                    break;
                case 5:
                    if (saldoConta != 0){
                        System.out.println("R$: " + saldoReserva);
                    }else{
                        System.out.println("Conta sem saldo disponivel");
                    }
                    break;
                case 6:
                    System.out.println("Saldo da reseva: R$ " + saldoReserva );
                    System.out.println("Quanto o cliente deseja sacar? ");
                    saque = leitor.nextDouble();
                    if(saque<=saldoReserva){
                        saldoReserva -= saque;
                        System.out.println("Saque realizado com sucesso!!");
                    }else{
                        System.out.println("Saldo insuficiente");
                    }

                    break;
                default:
                    if(menu > 6 || menu < 0){
                        System.out.println("Opção errada");
                    }else if (menu == 0){
                        System.out.println("Até a próxima!! ");
                    }
            }

        }while (menu!= 0);

    }
}

