package Modelo;

import java.time.LocalDate;
import java.util.Date;

public class Curso {
    private int id;
    private String nomeCurso;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Curso() {

    }

    public Curso(int id, String nomeCurso, LocalDate dataInicio, LocalDate dataFim) {
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
