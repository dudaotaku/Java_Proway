package Interfaces;
import java.util.List;

public interface CursoInter {

    public Curso salvar (Curso curso);
    public void excluir(Curso curso);
    public void excluir(int id);
    public Curso consultar(int id);
    public List<Curso> consulta();
    public void alterar(Curso curso);
}
