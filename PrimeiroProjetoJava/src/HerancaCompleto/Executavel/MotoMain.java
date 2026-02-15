package HerancaCompleto.Executavel;

import HerancaCompleto.Modelo.Moto;

public class MotoMain {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        moto1.setModelo("360");
        moto1.setMarca("Náo sei ");
        moto1.setTanqueCombustivel(6);
        moto1.exibirDadosMoto();
        moto1.LigarDesligar(true);
        moto1.acelerar();
        moto1.acelerar();
        moto1.abastecer(15);
        moto1.exibirDadosMoto();
    }
}
