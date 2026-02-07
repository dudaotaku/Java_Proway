package JogoHeroi.Executavel;

import JogoHeroi.Modelo.Arma;
import JogoHeroi.Modelo.Inimigo;
import JogoHeroi.Modelo.Personagem;

import javax.swing.*;

public class JogoHeroi {

    public static void main(String[] args) {

        // Exercício
        // - fazer a validação ao final de cada ataque para verificar se alguém morreu
        // - implementar a ação de Defender
        // - implementar a escolha do personagem para jogar
        // - implementar a escolha do inimigo
        // - adicionar a propriedade STATUS no personagem para validar se já foi derrotado ou não
        // - criar a classe Inimigo e deixar somente as propriedades correspondentes

        // Execução do Jogo

        // Armas
        Arma espada = new Arma("Espada", 30);
        Arma arco = new Arma("Arco", 20);
        Arma kunai = new Arma("Kunai", 25);
        Arma katana = new Arma("Katana",35 );


        // Personagens
        Personagem guerreiro = new Personagem("Guerreiro", 20, 100, 15, false);
        guerreiro.setArma(espada);

        Personagem elfo = new Personagem("Elfo",25 ,105 , 20, false);
        elfo.setArma(arco);

        Personagem ninja = new Personagem("Ninja",30,120 ,25, false);
        ninja.setArma(kunai);

        Personagem samurai = new Personagem("Samurai",30,100 ,20 , true);
        samurai.setArma(katana);

        // Inimigos
        Inimigo goblin = new Inimigo("Goblin", 15 ,100 );

        Inimigo ogro = new Inimigo("Ogro", 20,200 ); ///mudei para testar

        Inimigo mortoVivo = new Inimigo("Morto vivo (Mago)",50,250 );

        Inimigo MonarcaMortos = new Inimigo("Monarco dos Mortos",100 ,400);

        // Padronização
        Personagem personagem;
        Inimigo inimigo;

        JOptionPane.showMessageDialog(null,
                "**************************" +
                        "\n\n A Aventura do Herói" +
                        "\n\n**************************");

        String menuPrincipal = "" +
                "\n[1] Lutar" +
                "\n[2] Estatísticas" +
                "\n[3] Treinar" +
                "\n[0] Sair" +
                "\n\n Escolha uma opção";

        String personagensSelecionar = "" +
                "\n[1] Guerreiro" +
                "\n[2] Elfo" +
                "\n[3] Ninja" +
                "\n[4] Samurai" +
                "\n[0] Voltar" +
                "\n\n Escolha uma opção";

        String inimigoSelecionar = "" +
                "\n[1] Goblin" +
                "\n[2] Ogro" +
                "\n[3] Morto vivo" +
                "\n[4] Monarca dod mortos" +
                "\n\n Escolha uma opção";

        String treinoPersistente =" treinou e ganhou: " +
                "\n10 pontos de ataque!" +
                "\n10 pontos de vida" +
                "\n5 pontos de defesa";

        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal));

            switch (opcao) {
                case 1:
                    personagem = escolherPersonagem(guerreiro, elfo, ninja, samurai);
                        inimigo = escolherInimigo(goblin,ogro,mortoVivo,MonarcaMortos);
                    int opcaoLuta = -1;
                    int vidaInimigo = inimigo.getVidaInimigo();
                    int vidaPersonagem = personagem.getVida();
                    while (opcaoLuta != 0 && ( inimigo.getVidaInimigo() > 0 && personagem.getVida() > 0 ) ){
                        // Aparecer os dados do oponente e o menu da luta

                        String menuLuta = "" +
                                "  L U T A " +
                                "\nInimigo: " + inimigo.getClasseInimigo() +
                                "\nVida: " + inimigo.getVidaInimigo() +
                                "\n\n" +
                                "\n" + personagem.getClasse() +
                                "\nVida: " + personagem.getVida() +
                                "\n\n" +
                                "\n[1] Atacar" +
                                "\n[2] Defender" +
                                "\n[3] Usar Arma" +
                                "\n[0] Fugir";

                        String menuLutaEspecial = "" +
                                "  L U T A " +
                                "\nInimigo: " + inimigo.getClasseInimigo() +
                                "\nVida: " + inimigo.getVidaInimigo() +
                                "\n\n" +
                                "\n" + personagem.getClasse() +
                                "\nVida: " + personagem.getVida() +
                                "\n\n" +
                                "\n[1] Atacar" +
                                "\n[2] Defender" +
                                "\n[3] Usar Arma" +
                                "\n[4] Ataque Especial" +
                                "\n[0] Fugir";


                        if(personagem.getTreinoLuta().getContLuta()<3){
                            opcaoLuta = Integer.parseInt(JOptionPane.showInputDialog(null, menuLuta));
                        }else{
                            opcaoLuta = Integer.parseInt(JOptionPane.showInputDialog(null, menuLutaEspecial));
                        }

                        switch (opcaoLuta) {
                            case 1:
                                // Atacar
                                personagem.getTreinoLuta().incrementarLuta();
                                String mensagemAtaque = personagem.getClasse() +
                                        " atacou e causou "
                                        + personagem.getAtaque()
                                        + " pontos de dano!" +
                                        "\n\n" +
                                        inimigo.getClasseInimigo() +" atacou e causou " +
                                        inimigo.getAtaqueInimigo() + " pontos de dano!";

                                JOptionPane.showMessageDialog(null, mensagemAtaque);

                                inimigo.setVidaInimigo(inimigo.getVidaInimigo() - personagem.getAtaque());
                                personagem.setVida(personagem.getVida() - inimigo.getAtaqueInimigo());
                                break;
                            case 2:
                                String menuDefesa = "Ao decidir se defender o poder de ataque cai em 30%" +
                                        "\nDeseja proceguir?" +
                                        "\n[1] Sim" +
                                        "\n[2] Não";

                                int optionDefesa = Integer.parseInt(JOptionPane.showInputDialog(null,menuDefesa));
                                if (optionDefesa == 1){
                                    personagem.getTreinoLuta().incrementarLuta();
                                    double calcular = personagem.getAtaque() * 0.7;
                                    int ataqueDefesa = (int) calcular;
                                    int defesa = inimigo.getAtaqueInimigo() - personagem.getDefesa();
                                    String mensagemAtaqueDefesa = personagem.getClasse() +
                                            " atacou com cautela e causou "
                                            + ataqueDefesa
                                            + " pontos de dano!" +
                                            "\n\n" +
                                            inimigo.getClasseInimigo() +" atacou e causou somente" +
                                            defesa + " pontos de dano, pois " + personagem.getClasse()+
                                            " estava em posição defensiva!";
                                    JOptionPane.showMessageDialog(null, mensagemAtaqueDefesa);

                                    inimigo.setVidaInimigo(inimigo.getVidaInimigo() - ataqueDefesa);
                                    personagem.setVida(personagem.getVida() - defesa);
                                } else if (optionDefesa == 2) {
                                    break;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Opção de inválida!");
                                }

                                break;
                            case 3:
                                // Arma
                                int ataqueComArma = personagem.getAtaque() + personagem.getArma().getDano();
                                personagem.getTreinoLuta().incrementarLuta();

                                String mensagemArma = personagem.getClasse() +
                                        " atacou com " +
                                        personagem.getArma().getNome()
                                        + " e causou "
                                        + ataqueComArma
                                        + " pontos de dano!"+
                                        "\n\n" +
                                        inimigo.getClasseInimigo() +" atacou e causou " +
                                        inimigo.getAtaqueInimigo() + " pontos de dano!";

                                JOptionPane.showMessageDialog(null, mensagemArma);


                                inimigo.setVidaInimigo(inimigo.getVidaInimigo() - ataqueComArma);
                                personagem.setVida(personagem.getVida() - inimigo.getAtaqueInimigo());
                                break;
                            case 4:
                                if (personagem.getTreinoLuta().getContLuta()>=3){
                                    double ataquePer = (personagem.getAtaque() + personagem.getArma().getDano()) *1.5;
                                    int ataqueComArmaEpecial = (int) ataquePer;
                                    double ataqueIni = inimigo.getAtaqueInimigo() *0.5;
                                    int ataqueInimigo = (int) ataqueIni;

                                    String mensagemArmaEspecial =
                                            personagem.getClasse() + " desferiu um ataque especial com " +
                                                    personagem.getArma().getNome() +
                                                    ", causando " + ataqueComArmaEpecial +
                                                    " pontos de dano devastador!\n\n" +
                                                    inimigo.getClasseInimigo() +" contra-atacou enfraquecido e causou " +
                                                    ataqueInimigo + " pontos de dano!";
                                    JOptionPane.showMessageDialog(null, mensagemArmaEspecial);


                                    inimigo.setVidaInimigo(inimigo.getVidaInimigo() - ataqueComArmaEpecial);
                                    personagem.setVida(personagem.getVida() - ataqueInimigo);
                                    personagem.getTreinoLuta().resetarLuta();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Opção de menu inválida!");
                                }
                                break;
                            case 0:
                                // Fugir
                                JOptionPane.showMessageDialog(null,
                                        "Em uma ação covarde " + personagem.getClasse() + " fugiu da luta!");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção de menu inválida!");
                        }
                    }
                    if(personagem.getVida()==0){
                        personagem.setStatus(true);
                    }
                    personagem.getTreinoLuta().resetarLuta();
                    personagem.setVida(vidaPersonagem);
                    inimigo.setVidaInimigo(vidaInimigo);

                    break;
                case 2:
                    // Estatísticas
                    int opcaoPersonagem = Integer.parseInt(JOptionPane.showInputDialog(null, personagensSelecionar));
                    switch (opcaoPersonagem){
                        case 1:
                            personagem = guerreiro;
                            JOptionPane.showMessageDialog(null, personagem.getEstatisticas());
                            break;
                        case 2:
                            personagem = elfo;
                            JOptionPane.showMessageDialog(null, personagem.getEstatisticas());

                            break;
                        case 3:
                            personagem = ninja;
                            JOptionPane.showMessageDialog(null, personagem.getEstatisticas());

                            break;
                        case 4:
                            personagem = samurai;
                            JOptionPane.showMessageDialog(null, personagem.getEstatisticas());

                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opção invalida!!" +
                                    "\nVoltando para o menu principal...");

                    }
                    break;
                case 3:

                    int opcao3 = Integer.parseInt(JOptionPane.showInputDialog(null, personagensSelecionar));

                    switch (opcao3){
                        case 1:
                            personagem = guerreiro;
                            personagem.getTreinoLuta().incrementar();
                            personagem.setAtaque(personagem.getAtaque() + 10);
                            if (personagem.getTreinoLuta().getContTreino()!=5){
                                JOptionPane.showMessageDialog(null,
                                        personagem.getClasse() + " treinou e ganhou 10 pontos de ataque!");
                            }else{
                                personagem.setVida(personagem.getVida()+10);
                                personagem.setDefesa(personagem.getDefesa()+5);
                                JOptionPane.showMessageDialog(null, personagem.getClasse() + treinoPersistente);
                                personagem.getTreinoLuta().resetar();
                            }

                            break;
                        case 2:

                            personagem = elfo;
                            personagem.getTreinoLuta().incrementar();
                            personagem.setAtaque(personagem.getAtaque() + 10);
                            if (personagem.getTreinoLuta().getContTreino()!=5){
                                JOptionPane.showMessageDialog(null,
                                        personagem.getClasse() + " treinou e ganhou 10 pontos de ataque!");
                            }else{
                                personagem.setVida(personagem.getVida()+10);
                                personagem.setDefesa(personagem.getDefesa()+5);
                                JOptionPane.showMessageDialog(null, personagem.getClasse() + treinoPersistente);
                                personagem.getTreinoLuta().resetar();
                            }
                            break;
                        case 3:

                            personagem = ninja;
                            personagem.getTreinoLuta().incrementar();
                            personagem.setAtaque(personagem.getAtaque() + 10);
                            if (personagem.getTreinoLuta().getContTreino()!=5){
                                JOptionPane.showMessageDialog(null,
                                        personagem.getClasse() + " treinou e ganhou 10 pontos de ataque!");
                            }else{
                                personagem.setVida(personagem.getVida()+10);
                                personagem.setDefesa(personagem.getDefesa()+5);
                                JOptionPane.showMessageDialog(null, personagem.getClasse() + treinoPersistente);
                                personagem.getTreinoLuta().resetar();
                            }

                            break;
                        case 4:
                            personagem = samurai;
                            personagem.getTreinoLuta().incrementar();
                            personagem.setAtaque(personagem.getAtaque() + 10);
                            if (personagem.getTreinoLuta().getContTreino()!=5){
                                JOptionPane.showMessageDialog(null,
                                        personagem.getClasse() + " treinou e ganhou 10 pontos de ataque!");
                            }else{
                                personagem.setVida(personagem.getVida()+10);
                                personagem.setDefesa(personagem.getDefesa()+5);
                                JOptionPane.showMessageDialog(null, personagem.getClasse() + treinoPersistente);
                                personagem.getTreinoLuta().resetar();
                            }
                            break;
                        case 0:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opção invalida!!" +
                                    "\nVoltando para o menu principal...");

                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o jogo ...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção de menu inválida!");
            }
        }

    }

    public static Personagem escolherPersonagem(
            Personagem guerreiro,
            Personagem elfo,
            Personagem ninja,
            Personagem samurai
    ) {

        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "[1] Guerreiro" +
                        "\n[2] Elfo" +
                        "\n[3] Ninja" +
                        "\n[4] Samurai" +
                        "\n[0] Voltar"
        ));

        switch (op) {
            case 1: return guerreiro;
            case 2: return elfo;
            case 3: return ninja;
            case 4: return samurai;
            default: JOptionPane.showMessageDialog(null,
            "Opção invalida!!" );
            return null;
        }
    }
    public static Inimigo escolherInimigo(
            Inimigo goblin,
            Inimigo ogro,
            Inimigo mortoVivo,
            Inimigo monarcaMortos
    ) {

        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "[1] Goblin\n[2] Ogro\n[3] Morto Vivo\n[4] Monarca dos Mortos"
        ));

        switch (op) {
            case 1: return goblin;
            case 2: return ogro;
            case 3: return mortoVivo;
            case 4: return monarcaMortos;
            default: JOptionPane.showMessageDialog(null,
                    "Opção invalida!!" );
            return null;
        }
    }

}