package atividadeviagem;

public class Agencia {

    public String nome;

    private Viagem[] viagens = new Viagem[100];

    public void listarViagens() {

        System.out.println("Agencia: " + nome);

        for (Viagem v : viagens) {
            if (v != null) {
                System.out.println(v.calculaGastoTotal());
            }

        }

    }

    public void setViagens(Viagem[] viagens) {
        this.viagens = viagens;
    }

}
