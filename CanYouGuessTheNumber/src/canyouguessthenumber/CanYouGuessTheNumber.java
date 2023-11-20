package canyouguessthenumber;

import java.util.Random;
import java.util.Scanner;

public class CanYouGuessTheNumber {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int numAleatorio;

        Scanner teclado = new Scanner(System.in);

        int number;
        int i = 0;
        
        do {

            numAleatorio = randomGenerator.nextInt(10);
            System.out.println(numAleatorio);
            i++;
            
        } while (i < 60);

    }

}
