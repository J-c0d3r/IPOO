package sistemabancario_exception;

import exceptions.EmprestimoException;
import javax.swing.JOptionPane;

public class SistemaBancario_Exception {

    public static void main(String[] args) throws EmprestimoException {

        int op = 3;
        Conta c1 = new Conta();

        c1.proprietario = JOptionPane.showInputDialog("Entre com o nome do proprietário");
        c1.saldo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o saldo"));
        c1.permissaoEmprestimo = JOptionPane.showInputDialog("Permissao emprestimo sim ou nao");

        do {

            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("1-Sacar // 2-Fazer Emprestimo // 0-sair"));
            } catch (NumberFormatException e) {
                System.out.println("Entrada " + e);
            }

            if (op == 1) {
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor que deseja sacar"));
                c1.sacar(valor);
            }

            if (op == 2) {

                if (c1.permissaoEmprestimo.equalsIgnoreCase("sim")) {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do emprestimo"));
                    c1.fazerEmprestimo(valor);
                } else {
                    try {
                        throw new EmprestimoException();
                    } catch (EmprestimoException e) {
                        System.out.println("Erro: " + e);
                    }
                }
            }

        } while (op != 0);

    }

}
