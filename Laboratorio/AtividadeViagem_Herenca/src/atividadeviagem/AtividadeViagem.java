package atividadeviagem;

public class AtividadeViagem {

    public static void main(String[] args) {

        Passeio p = new Passeio();
        Intercambio i = new Intercambio();
        Trabalho t = new Trabalho();

        p.duracao = "6 meses";
        p.destino = "Paris, França, China, Japão, europa inteira, so lets bora!";
        p.passagem = 500.50f;
        p.setPontosTuristicos("Torre eifel, grande muralha, sei la, tudo que puder aproveitar, só bora");
        p.setCustoHotel(5000);

        i.duracao = "1 ano";
        i.destino = "Cambridge";
        i.passagem = 750.25f;
        i.setNomeFacul("Havard");
        i.setCustoMoradia(500);

        t.duracao = "3 meses";
        t.destino = "Europa";
        t.setNomeEmpresa("IBM");

        Viagem[] via = new Viagem[3];
        Agencia a = new Agencia();

        a.nome = "CVC";

        via[0] = p;
        via[1] = i;
        via[2] = t;

        a.setViagens(via);

        a.listarViagens();

    }

}
