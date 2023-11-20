package butickets;

public class BUTickets {

    public static void main(String[] args) {

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        c1.setLoginCliente("Urso");

        VIP[] vip = new VIP[2];
        
        vip[0] = new VIP();
        vip[1] = new VIP();
        
        Camarote camarote = new Camarote();
        Kids vipKids = new Kids();

        vip[0].tamanhoAbada = "60cm";
        vip[0].valorIngresso = 10;

        vipKids.valorIngresso = 5;
        //vipKids.tamanhoAbada = "40cm";
        vipKids.setDocResponsavel("responsavel 1");

        camarote.valorIngresso = 2;
        camarote.setTamanhoCamiseta("M");

        c1.addIngresso(vip[0]);
        c1.addIngresso(camarote);
        c1.addIngresso(vipKids);

        vip[1].tamanhoAbada = "700cm";
        vip[1].valorIngresso = 12;
        c1.addIngresso(vip[1]);
        
        Ingresso ingresso1 = c1.getIngressos()[0];
        Ingresso ingresso2 = c1.getIngressos()[1];
        Ingresso ingresso3 = c1.getIngressos()[2];
        Ingresso ingresso4 = c1.getIngressos()[3];
        
        System.out.println(ingresso1);
        System.out.println(ingresso2);
        System.out.println(ingresso3);
        System.out.println(ingresso4);

        
        c1.mostraDetalhesCompras();
        
    }
}
