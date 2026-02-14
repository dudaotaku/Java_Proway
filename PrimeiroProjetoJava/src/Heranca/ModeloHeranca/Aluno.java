package Heranca.ModeloHeranca;

public class Aluno extends Pessoa{
    private Integer matricula;

    public Aluno(Integer id, String nome, String dataNascimento, String cpf, Integer matricula) {
        super(id, nome, dataNascimento, cpf);
        this.matricula = matricula;
    }

    public Aluno(Integer matricula) {
        this.matricula = matricula;
    }

    public Aluno() {

    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
