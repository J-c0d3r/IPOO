package cofrinhointeligente_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {

    ArrayList<Moeda> moedinhas = new ArrayList();

    public void addMoeda(Moeda m) {

        moedinhas.add(m);

    }

    public double getValorTotal() {

        float total = 0;
        for (Moeda m : moedinhas) {

            total += m.getValor();

        }

        return total;
    }

    public int getQuantMoedas() {

        return moedinhas.size();

    }

    public Moeda getMoedaMaiorValor() {

        return Collections.max(moedinhas);

    }

    public void ordenaMoedas() {

        System.out.println("Antes de ordenar: ");
        for (Moeda m : moedinhas) {

            System.out.print(m.getValor() + " ");

        }
        System.out.println("");

        Collections.sort(moedinhas);

        System.out.println("Depois de ordenar: ");
        for (Moeda m : moedinhas) {

            System.out.print(m.getValor() + " ");

        }

    }

}
