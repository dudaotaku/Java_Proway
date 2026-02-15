package HerancaCompleto.Modelo;

public class Carro extends Veiculo{
    public Carro() {
    }

    public Carro(String cor, int anoFab, String modelo, String marca, boolean automatico) {
        super(cor, anoFab, modelo, marca, automatico);
    }

    public void exibirDadosCarro(){
        System.out.println("*****Dados do carrro*****" +
                "\nModelo: " + this.getModelo()+
                "\nMarca: " + this.getMarca() +
                "\nCambio automatico: "+ this.isAutomatico() +
                "\nTanque de combustivel: " + this.getTanqueCombustivel());
    }
    @Override
    public void acelerar(){
        if (getTanqueCombustivel() != 0 && getTanqueCombustivel() > 8.3){
            if(isLigado()){
                System.out.println("O carro "+ isLigado() +" acelerou" );
                setTanqueCombustivel(getTanqueCombustivel() - 8.3) ;
            }else {
                System.out.println("Voce precisa ligar o carro antes de acelerar");
            }
        }else{
            System.out.println(getModelo() + " está sem gasolina");
        }
    }

    @Override
    public void parar(){
        if(isLigado()){
            System.out.println(this.getModelo()+" vrum vrum parou de funcionar" );
        }else {
            System.out.println("O carro "+ this.getModelo() + " já se encontra desligado");
        }
    }

}
