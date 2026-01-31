package executar;

import modelagem.Pessoa;

import javax.swing.*;

public class CodigoProfessor {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        int option = 1;
        String menu = " ------ Menu do sitema ------\n" +
                "(1) Cadastrar uma poessoa\n" +
                "(2) Exibir dados\n" +
                "(3) Fazer aniversario\n" +
                "(4) Verificar maioridade\n" +
                "(0) Sair\n";

        while(option!=0){
            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (option){
                case 1:
                    pessoa.setNome(JOptionPane.showInputDialog("Nome" ));
                    pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                    pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
                    pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, (pessoa.getNome() == null)?"Nenhuma pessoa cadastrada":pessoa.getDados());
                    break;
                case 3:
                    pessoa.Aniversario();
                    JOptionPane.showMessageDialog(null, "Prabens Aniversario " + pessoa.getNome()+ "\nIdade atual: " + pessoa.getIdade());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, pessoa.verificaIdade());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!!");


            }
        }

    }


}
