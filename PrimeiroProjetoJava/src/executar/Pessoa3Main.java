package executar;

import modelagem.Pessoa;

import javax.swing.*;

public class Pessoa3Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // pessoa.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        // estruture um menu co os seguintes opcoes:
        //(1) Cadastrar uma poessoa
        //(2) Exibir dados
        //(3) Fazer aniversario
        //(4) Verificar maioridade
        //(0) Sair
        // oobs: o menu deve continuar executando até o usuario escolher sair
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("(1) Cadastrar uma poessoa\n" +
                    "(2) Exibir dados\n" +
                    "(3) Fazer aniversario\n" +
                    "(4) Verificar maioridade\n" +
                    "(0) Sair\n"));

            switch (option){
                case 1:
                    pessoa.setNome(JOptionPane.showInputDialog("Nome: "));
                    pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                    pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
                    pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() +
                            "\nIdade: " + pessoa.getIdade() +
                            "\nAltura: "+ pessoa.getAltura() +
                            "\nPeso: " + pessoa.getPeso() );
                    break;
                case 3:
                    pessoa.setIdade(pessoa.getIdade() + 1);
                    JOptionPane.showMessageDialog(null, "Feliz Aniversario\n Idade atual: " + pessoa.getIdade());
                    break;
                case 4:
                    if (pessoa.getIdade() >= 18) {
                        JOptionPane.showMessageDialog(null, "Maior de idade");
                    } else {
                        JOptionPane.showMessageDialog(null, "Menor de idade");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!!");
            }

        }while(option != 0);
    }
}
