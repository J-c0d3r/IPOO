package pcmania;

import java.util.Scanner;

public class PCMania {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Computador promocao1 = new Computador();
        Computador promocao2 = new Computador();
        Computador promocao3 = new Computador();
        MemoriaUSB musb1 = new MemoriaUSB();
        MemoriaUSB musb2 = new MemoriaUSB();
        MemoriaUSB musb3 = new MemoriaUSB();

        cliente.nome = "Doutor Renzo";
        cliente.cpf = 12345678985l;

        promocao1.marca = "Positivo";
        promocao1.preco = 1300.00f;
        promocao1.hardwares[0].nome = "Processador Core i3";
        promocao1.hardwares[0].capacidade = 1200f;
        promocao1.hardwares[1].nome = "Memoria Ram";
        promocao1.hardwares[1].capacidade = 4f;
        promocao1.hardwares[2].nome = "HD";
        promocao1.hardwares[2].capacidade = 500f;
        promocao1.SO.nome = "Linux Ubuntu";
        promocao1.SO.tipo = 32;
        musb1.nome = "Pen-Drive";
        musb1.capacidade = 16;
        promocao1.addMemoriaUSB(musb1);

        promocao2.marca = "Acer";
        promocao2.preco = 1800.00f;
        promocao2.hardwares[0].nome = "Pentium Core i5";
        promocao2.hardwares[0].capacidade = 2260f;
        promocao2.hardwares[1].nome = "Memoria Ram";
        promocao2.hardwares[1].capacidade = 8f;
        promocao2.hardwares[2].nome = "HD";
        promocao2.hardwares[2].capacidade = 1f;
        promocao2.SO.nome = "Windows 8";
        promocao2.SO.tipo = 64;
        musb2.nome = "Pen-Drive";
        musb2.capacidade = 32;
        promocao2.addMemoriaUSB(musb2);

        promocao3.marca = "Vaio";
        promocao3.preco = 2800.00f;
        promocao3.hardwares[0].nome = "Pentium Core i7";
        promocao3.hardwares[0].capacidade = 3500f;
        promocao3.hardwares[1].nome = "Memoria Ram";
        promocao3.hardwares[1].capacidade = 16f;
        promocao3.hardwares[2].nome = "HD";
        promocao3.hardwares[2].capacidade = 2f;
        promocao3.SO.nome = "Windows 10";
        promocao3.SO.tipo = 64;
        musb3.nome = "HD Externo";
        musb3.capacidade = 1000;
        promocao3.addMemoriaUSB(musb3);

        int i = 0, n = 0;

        System.out.println("Olá, " + cliente.nome + "\nPor favor, insira o código da promoção 1, 2 ou 3. Para sair insira 0");
        i = teclado.nextInt();

        while (i != 0) {

            if (i == 1) {
                cliente.pcs[n] = promocao1;
                System.out.println("Inserido com sucesso!");
            }

            if (i == 2) {
                cliente.pcs[n] = promocao2;
                System.out.println("Inserido com sucesso!");
            }

            if (i == 3) {
                cliente.pcs[n] = promocao3;
                System.out.println("Inserido com sucesso!");
            }

            n++;
            System.out.println("Se desejar comprar mais, por favor, insira o código da promoção 1, 2 ou 3. Para sair insira 0");
            i = teclado.nextInt();

        }

        System.out.println("\nCliente " + cliente.nome + " com o CPF " + cliente.cpf + ", requisitou os respectivos produtos:");

        int m = 0;
        while (cliente.pcs[m].marca != null) {
            cliente.pcs[m].mostraPCConfigs();
            m++;
        }

        System.out.println("\nValor final a pagar é: R$ " + cliente.calculaTotalCompra());

    }

}
