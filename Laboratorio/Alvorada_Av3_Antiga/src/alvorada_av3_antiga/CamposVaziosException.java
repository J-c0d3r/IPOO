package alvorada_av3_antiga;

import javax.swing.JOptionPane;

public class CamposVaziosException extends RuntimeException {

    public CamposVaziosException() {
        JOptionPane.showMessageDialog(null, "Uns dos campos está vazio!");
    }

}
