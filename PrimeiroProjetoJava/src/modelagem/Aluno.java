package modelagem;

import java.util.Scanner;

public class Aluno {

    //declarando os atributos
    //são as caracteristicas envolvendo o contexto de classe
    //ou seja, pontos relevantes relacionados à alunos dentro do sistema
    private int matricula;
    private String nome;
    private String email;
    private int idade;
    private boolean statusCadastro;

    /*
     * Declarando construtores
     *Cria um objeto com a estrutura da classe, com todos os atributos e métodos existentes na classe me si
     * */

    //construtor vazio
    public Aluno() {

    }

    public Aluno(int matricula, boolean statusCadastro, int idade, String email, String nome) {
        this.matricula = matricula;
        this.statusCadastro = statusCadastro;
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getStatusCadastro() {
        return this.statusCadastro;
    }

    public void setStatusCadastro(boolean statusCadastro) {
        this.statusCadastro = statusCadastro;
    }

    Scanner s = new Scanner(System.in);


    public void CadastrarAluno() {
        System.out.println("----------Cadastro do aluno----------\n");
        System.out.println("Nome: ");
        setNome(s.next());
        System.out.println("E-mail: ");
        setEmail(s.next());
        System.out.println("Idade: ");
        setIdade(s.nextInt());
        System.out.println("Matricula: ");
        setMatricula(s.nextInt());
        setStatusCadastro(true);
    }

    public void ExibirDados() {
        System.out.println("----------Informações do aluno----------\n");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Idade: " + this.idade);
        if (this.statusCadastro == true) {
            System.out.println("Ativo");
        } else {
            System.out.println("Inativo");
        }
    }

    public void Ativar(){
        if (this.statusCadastro == false) {
            this.statusCadastro = true;
            System.out.println("Cadastro ativado!!");
        } else {
            System.out.println("Cadastra já está ativo!!");
        }
    }

    public void Inativar(){
        if (this.statusCadastro == true) {
            this.statusCadastro = false;
            System.out.println("Cadastro inativado!!");
        } else {
            System.out.println("Cadastra já está inativo!!");
        }
    }
}
