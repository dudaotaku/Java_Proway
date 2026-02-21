package Controller;

import Modelo.Curso;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CursoController {

    public static String verificaCurso(Curso curso){
        if(LocalDate.now().isAfter(curso.getDataFim())){
            return "Não foi possivel matricular o aluno, pois o curso já finalizou";
        }
        return "Curso ativo";
    }

}
