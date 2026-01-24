package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {



    public static void main(String[] args) {

        int option;
        int index;
        int count = 0;
        Scanner s = new Scanner(System.in);
        List<String> listaProduto = new ArrayList<String>();
        listaProduto.add("shampoo");
        listaProduto.add("Condicionador");
        listaProduto.add("Mascara");


        /*
        cadastro de produto
        faça um menu que permita as seguintes opções
        [1] - Cadastrar novo produto
        [2] - Exibir lista
        [3] - Excluit
        [4] - Alterar
        [0] - Sair
         */
        //OBS - Praticando conceito geral de CRUD
        do {
            System.out.println("------- Cadastro de produto --------");
            System.out.println("\n[1] - Cadastrar novo produto\n" +
                    "[2] - Exibir lista\n" +
                    "[3] - Excluit \n" +
                    "[4] - Alterar\n" +
                    "[5] - Contar produtos\n" +
                    "[0] - Sair"
            );
            option = s.nextInt();

            boolean listaVazia = listaProduto.isEmpty();

            switch (option) {
                case 1:
                    System.out.println("Qual produto deseja cadastrar? ");
                    String nomeProduto = s.next();
                    listaProduto.add(nomeProduto);
                    break;
                case 2:
                    for (String produto : listaProduto) {
                        System.out.println(produto);
                    }
                    break;
                case 3:

                    if (listaVazia == true) {
                        System.out.println("Sem produtos cadastrados");
                    } else {
                        System.out.println("Qual produto deseja excluir? ");
                        String produto = s.next();
                        index = listaProduto.indexOf(produto);
                        listaProduto.remove(index);
                        System.out.println("Produto removido com sucesso!!");
                    }


                    break;
                case 4:
                    if (listaVazia == true) {
                        System.out.println("Sem produtos cadastrados");
                    } else {
                        System.out.println("Qual produto deseja alterar? ");
                        String alterar = s.next();
                        System.out.println("Qual a alteração? ");
                        String novo = s.next();
                        index = listaProduto.indexOf(alterar);

                        if(index<0){
                            System.out.println("Produto não encontrado na lista!!");
                        }else{
                            listaProduto.set(index, novo);
                            System.out.println("Produto alterado com sucesso!!");
                        }
                    }
                    break;
                case 5:

                    List<String> listaProdutosJaContados = new ArrayList<>();

                    for (String produtoContar : listaProduto) {

                        if (listaProdutosJaContados.indexOf(produtoContar) < 0) {
                            int contador = 0;
                            for (String produto : listaProduto) {
                                if (produto.equals(produtoContar)) {
                                    contador ++;
                                }
                            }
                            System.out.println(produtoContar + " - " + contador);
                            listaProdutosJaContados.add(produtoContar);
                        }

                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção invalida");

            }


        }while(option != 0 );


    }


}

