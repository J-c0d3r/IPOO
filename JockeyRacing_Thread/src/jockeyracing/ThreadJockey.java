package jockeyracing;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadJockey extends Thread {

    // Vamos passar o para cada cavalo o nome do seu label
    // para que o cavelo especifico possa correr
    JLabel label;
    // Pista pela qual o cavalo especifico irá se mover
    JFrame pista;
    // Identificador de cada cavalo
    int id;
    // Booleano que vai indicar se o cavalo chegou ao fim da tela
    boolean fim = false;

    // IMPORTANTE!!
    // Toda thread no java tem que ter o método run
    public void run() {

        // Usando a classe random para fazer os cavalos
        // correremm de forma aleatoria
        Random r = new Random();

        // Criando um while para mover os cavalos até o 
        // fim da tela
        while (!fim) {

            // Sorteando um numero aleatorio para mover
            // um cavalo x pixels na pista
            int n = r.nextInt(6);

            // Se a posicao X de um cavalo +170px for
            // menor que largura da pista, continua caminhando
            if (label.getX() + 170 < pista.getWidth()) {

                // Movendo o cavalo para uma nova posicao horizontal
                // na tela
                label.setLocation(label.getX() + n, label.getY());
                // Repintando a tela com a nova posicao do cavalo
                pista.repaint();

                try {
                    Thread.sleep(70);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadJockey.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                fim = true;
            }

        }
        label.setLocation(0, label.getY());
        pista.repaint();
        JOptionPane.showMessageDialog(pista, "O Jockey de numero: " + id + " chegou!");

    }

}
