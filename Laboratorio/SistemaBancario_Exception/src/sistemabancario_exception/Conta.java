package sistemabancario_exception;

import exceptions.SaqueException;
import javax.swing.JOptionPane;

public class Conta {

    public String proprietario;
    public double saldo;
    public String permissaoEmprestimo;
    public double valorEmprestimo;

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Sacou: " + valor);
            JOptionPane.showMessageDialog(null, "Saldo atual: " + saldo);
        } else {
            try {

                throw new SaqueException();

            } catch (SaqueException ex) {
                ex.metodoAleatorio();
            }
        }

    }

    public void fazerEmprestimo(double valor) {

        valorEmprestimo = valor;

    }

}
