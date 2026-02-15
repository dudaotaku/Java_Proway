package HerancaCompleto.Executavel;

import HerancaCompleto.Modelo.Carro;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Chevrolet");
        carro1.setModelo("Opala");
        carro1.setAutomatico(false);
        carro1.exibirDadosCarro();

        carro1.acelerar();
        carro1.LigarDesligar(true);
        carro1.acelerar();

        carro1.parar();

    }
}
