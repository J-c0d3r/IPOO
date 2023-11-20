package av1;

import java.util.Scanner;

public class Av1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i, n = 0;

        Imobiliaria imo = new Imobiliaria();

        

        System.out.println("Olá, " + imo.nome + "\nPor favor, insira o código que deseja. Para sair insira 0");
        System.out.println("1 - Cadastrar um apartamento novo");
        System.out.println("2 - Ajustar o valor do aluguel, aumentando em 5% o seu valor");
        System.out.println("3 - Mostrar a média (int) das áreas dos apartamentos com 2 quartos ou menos");
        System.out.println("4 - Exibir todas as informações da Imobiliária e dos apartamentos até então cadastrados");
        i = teclado.nextInt();

        while (i != 0) {

            if (i == 1) {
//1º tentativa                
//                System.out.println("Entre com o endereço");
//                imo.ap[n].endereco = teclado.nextLine();
//
//                System.out.println("Entre com o Nº de quartos");
//                imo.ap[n].numQuartos = teclado.nextInt();
//
//                System.out.println("Entre com a área");
//                imo.ap[n].area = teclado.nextDouble();
//
//                System.out.println("Entre com o aluguel");
//                imo.ap[n].aluguel = teclado.nextDouble();
//
//                imo.addApartamento(imo.ap[n]);
//
//                System.out.println("Inserido com sucesso!");
//                n++;
//2º tentativa
                Apartamento apto = new Apartamento();
                System.out.println("Entre com o endereço");
                apto.endereco = teclado.nextLine();
                apto.endereco = teclado.nextLine();

                System.out.println("Entre com o Nº de quartos");
                apto.numQuartos = teclado.nextInt();

                System.out.println("Entre com a área");
                apto.area = teclado.nextDouble();

                System.out.println("Entre com o aluguel");
                apto.aluguel = teclado.nextDouble();

                imo.addApartamento(apto);

                System.out.println("Inserido com sucesso!");
            }

            if (i == 2) {

                imo.ajustaAluguel();

            }

            if (i == 3) {

                System.out.println("Média das àreas dos apartamentos com 2 quartos ou menos: " + imo.mediaArea());

            }

            if (i == 4) {

                imo.mostraInfo();

            }

            System.out.println("Olá, " + imo.nome + "\nPor favor, insira o código que deseja. Para sair insira 0");
            System.out.println("1 - Cadastrar um apartamento novo");
            System.out.println("2 - Ajustar o valor do aluguel, aumentando em 5% o seu valor");
            System.out.println("3 - Mostrar a média (int) das áreas dos apartamentos com 2 quartos ou menos");
            System.out.println("4 - Exibir todas as informações da Imobiliária e dos apartamentos até então cadastrados");
            i = teclado.nextInt();

        }

        System.out.println("Obrigado por utilizar nosso programa! :)");
        
    }

}
