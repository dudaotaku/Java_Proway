package Confeitari.modelo;

public class Salgado extends Produto {

    private boolean vegetariano;

    public Salgado(String nome, int qtdEstoque, double preco) {
        super(nome, qtdEstoque, preco);
    }

    public boolean getVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
}
