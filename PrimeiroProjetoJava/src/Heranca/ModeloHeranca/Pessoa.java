package Heranca.ModeloHeranca;

public class Pessoa {
    private Integer id;
    private String nome;
    private String dataNascimento;
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, String dataNascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("Dados da pessoa" +
                "\nNome: " +this.nome +
                "\nCodigo: " +this.id +
                "\nCPF: " +this.cpf +
                "\nData de nascimento: " + this.dataNascimento);
    }
}
