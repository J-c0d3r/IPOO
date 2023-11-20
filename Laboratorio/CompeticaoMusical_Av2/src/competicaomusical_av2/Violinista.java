package competicaomusical_av2;

public class Violinista extends Musico implements Som {

    private String marcaBreu;
    private boolean usaEspaleira;

    @Override
    public void mostraInfo() {

        super.mostraInfo();
        System.out.println("Marca Breu: " + marcaBreu);
        System.out.println("Usa Espaleira: " + usaEspaleira);

    }

    @Override
    public void tocar() {
        System.out.println("O músico " + nome + " está tocando a musica " + musica);
    }

    @Override
    public void desafinar() {
        if (usaEspaleira == true) {
            pontuacao = (int) (pontuacao * 0.95);
        } else {
            pontuacao = (int) (pontuacao * 0.90);
        }
    }

    public void setMarcaBreu(String marcaBreu) {
        this.marcaBreu = marcaBreu;
    }

    public void setUsaEspaleira(boolean usaEspaleira) {
        this.usaEspaleira = usaEspaleira;
    }

}
