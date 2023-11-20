package aula1_exercicio7;

import java.util.Scanner;

public class Aula1_Exercicio7 {

    public static void main(String[] args) {

        double precoBilhete = 2.75;
        double valor;

        Scanner teclado = new Scanner(System.in);

        valor = teclado.nextDouble();

        System.out.println("São possíveis " + (int) (valor / precoBilhete) + " viagens de ônibus");

    }

}
