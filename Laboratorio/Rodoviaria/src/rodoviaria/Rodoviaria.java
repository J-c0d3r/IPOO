package rodoviaria;

public class Rodoviaria {

    Onibus[] onibus;

    Rodoviaria() {

        onibus = new Onibus[5];
        for (int i = 0; i < onibus.length; i++) {
            onibus[i] = new Onibus();
        }

    }

    public float somaPassagens() {

        float total = 0;

        int i = 0;
        while (onibus[i].getCompanhia() != null) {

            total += onibus[i].getPrecoPassagem() * onibus[i].getNumAssentos();

            i++;
        }

        return total;
    }

    public void mostraInfo() {

        int i = 0;
        while (onibus[i].getCompanhia() != null) {

//            System.out.println("id: " + onibus[i].getId());
//            System.out.println("Companhia: " + onibus[i].getCompanhia());
//            System.out.println("Preço da passagem: " + onibus[i].getPrecoPassagem());
            System.out.println(onibus[i].toString());

            i++;
        }
    }

}
