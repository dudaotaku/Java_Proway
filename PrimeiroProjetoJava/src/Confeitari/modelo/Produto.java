package Confeitari.modelo;

public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;
    private int qtdVenda;
    private double taxaLucro;

    public Produto(String nome, int qtdEstoque, double preco) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public void vender() {
        this.qtdVenda++;
        this.qtdEstoque--;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public double getTaxaLucro() {
        return taxaLucro;
    }

    public void setTaxaLucro(double taxaLucro) {
        this.taxaLucro = taxaLucro;
    }
}

