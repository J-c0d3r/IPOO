package loja_roupa_av3;

public class PedidoRoupa implements Comparable<PedidoRoupa> {

    private String nomeRoupa;
    private String tecido;
    private int qntd;

    public String getNomeRoupa() {
        return nomeRoupa;
    }

    public void setNomeRoupa(String nomeRoupa) {
        this.nomeRoupa = nomeRoupa;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    @Override
    public int compareTo(PedidoRoupa p) {
        return Integer.compare(this.getQntd(), p.getQntd());
    }

}
