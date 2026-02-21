package DAO;

import Interfaces.Icrud;
import Modelo.Aluno;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AlunoDao implements Icrud {

    @Override
    public Aluno salvar(Aluno aluno) {
        try{
            String sql= "Insert into tb_alunos(nome, nota) values(?,?)";
            PreparedStatement stm = Utils.ConexaoDb.getConexao().prepareStatement(sql);
            stm.setString(1, aluno.getNome());
            stm.setFloat(2,aluno.getNota());
            stm.execute();
        } catch (SQLException ex){
            System.out.println("Erro1: " + ex.getMessage());
        }
        return aluno;
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
