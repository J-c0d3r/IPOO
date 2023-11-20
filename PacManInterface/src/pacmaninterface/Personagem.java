package pacmaninterface;

public abstract class Personagem implements Movel {

    protected String cor;
    protected int posicaoX;
    protected int posicaoY;

    @Override
    public void movePraCima() {
        posicaoY++;
    }

    @Override
    public void movePraBaixo() {
        posicaoY--;
    }

    @Override
    public void movePraDireita() {
        posicaoX++;
    }

    @Override
    public void movePraEsquerda() {
        posicaoX--;
    }

}
