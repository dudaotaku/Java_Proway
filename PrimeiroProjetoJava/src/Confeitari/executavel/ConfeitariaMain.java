package Confeitari.executavel;

import Confeitari.modelo.Bebida;
import Confeitari.modelo.Doce;
import Confeitari.modelo.Salgado;

import java.util.Scanner;
import javax.swing.*;

public class ConfeitariaMain {

    /*
     * Gere um sistema capaz de gerenciar uma confeitaria que trabalha
     * com os segmentos: Doces, Salgados, Bebidas
     * Estrutura:
     *
     * - Devem existir as informações dos produtos, sendo elas das mais
     * genéricas para as mais específicas
     *
     * Regras de negócio:
     *
     * - Exibir menu para vender os produtos, calculando taxa de lucro por
     * tipo diferente de produto
     *
     * - Exibir a quantidade total vendida e o valor total da venda
     *
     * */

    public static void main(String[] args) {

        // Criar os produtos para venda
        Doce bolo = new Doce("Bolo chocolate", 10, 25);
        Salgado coxinha = new Salgado("Coxinha", 50, 5);
        Bebida refri = new Bebida("Refrigerante", 100, 8);

        String menuPrincipal = "" +
                "Menu de Vendas" +
                "\n[1] - Bolo (" + bolo.getPreco() + ")" +
                "\n[2] - Coxinha (" + coxinha.getPreco() + ")" +
                "\n[3] - Refri (" + refri.getPreco() + ")" +
                "\n[0] - Encerrar venda";

        int opcaoMenuPrincipal = 0;

        do {
            opcaoMenuPrincipal = Integer.parseInt(
                    JOptionPane.showInputDialog(null, menuPrincipal));

            switch (opcaoMenuPrincipal) {
                case 1:
                    // Bolo
//                    bolo.setQtdVenda(bolo.getQtdVenda() + 1);
//                    bolo.setQtdEstoque(bolo.getQtdEstoque() - 1);
                    bolo.vender();
                    JOptionPane.showMessageDialog(null,
                            bolo.getNome() + " adicionado com sucesso!");
                    break;
                case 2:
                    // Coxinha
                    coxinha.vender();
                    JOptionPane.showMessageDialog(null,
                            coxinha.getNome() + " adicionado com sucesso!");
                    break;
                case 3:
                    // Refri
                    refri.vender();
                    JOptionPane.showMessageDialog(null,
                            refri.getNome() + " adicionado com sucesso!");
                    break;
                case 0:
                    // Finalizar compra
                    double totalBolo = bolo.getPreco() * bolo.getQtdVenda();
                    double totalCoxinha = coxinha.getPreco() * coxinha.getQtdVenda();
                    double totalRefri = refri.getPreco() * refri.getQtdVenda();
                    double valorTotal = totalBolo + totalCoxinha + totalRefri;

                    String msgVenda = "" +
                            "**** Recibo de Venda ****" +
                            "\nItem: " + bolo.getNome() + " | Quantidade: " + bolo.getQtdVenda() + " | Subtotal: R$ " + totalBolo +
                            "\nItem: " + coxinha.getNome() + " | Quantidade: " + coxinha.getQtdVenda() + " | Subtotal: R$ " + totalCoxinha +
                            "\nItem: " + refri.getNome() + " | Quantidade: " + refri.getQtdVenda() + " | Subtotal: R$ " + totalRefri +
                            "\n\nValor total da compra: R$ " + valorTotal;

                    JOptionPane.showMessageDialog(null, msgVenda);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção de menu inválida!");
            }

        } while(opcaoMenuPrincipal != 0);

    }
}
