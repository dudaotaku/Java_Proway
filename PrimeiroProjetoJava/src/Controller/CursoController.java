package Controller;

import java.time.LocalDate;

public class CursoController {

    public static String Matriclua(Curso curso){
        LocalDate ld = new LocalDate.now();
        if(ld < dataFim){
            return "Não é possivel matricular o aluno após a data final do curso";
        }
        return
    }

}
