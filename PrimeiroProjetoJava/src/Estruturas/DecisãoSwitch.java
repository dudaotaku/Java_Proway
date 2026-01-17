package Estruturas;

import java.util.Scanner;

public class DecisãoSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digte o codigo do funcionario: ");
        int codigoFuncionario = leitor.nextInt();

        switch (codigoFuncionario){
            case 1:
                System.out.println("Funcionario: Harry");
                break;
            case 2:
                System.out.println("Funcionario: Hermione");
                break;
            case 3:
                System.out.println("Funcionario: Rony");
                break;
            default:
                System.out.println("Nenhum funcionario encontrado com o codigo: " + codigoFuncionario);
        }

    }


}
