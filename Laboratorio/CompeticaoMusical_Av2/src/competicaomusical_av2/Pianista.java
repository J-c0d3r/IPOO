package competicaomusical_av2;

public class Pianista extends Musico implements Tecnica, Tempo {

    private float alturaBanco;

    @Override
    public void mostraInfo() {

        super.mostraInfo();
        System.out.println("Altura do banco: " + alturaBanco + "cm");

    }

    @Override
    public void tocar() {
        System.out.println("O músico " + nome + " está tocando a musica " + musica);
    }

    @Override
    public void tocarAcorde() {
        System.out.println("O Pianista tocou o acorde Cm#9º");
    }

    @Override
    public void errarPausa() {
        if ((pontuacao - 25) >= 0) {
            pontuacao = pontuacao - 25;
        } else {
            pontuacao = 0;
        }
        System.out.println("Recomeçando...");
    }

    public void setAlturaBanco(float alturaBanco) {
        this.alturaBanco = alturaBanco;
    }

}
