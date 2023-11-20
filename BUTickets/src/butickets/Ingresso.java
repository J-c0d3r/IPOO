package butickets;

import java.util.Date;

public class Ingresso {

    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;
    protected Date dataHoraCompra;

    Ingresso() {

        numberGenerator++;
        numero = numberGenerator++;

        taxaCartao = 5;

        dataHoraCompra = new Date();

    }

    public float calculaTotalIngresso() {

        return valorIngresso + taxaCartao;

    }

    public void mostraInfos() {
        System.out.println("INFOS DO INGRESSO: " + numero);
        System.out.println("Valor Total: " + calculaTotalIngresso());
        System.out.println("Taxa Cartao: " + taxaCartao);
        System.out.println("Data Hora Compra: " + dataHoraCompra);
    }

}
