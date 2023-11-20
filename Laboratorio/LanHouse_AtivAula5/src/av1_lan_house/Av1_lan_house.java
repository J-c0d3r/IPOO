package av1_lan_house;

import java.util.Scanner;

public class Av1_lan_house {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i;

        LanHouse house = new LanHouse();

        house.nome = "Lan House João Lucas";
        house.contato = "35 84561352";
        house.endereco = "Rua Summeners Rift";

        System.out.println("Olá, João Lucas, o que desejas?");
        System.out.println("1- Cadastrar um novo pc");
        System.out.println("2- Verificar se roda GAMES");
        System.out.println("3- Mostrar o preço médio dos computadores cadastrados");
        System.out.println("4- Mostrar todas as informações");
        System.out.println("0- Para sair");
        i = teclado.nextInt();

        while (i != 0) {

            if (i == 1) {

                Computador comp = new Computador();
                
                System.out.println("\nEntre com a marca");
                comp.marca = teclado.next();
                
                System.out.println("Entre com a ram");
                comp.ram = teclado.nextInt();
                
                System.out.println("Entre com a memoria. Obs: Use valores em Gibabytes");
                comp.memoria = teclado.nextInt();
                
                System.out.println("Entre com o preço");
                comp.preco = teclado.nextFloat();

                house.addPC(comp);

            }

            if (i == 2) {
                
                house.rodaGames();
            }

            if (i == 3) {

                house.precoMedio();
            }

            if (i == 4) {
                
                house.mostraInfo();
            }

            System.out.println("\nO que mais desejas?");
            System.out.println("1- Cadastrar um novo pc");
            System.out.println("2- Verificar se roda GAMES");
            System.out.println("3- Mostrar o preço médio dos computadores cadastrados");
            System.out.println("4- Mostrar todas as informações");
            System.out.println("0- Para sair");
            i = teclado.nextInt();

        }

    }

}
