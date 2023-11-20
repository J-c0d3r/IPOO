package pacmaninterface;

public class PacMan extends Personagem {

    private int pontuacao;
    private int vidas;

    public PacMan() {

        pontuacao = 0;
        vidas = 3;

    }

    public void perdeVida() {

        if (vidas >= 0) {
            vidas--;
        } else {
            System.out.println("Game Over");
            System.out.println("Pontuação final: " + pontuacao);
        }

    }

    public void ganhaPonto() {

        pontuacao++;
        
    }

}
