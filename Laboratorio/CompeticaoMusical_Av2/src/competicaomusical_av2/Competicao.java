package competicaomusical_av2;

public class Competicao {

    private Musico[] competidores = new Musico[10];

    public void addMusico(Musico musico) {

        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] == null) {
                competidores[i] = musico;
                break;
            }
        }

    }

    public void listarCompetidores() {

        System.out.println("Quantidade de competidores: " + Musico.contador);

        System.out.println("--------------------------------------");

        for (Musico m : competidores) {

            if (m instanceof Cellista) {

                Cellista aux = (Cellista) m;
                aux.mostraInfo();
                System.out.println(" ");
            }

            if (m instanceof Violinista) {
                Violinista aux = (Violinista) m;
                aux.mostraInfo();
                System.out.println(" ");
            }

            if (m instanceof Pianista) {
                Pianista aux = (Pianista) m;
                aux.mostraInfo();
                System.out.println(" ");
            }
        }

        System.out.println("--------------------------------------");

        for (Musico m : competidores) {

            if (m instanceof Cellista) {
                Cellista aux = (Cellista) m;
                aux.tocar();
                aux.desafinar();
            }

            if (m instanceof Violinista) {
                Violinista aux = (Violinista) m;
                aux.tocar();
                aux.desafinar();
            }

            if (m instanceof Pianista) {
                Pianista aux = (Pianista) m;
                aux.tocar();
                aux.tocarAcorde();
                aux.errarPausa();
            }

        }
        System.out.println("--------------------------------------");
        System.out.println("");

        System.out.println("Pontuação final de cada participante");
        for (Musico m3 : competidores) {
            if (m3 != null) {
                System.out.println("Nome: " + m3.nome + "\nPontuação: " + m3.pontuacao);
                System.out.println("***************");
            }
        }

    }

}
