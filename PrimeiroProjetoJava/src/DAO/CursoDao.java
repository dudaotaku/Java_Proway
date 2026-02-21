package DAO;
import Interfaces.CursoInter;
import Interfaces.Icrud;
import Modelo.Curso;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CursoDao implements CursoInter {

    @Override
    public Curso salvarCurso(Curso curso) {

        try {
            String sql = "Insert into tb_cursos(nome, dataInicio, dataFim) values(?,?,?)";
            PreparedStatement stm = Utils.ConexaoDb.getConexao().prepareStatement(sql);
            stm.setString(1, (curso.getNomeCurso()));
            stm.setDate(2, java.sql.Date.valueOf(curso.getDataInicio()));
            stm.setDate(3, java.sql.Date.valueOf(curso.getDataFim()));
            stm.execute();
        } catch (SQLException ex){
            System.out.println("Erro2: " + ex.getMessage());
        }
        return curso;
    }

    @Override
    public void excluirCurso(Curso curso) {

    }

    @Override
    public void excluirCurso(int id) {

    }

    @Override
    public Curso consultarCurso(int id) {
        return null;
    }

    @Override
    public List<Curso> consultaCurso() {
        return List.of();
    }

    @Override
    public void alterarCurso(Curso curso) {

    }
}