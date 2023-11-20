 package senhordosaneis_av2_antiga;

public class SenhorDosAneis_Av2_Antiga {

    public static void main(String[] args) {

        Anao anao = new Anao();
        Elfo elfo = new Elfo();
        Mago mago = new Mago();

        Arma armaA = new Arma();
        Arma armaE = new Arma();
        Arma armaM = new Arma();

        armaA.setNomeArma("Bastão Kong");
        armaA.setMagica(false);
        armaE.setNomeArma("Arcão Tempestuoso");
        armaE.setMagica(true);
        armaM.setNomeArma("Varinha");
        armaM.setMagica(true);

        anao.nome = "Jorjinho";
        anao.idade = 450;
        anao.energia = 200;
        anao.setAltura(0.6f);
        anao.setReino("Reino dos baixinhos");
        anao.arma = armaA;

        elfo.nome = "Robin hood";
        elfo.idade = 650;
        elfo.energia = 320;
        elfo.setTribo("Tribo das flechinhas");
        elfo.arma = armaE;

        mago.nome = "Cinzento";
        mago.idade = 800;
        mago.energia = 600;
        mago.setCor("cinza");
        mago.arma = armaM;

        Habitante[] habi = new Habitante[3];

        habi[0] = anao;
        habi[1] = elfo;
        habi[2] = mago;

        TerraMedia terra = new TerraMedia();

        for (Habitante habi1 : habi) {
            terra.addHabitante(habi1);
        }

        System.out.println("TERRA MÉDIA");
        terra.listarHabitantes();

    }

}
