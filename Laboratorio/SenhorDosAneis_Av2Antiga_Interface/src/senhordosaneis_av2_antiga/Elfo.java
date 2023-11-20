package senhordosaneis_av2_antiga;

public class Elfo extends Habitante implements Cura {

    private String tribo;

    public void viajar() {
        System.out.println("Viajei memo! Se nao gostou reclama com o Gandalf");
    }

    @Override
    public void curar() {
        System.out.println("CUREI! SOU O BIXÃO MEMO!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tribo: " + tribo);
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

}
