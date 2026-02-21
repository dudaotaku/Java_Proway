package DAO;
import Interfaces.Icrud;
import Modelo.Curso;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CursoDao implements CursoInter{
    @Override
    public Curso salvar(Curso curso) {
        try{
            String sql= "Insert into tb_alunos(nome, nota) values(?,?)";
            PreparedStatement stm = Utils.ConexaoDb.getConexao().prepareStatement(sql);
            stm.setString(1, aluno.getNome());
            stm.setFloat(2,aluno.getNota());
            stm.execute();
        } catch (SQLException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
        return curso;
    }

    @Override
    public void excluir(Curso curso) {

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
        try{
            String sql= "select * from tb_aluno";
            PreparedStatement stm = Utils.ConexaoDb.getConexao().prepareStatement(sql);
            stm.getString(1, aluno.getNome());
            stm.getFloat(2,aluno.getNota());
            stm.execute();
        } catch (SQLException ex){
            System.out.println("Erro: " + ex.getMessage());
        }    }

    @Override
    public void alterar(Curso curso) {

    }
}
