package atividadeviagem;

public class Passeio extends Viagem {

    private String pontosTuristicos;
    private float custoHotel;

    @Override
    public float calculaGastoTotal() {

        super.calculaGastoTotal();
        System.out.print("Gasto total: ");
        return passagem + custoHotel;

    }

    public void setPontosTuristicos(String pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    public void setCustoHotel(float custoHotel) {
        this.custoHotel = custoHotel;
    }

}
