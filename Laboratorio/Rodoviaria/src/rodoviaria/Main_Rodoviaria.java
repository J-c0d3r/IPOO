package rodoviaria;

public class Main_Rodoviaria {

    public static void main(String[] args) {

        Rodoviaria rodo = new Rodoviaria();

        rodo.onibus[0].setCompanhia("Companhia 1");
        rodo.onibus[0].setPrecoPassagem(3.80f);

        rodo.onibus[1].setCompanhia("Companhia 2");
        rodo.onibus[1].setPrecoPassagem(4.20f);

        rodo.onibus[2].setCompanhia("Companhia 3");
        rodo.onibus[2].setPrecoPassagem(1.20f);

        System.out.println("Soma total das passagens: " + rodo.somaPassagens()); //152 + 168 + 48 = 368
        rodo.mostraInfo();

    }
        //  TODO: teste
}
