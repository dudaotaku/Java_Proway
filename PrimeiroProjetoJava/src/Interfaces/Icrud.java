package Interfaces;
import Modelo.Aluno;
import java.util.List;
import  Modelo.Curso;
import Modelo.Turma;

public interface Icrud {

    public Aluno salvar (Aluno aluno);
    public void excluir(Aluno aluno);
    public void excluir(int id);
    public Aluno consultar(int id);
    public List<Aluno> consulta();
    public void alterar(Aluno aluno);

    }




