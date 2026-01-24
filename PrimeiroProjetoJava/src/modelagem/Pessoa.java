package modelagem;


import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;


    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void CadastrarPessoa(){
        Scanner s =new Scanner(System.in);
        System.out.println("Nome: ");
        setNome(s.next());
        System.out.println("Idade: ");
        setIdade(s.nextInt());
        System.out.println("Peso: ");
        setPeso(s.nextDouble());
        System.out.println("Digite a altura em metros: ");
        setAltura(s.nextDouble());
    }

    public void Apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
    }

    public void Aniversario(){
        this.idade ++;
        System.out.println("Está de aniversário!! parabens...");
    }

    public double CalcularImc(){
        return this.peso / (this.altura * this.altura);
    }


}
