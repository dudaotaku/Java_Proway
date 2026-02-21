package Interfaces;
import Modelo.Curso;
import Modelo.Turma;

import Modelo.Aluno;

import java.util.List;

public interface Icrud {

    public Aluno salvar (Aluno aluno);
    public void excluir(Aluno aluno);
    public void excluir(int id);
    public Aluno consultar(int id);
    public List<Aluno> consulta();
    public void alterar(Aluno aluno);

    public Curso salvar (Curso curso);
    public void excluir(Curso curso);
    public void excluir(int id);
    public Curso consultar(int id);
    public List<Curso> consulta();
    public void alterar(Curso curso);

    public Turma salvar (Turma turma);
    public void excluir(Turma turma);
    public void excluir(int id);
    public Turma consultar(int id);
    public List<Turma> consulta();
    public void alterar(Turma turma);

    }
