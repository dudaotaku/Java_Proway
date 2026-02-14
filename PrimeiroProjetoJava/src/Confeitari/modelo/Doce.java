package Confeitari.modelo;

public class Doce extends Produto {

    private boolean temCobertura;

    public Doce(String nome, int qtdEstoque, double preco) {
        super(nome, qtdEstoque, preco);
    }

    public boolean getTemCobertura() {
        return temCobertura;
    }

    public void setTemCobertura(boolean temCobertura) {
        this.temCobertura = temCobertura;
    }
}
