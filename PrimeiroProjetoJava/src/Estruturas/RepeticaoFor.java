package Estruturas;

public class RepeticaoFor {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Harry";
        nomes[1] = "Hermione";
        nomes[2] = "Rony";
        nomes[3] = "Mieruko-chan";

        System.out.println("--------- Lista de presença (FOR) ----------");
        for(int i = 0; i < nomes.length; i++){ //length sempre retorna o tamando do vetor
            System.out.println(nomes[i]);
        }

        //o tipo de dados que sera declarado dentro do for, deve ser o mesmo tipo de dado do vetor/lista que está utilizando,
        // pois dessa forma essa variavel declarada dentro do for, ela vai tomar lugar de cada elemento do vetor/lista
        System.out.println("--------- Lista de presença (FOR OF) ----------");
        for (String nome: nomes){
            System.out.println(nome);
        }

    }
}
