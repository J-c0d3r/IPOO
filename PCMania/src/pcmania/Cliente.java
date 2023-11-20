package pcmania;

public class Cliente {

    String nome;
    long cpf;

    Computador[] pcs = new Computador[100];

    public Cliente() {
        for (int i = 0; i < 99; i++) {
            pcs[i] = new Computador();
        }
    }

    public float calculaTotalCompra() {

        float total = 0;
        for (int i = 0; i < 99; i++) {
            total += pcs[i].preco;
        }

        return total;

    }

}
