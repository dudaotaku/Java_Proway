package Heranca.ExecutavelHeranca;

import Heranca.ModeloHeranca.Aluno;
import Heranca.ModeloHeranca.Pessoa;
import Heranca.ModeloHeranca.Professor;

public class PessoaMain {
    public static void main(String[] args) {

        /*Pessoa pessoa1 = new Pessoa();
        pessoa1.setId(1);
        pessoa1.setNome("Harry");
        pessoa1.setDataNascimento("26/10/2025");
        pessoa1.setCpf("097.25.729-56");

        pessoa1.exibirDados();*/

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Duda");
        aluno1.setId(2);
        aluno1.exibirDados();

        Professor professor1 = new Professor();
        professor1.setNome("duda professor");
        professor1.setId(6);
        professor1.exibirDados();

    }
}
