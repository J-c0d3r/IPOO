package atividadeviagem;

public class Trabalho extends Viagem {

    private String nomeEmpresa;

    @Override
    public float calculaGastoTotal() {

        super.calculaGastoTotal();
        System.out.print("Gasto total: ");
        return 0;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

}
