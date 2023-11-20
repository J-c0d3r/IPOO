package cadastrocontrolado_exception;

public class CadastroControlado_Exception {

    public static void main(String[] args) {

        Cadastro c1 = new Cadastro();

        c1.addCodigo("mp-8989");
        c1.addCodigo("mp-844909");
        c1.addCodigo("dp-b989");
        c1.addCodigo("car-1234");
        c1.addCodigo("bp-9022");
        c1.addCodigo("bp-8989");
        c1.addCodigo("dv-67a8");
        c1.addCodigo("br-x880");

        c1.mostraCodigos();

    }

}
