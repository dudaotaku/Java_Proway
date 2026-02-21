package Modelo;

public class Aluno {
    private int id;
    private String nome;
    private float nota;

    public Aluno() {

    }

    public Aluno(int id, String nome, float nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return id + " " + nome + " " + nota;
    }
}
