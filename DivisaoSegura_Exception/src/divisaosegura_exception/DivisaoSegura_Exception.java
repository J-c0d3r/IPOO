package divisaosegura_exception;

import javax.swing.JOptionPane;

public class DivisaoSegura_Exception {

    public static void main(String[] args) {

        int num1, num2, estado = 0;

        while (estado == 0) {
//            try {
//
//                num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º valor"));
//                num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º valor"));
//
//                JOptionPane.showMessageDialog(null, "Resultado: " + num1 / num2);
//
//            } catch (NumberFormatException n) {
//
//                JOptionPane.showMessageDialog(null, "Erro: " + n);
//                JOptionPane.showMessageDialog(null, "Vc entrou com letras");
//
//            } catch (ArithmeticException a) {
//
//                JOptionPane.showMessageDialog(null, "Erro: " + a);
//
//            }

            num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º valor"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º valor"));

            JOptionPane.showMessageDialog(null, "Resultado: " + num1 / num2);

            estado = JOptionPane.showConfirmDialog(null, "Continuar ou nao?", null, JOptionPane.YES_NO_OPTION);

        }

    }

}
