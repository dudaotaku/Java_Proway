package JogoHeroi.Modelo;

public class Personagem {
    private String classe;
    private int ataque;
    private int vida;
    private int defesa;
    private boolean status ;
    private Arma arma;
    private TreinoLuta treinoLuta = new TreinoLuta();


    public Personagem(String classe, int ataque, int vida, int defesa, boolean status) {
        this.classe = classe;
        this.ataque = ataque;
        this.vida = vida;
        this.defesa = defesa;
        this.status = status;
    }


    public String getClasse() {
        return classe;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public TreinoLuta getTreinoLuta() {
        return treinoLuta;
    }

    public void setTreinoLuta(TreinoLuta treinoLuta) {
        this.treinoLuta = treinoLuta;
    }


    public String getEstatisticas() {
        return "" +
                "------------------------" +
                "\n\n" +
                "Status do Personagem  " +
                "\nClasse: " + this.classe +
                "\nVida: " + this.vida +
                "\nPoder de ataque: " + this.ataque +
                "\nDefesa: " +this.defesa+
                "\nStatus: " + (this.status == false ? "Vitorioso" : "Derrotado") +
                "\n" +
                "\nArma: " + this.arma.getNome() + " (" + this.arma.getDano() + ")" +
                "\n\n" +
                "------------------------";
    }


}
