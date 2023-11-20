package senhordosaneis_av2_antiga;

public class TerraMedia {

    private Habitante[] herois = new Habitante[3];

    public void addHabitante(Habitante habitante) {

        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null) {
                herois[i] = habitante;
                break;
            }
        }

    }

    public void listarHabitantes() {

        System.out.println("Quantidade de habitantes: " + Habitante.contator);

        for (Habitante h : herois) {
            System.out.println(h.nome);

            if (h instanceof Anao) {
                Anao aux = (Anao) h;
                aux.atacar();
                aux.mostraInfo();
            }

            if (h instanceof Elfo) {
                Elfo aux = (Elfo) h;
                aux.viajar();
                aux.atacar();
                aux.mostraInfo();
            }

            if (h instanceof Mago) {
                Mago aux = (Mago) h;
                aux.atacar();
                aux.mostraInfo();
            }

        }

    }

}
