package atividadeviagem;

public class Intercambio extends Viagem {

    private String nomeFacul;
    private float custoMoradia;

    @Override
    public float calculaGastoTotal() {

        super.calculaGastoTotal();
        System.out.print("Gasto total: ");
        return passagem + custoMoradia;

    }

    public void setNomeFacul(String nomeFacul) {
        this.nomeFacul = nomeFacul;
    }

    public void setCustoMoradia(float custoMoradia) {
        this.custoMoradia = custoMoradia;
    }

}
