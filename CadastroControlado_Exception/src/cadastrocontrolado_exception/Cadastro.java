package cadastrocontrolado_exception;

public class Cadastro {

    String[] codigosValidos = new String[100];
    String[] codigosInvalidos = new String[100];

    public void addCodigo(String codigo) {

        if (codigo.length() == 7 && codigo.startsWith("mp-") || codigo.startsWith("dp-") || codigo.startsWith("bp-")) {
            for (int i = 0; i < codigosValidos.length; i++) {
                if (codigosValidos[i] == null) {
                    codigosValidos[i] = codigo;
                    break;
                }
            }
        } else {

            try {

                throw new CodigoDesconhecidoException();

            } catch (CodigoDesconhecidoException ex) {
                for (int i = 0; i < codigosInvalidos.length; i++) {
                    if (codigosInvalidos[i] == null) {
                        codigosInvalidos[i] = codigo;
                        break;
                    }
                }
            }
        }

    }

    public void mostraCodigos() {

        System.out.println("Codigos Validos:");
        for (int i = 0; i < codigosValidos.length; i++) {
            if (codigosValidos[i] != null) {
                System.out.println(codigosValidos[i]);
            }
        }

        System.out.println("******************");
        System.out.println("Codigos Invalidos:");
        for (int i = 0; i < codigosInvalidos.length; i++) {
            if (codigosInvalidos[i] != null) {
                System.out.println(codigosInvalidos[i]);
            }
        }

    }

}
