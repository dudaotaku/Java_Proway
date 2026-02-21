import Controller.TurmaController;
import DAO.CursoDao;
import DAO.TurmaDao;
import Modelo.Curso;
import Modelo.Turma;
import Utils.ConexaoDb;
import Modelo.Aluno;
import DAO.AlunoDao;
import java.time.LocalDate;


public class Principal {

    //atalho_main - função responsalvel por permitir que a classe seja executavel
    public static void main(String[] args) {
        Curso curso = new Curso();
        Aluno aluno= new Aluno();


        aluno.setId(1);
        aluno.setNome("Maria");
        aluno.setNota(75);
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.salvar(aluno);
        curso.setId(1);
        curso.setNomeCurso("Java");
        curso.setDataInicio(LocalDate.of(2026, 1, 10));
        curso.setDataFim(LocalDate.of(2026, 10, 26));
        CursoDao cursoDao = new CursoDao();
        cursoDao.salvarCurso(curso);

        TurmaController tc = new TurmaController();
        tc.matricular(aluno,curso);



        /*Aluno aluno1= new Aluno(1,"Mieruko",8.0f);
        System.out.println(aluno1.getId() + " " + aluno1.getNome() + " " + aluno1.getNota());

        AlunoController ac = new AlunoController();
        AlunoController.getSituacao(aluno1);
        System.out.println(AlunoController.getSituacao(aluno1));*/

        /*if(ConexaoDb.getConexao() != null){
            System.out.println("Conectado");
        }*/
    }
}








