import Utils.ConexaoDb;
import Modelo.Aluno;
import DAO.AlunoDao;


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








