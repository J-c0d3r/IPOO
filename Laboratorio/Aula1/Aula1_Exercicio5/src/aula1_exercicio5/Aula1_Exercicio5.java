package aula1_exercicio5;

import java.util.Scanner;

public class Aula1_Exercicio5 {

    public static void main(String[] args) {

        double NP1, NP2;
        int media;

        Scanner teclado = new Scanner(System.in);

        NP1 = teclado.nextDouble();
        NP2 = teclado.nextDouble();

        media = (int) ((NP1 + NP2) / 2);

        System.out.println("Média " + media);

    }

}
