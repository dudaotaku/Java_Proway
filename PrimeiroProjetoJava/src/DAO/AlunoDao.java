package DAO;

import Interfaces.Icrud;
import Modelo.Aluno;

import java.util.List;

public class AlunoDao implements Icrud {

    @Override
    public Aluno salvar(Aluno aluno) {
        return null;
    }

    @Override
    public void excluir(Aluno aluno) {

    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public Aluno consultar(int id) {
        return null;
    }

    @Override
    public List<Aluno> consulta() {
        return List.of();
    }

    @Override
    public void alterar(Aluno aluno) {

    }
}
