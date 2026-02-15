package HerancaCompleto.Modelo;

import java.util.Scanner;

public class Moto extends Veiculo{
    public Moto() {
    }

    public Moto(String cor, int anoFab, String modelo, String marca, boolean automatico) {
        super(cor, anoFab, modelo, marca, automatico);
    }

    public void exibirDadosMoto(){
        System.out.println("*****Dados do Moto*****" +
                "\nModelo: " + this.getModelo()+
                "\nMarca: " + this.getMarca() +
                "\nTanque de combustivel: " + this.getTanqueCombustivel());
    }
    @Override
    public void acelerar(){
        if (getTanqueCombustivel() != 0 && getTanqueCombustivel() > 3.3){
            if(isLigado()){
                System.out.println("A Moto "+ isLigado() +" acelerou" );
                setTanqueCombustivel(getTanqueCombustivel() - 3.3) ;
            }else {
                System.out.println("Voce precisa ligar a moto antes de acelerar");
            }
        }else{
            System.out.println(getModelo() + " está sem gasolina");
            parar();
        }
    }

    @Override
    public void parar(){
        if(isLigado()){
            System.out.println(this.getModelo()+" parou de funcionar" );
        }else {
            System.out.println("A moto "+ this.getModelo() + " já se encontra desligado");
        }
    }
}
