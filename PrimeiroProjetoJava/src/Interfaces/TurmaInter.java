package Interfaces;

import Modelo.Turma;

import java.util.List;

public interface TurmaInter {

    public Turma salvarTurma (Turma turma);
    public void excluirTurma(Turma turma);
    public void excluirTurma(int id);
    public Turma consultarTurma(int id);
    public List<Turma> consultaTurma();
    public void alterarTurma(Turma turma);
}
