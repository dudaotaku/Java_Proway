package Heranca.ModeloHeranca;

public class Professor extends Pessoa{
    private Integer codigoInterno;
    private String materia;

    public Professor(Integer codigoInterno, String materia) {
        this.codigoInterno = codigoInterno;
        this.materia = materia;
    }

    public Professor() {

    }

    public Professor(Integer id, String nome, String dataNascimento, String cpf, Integer codigoInterno, String materia) {
        super(id, nome, dataNascimento, cpf);
        this.codigoInterno = codigoInterno;
        this.materia = materia;
    }

    public Integer getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(Integer codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
