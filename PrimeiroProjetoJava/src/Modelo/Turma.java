package Modelo;

public class Turma {
    private int id;
    private int idCurso;
    private int idAluno;

    public Turma(int id, int idCurso, int idAluno) {
        this.id = id;
        this.idCurso = idCurso;
        this.idAluno = idAluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
}
