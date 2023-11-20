package butickets;

public class CarrinhoDeCompras {

    private String loginCliente;
    private Ingresso[] ingressos;

    CarrinhoDeCompras() {

        ingressos = new Ingresso[100];

    }

    public void addIngresso(Ingresso ing) {

        for (int i = 0; i < ingressos.length; i++) {
            if (ingressos[i] == null) {
                ingressos[i] = ing;
                break;
            }
        }
    }

    public void mostraDetalhesCompras() {

        System.out.println("COMPRAS DO USUARIO: " + loginCliente);
        for (int i = 0; i < ingressos.length; i++) {
            if (ingressos[i] != null) {
                ingressos[i].mostraInfos();
                System.out.println("*********");
            }
        }

    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public Ingresso[] getIngressos() {
        return ingressos;
    }

    
    
}
