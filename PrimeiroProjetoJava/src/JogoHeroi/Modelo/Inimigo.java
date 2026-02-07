package JogoHeroi.Modelo;

public class Inimigo {
    private String classeInimigo;
    private int ataqueInimigo;
    private int vidaInimigo;

    public Inimigo(String classeInimigo, int ataqueInimigo, int vidaInimigo) {
        this.classeInimigo = classeInimigo;
        this.ataqueInimigo = ataqueInimigo;
        this.vidaInimigo = vidaInimigo;
    }

    public String getClasseInimigo() {
        return classeInimigo;
    }

    public int getAtaqueInimigo() {
        return ataqueInimigo;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }


    public void setClasseInimigo(String classeInimigo) {
        this.classeInimigo = classeInimigo;
    }

    public void setAtaqueInimigo(int ataqueInimigo) {
        this.ataqueInimigo = ataqueInimigo;
    }

    public void setVidaInimigo(int vidaInimigo) {
        this.vidaInimigo = vidaInimigo;
    }

}
