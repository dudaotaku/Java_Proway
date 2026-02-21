package Controller;
import DAO.TurmaDao;
import Modelo.Aluno;
import Modelo.Curso;
import Modelo.Turma;

import java.util.Scanner;

public class TurmaController {
    private final TurmaDao turmaDao = new TurmaDao();
    CursoController cc = new CursoController();
    public void matricular(Aluno aluno, Curso curso){
        System.out.println(CursoController.verificaCurso(curso));

        Turma turma = new Turma();
        turma.setAluno(aluno);
        turma.setCurso(curso);

        TurmaDao td =new TurmaDao();
        td.salvarTurma(turma);
    }
}
