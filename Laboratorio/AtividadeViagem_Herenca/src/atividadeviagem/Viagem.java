package atividadeviagem;

public class Viagem {

    protected String duracao;
    protected String destino;
    protected float passagem;

    public float calculaGastoTotal() {

        System.out.println("Duração da viagem: " + duracao);
        System.out.println("Destino da viagem: " + destino);
        System.out.println("Preço da viagem: " + passagem);

        return 0;
    }

}
