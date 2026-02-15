package HerancaCompleto.Executavel;

import HerancaCompleto.Modelo.Veiculo;

public class VeiculoMain {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setModelo("BYD");
        veiculo1.acelerar();
        veiculo1.LigarDesligar(true);
        veiculo1.acelerar();
        veiculo1.parar();
    }
}
