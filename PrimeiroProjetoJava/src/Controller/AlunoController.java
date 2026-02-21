package Controller;

import Modelo.Aluno;

public class AlunoController {

    public static String getSituacao(Aluno aluno1) {

        if (aluno1.getNota() < 7) {
            return "Reprovado";
        }

        return "Aprovado";
    }

}
