package Interfaces;

import Modelo.Curso;

import java.util.List;

public interface CursoInter {

    public Curso salvarCurso (Curso curso);
    public void excluirCurso(Curso curso);
    public void excluirCurso(int id);
    public Curso consultarCurso(int id);
    public List<Curso> consultaCurso();
    public void alterarCurso(Curso curso);
}
