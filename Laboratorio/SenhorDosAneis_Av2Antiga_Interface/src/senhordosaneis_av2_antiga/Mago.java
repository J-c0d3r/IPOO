package senhordosaneis_av2_antiga;

public class Mago extends Habitante implements Cura, Feitico {

    private String cor;

    @Override
    public void curar() {
        System.out.println("Curei em área! Sou melhor que o elfo!");
    }

    @Override
    public void lancaFeitico() {
        System.out.println("blablabla");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor: " + cor);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
