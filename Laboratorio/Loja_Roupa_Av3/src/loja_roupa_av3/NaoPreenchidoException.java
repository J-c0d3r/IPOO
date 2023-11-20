package loja_roupa_av3;

import javax.swing.JOptionPane;

public class NaoPreenchidoException extends RuntimeException {

    public NaoPreenchidoException() {
        JOptionPane.showMessageDialog(null, "Algum campo não foi preenchido!");
    }

}
