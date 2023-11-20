package cofrinhointeligente_list;

public class CofrinhoInteligente_List {

    public static void main(String[] args) {

        Moeda m1_5 = new Moeda(0.05f);
        Moeda m2_10 = new Moeda(0.10f);
        Moeda m3_25 = new Moeda(0.25f);
        Moeda m4_25 = new Moeda(0.25f);
        Moeda m5_50 = new Moeda(0.50f);
        Moeda m6_1 = new Moeda(1.00f);
        
        Cofrinho c1 = new Cofrinho();
        
        c1.addMoeda(m1_5);
        c1.addMoeda(m4_25);
        c1.addMoeda(m6_1);
        c1.addMoeda(m2_10);
        c1.addMoeda(m5_50);
        c1.addMoeda(m3_25);
        
        System.out.println("Valor total: R$" + c1.getValorTotal());
        System.out.println("Quantidade de moedas: " + c1.getQuantMoedas());
        System.out.println("Moeda de maior valor: " + c1.getMoedaMaiorValor());
        c1.ordenaMoedas();
        
    }

}
