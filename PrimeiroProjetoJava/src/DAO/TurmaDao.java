package DAO;

import Interfaces.TurmaInter;
import Modelo.Turma;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TurmaDao implements TurmaInter {
    @Override
    public Turma salvarTurma(Turma turma) {
        try {
            String sql = "Insert into tb_turmas(id_alunos, id_cursos values(?,?)";
            PreparedStatement stm = Utils.ConexaoDb.getConexao().prepareStatement(sql);
            stm.setInt(1,turma.getAluno().getId());
            stm.setInt(2, turma.getCurso().getId());
            stm.execute();
        } catch (SQLException ex){
            System.out.println("Erro3: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public void excluirTurma(Turma turma) {

    }

    @Override
    public void excluirTurma(int id) {

    }

    @Override
    public Turma consultarTurma(int id) {
        return null;
    }

    @Override
    public List<Turma> consultaTurma() {
        return List.of();
    }

    @Override
    public void alterarTurma(Turma turma) {

    }
}
