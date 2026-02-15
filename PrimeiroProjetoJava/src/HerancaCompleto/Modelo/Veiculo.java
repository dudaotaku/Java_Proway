package HerancaCompleto.Modelo;

import javax.swing.*;
import java.util.Scanner;

public class Veiculo {

    private String cor;
    private int anoFab;
    private String modelo;
    private String marca;
    private boolean automatico;
    private boolean ligado;
    private double tanqueCombustivel;

    public Veiculo(){}

    public Veiculo(String cor, int anoFab, String modelo, String marca, boolean automatico) {
        this.cor = cor;
        this.anoFab = anoFab;
        this.modelo = modelo;
        this.marca = marca;
        this.automatico = automatico;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public void acelerar(){
        if(this.ligado){
            System.out.println("O veiculo "+ this.modelo +" acelerou" );
        }else {
            System.out.println("Voce precisa ligar o veiculo antes de acelerar");
        }
    }

    public void parar(){
        if(this.ligado){
            System.out.println("O veiculo "+ this.modelo +" parou!" );
        }else {
                System.out.println("O veiculo já está parado...");
        }
    }

    public void LigarDesligar(boolean estadoAtual){
        this.ligado = estadoAtual;
    }

    public void abastecer(double qtdeCombustivel){
        this.tanqueCombustivel += qtdeCombustivel;
    }

}
