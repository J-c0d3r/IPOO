package competicaomusical_av2;

public class Cellista extends Musico implements Som {

    private boolean sentado;

    @Override
    public void mostraInfo() {

        super.mostraInfo();
        System.out.println("Sentado: " + sentado);

    }

    @Override
    public void tocar() {
        System.out.println("O músico " + nome + " está tocando a musica " + musica);
    }

    @Override
    public void desafinar() {
        pontuacao = (int) (pontuacao * 0.95);
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

}
