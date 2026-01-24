package executar;

import modelagem.Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        double imc1;
        double imc2;


        pessoa1.CadastrarPessoa();
        pessoa1.Apresentar();
        pessoa1.Aniversario();
        pessoa1.Apresentar();
        imc1 =  pessoa1.CalcularImc();
        System.out.println("IMC: " + imc1);

        pessoa2.CadastrarPessoa();
        pessoa2.Apresentar();
        pessoa2.Aniversario();
        pessoa2.Apresentar();
        imc2 = pessoa2.CalcularImc();
        System.out.println("IMC: " + imc2);

        System.out.println((imc1>imc2) ? pessoa1.getNome()+" tem o imc mais alto" :pessoa2.getNome() + " tem o imc mais alto ");
        System.out.println((pessoa1.getIdade()> pessoa2.getIdade())?pessoa1.getNome()+" é a pessoa mais velha ":pessoa2.getNome() + " é a pessoa mais velha ");



    }


}
