package rodoviaria;

public class Onibus {

    private static int numAssentos;
    private static int contator;
    private int id;
    private float precoPassagem;
    private String companhia;

    Onibus() {
        numAssentos = 40;
        id = contator++;
    }

    public int getId() {
        return id;
    }

    public float getPrecoPassagem() {
        return precoPassagem;
    }

    public String getCompanhia() {
        return companhia;
    }

    public static int getNumAssentos() {
        return numAssentos;
    }

    public void setPrecoPassagem(float precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public String toString() {
        return "Onibus " + id + "\nPreco da Passagem = " + precoPassagem + "\nCompanhia = " + companhia + "\n";
    }

}
