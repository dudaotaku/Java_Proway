package Confeitari.modelo;

public class Bebida extends Produto {

    private String recipiente;

    public Bebida(String nome, int qtdEstoque, double preco) {
        super(nome, qtdEstoque, preco);
    }

    public String getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }
}

