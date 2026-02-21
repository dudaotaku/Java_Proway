import Utils.ConexaoDb;

public class Principal {

    //atalho_main - função responsalvel por permitir que a classe seja executavel
    public static void main(String[] args) {
        /*Aluno aluno= new Aluno();

        aluno.setId(1);
        aluno.setNome("Maria");
        aluno.setNota(75);
        System.out.println(toString());

        Aluno aluno1= new Aluno(1,"Mieruko",8.0f);
        System.out.println(aluno1.getId() + " " + aluno1.getNome() + " " + aluno1.getNota());

        AlunoController ac = new AlunoController();
        AlunoController.getSituacao(aluno1);
        System.out.println(AlunoController.getSituacao(aluno1));*/

        if(ConexaoDb.getConexao() != null){
            System.out.println("Conectado");
        }
    }
}








