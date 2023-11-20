package teoremadepitagoras_math;

import javax.swing.JOptionPane;

public class TeoremaDePitagoras_Math {

    public static void main(String[] args) {

        double x1, y1, x2, y2, distancia, radicando, pontoMedioX, pontoMedioY;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de x1"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de y1"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de x2"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de y1"));

        radicando = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);

        distancia = Math.sqrt(radicando);

        pontoMedioX = Math.round((x1 + x2) / 2);
        pontoMedioY = Math.round((y1 + y2) / 2);

        JOptionPane.showMessageDialog(null, "A distância entre os dois pontos é: " + distancia);

        JOptionPane.showMessageDialog(null, "O ponto médio entre os dois pontos é: " + pontoMedioX + " " + pontoMedioY);

    }

}
