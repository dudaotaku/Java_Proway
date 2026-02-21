package Modelo;

import java.util.Date;

public class Curso {
    private int id;
    private String nomeCurso;
    private Date dataInicio;
    private Date dataFim;

    public Curso(int id, String nomeCurso, Date dataInicio, Date dataFim) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
