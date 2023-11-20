package senhordosaneis_av2_antiga;

public class Anao extends Habitante implements Mineracao {

    private float altura;
    private String reino;

    @Override
    public void minerar() {
        System.out.println("Yo soy uno minerador :)");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Altura: " + altura);
        System.out.println("Reino: " + reino);
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

}
