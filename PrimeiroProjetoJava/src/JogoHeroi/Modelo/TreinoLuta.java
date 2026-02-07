package JogoHeroi.Modelo;

public class TreinoLuta {
    private int contTreino ;
    private int contLuta;

    public TreinoLuta() {

    }

    public int getContLuta() {
        return contLuta;
    }

    public void setContLuta(int contLuta) {
        this.contLuta = contLuta;
    }

    public int getContTreino() {
        return contTreino;
    }

    public void setContTreino(int contTreino) {
        this.contTreino = contTreino;
    }

    public void incrementar(){
        this.contTreino++;
    }

    public void resetar(){
        this.contTreino=0;
    }

    public void incrementarLuta(){
        this.contLuta++;
    }

    public void resetarLuta(){
        this.contLuta=0;
    }


}
