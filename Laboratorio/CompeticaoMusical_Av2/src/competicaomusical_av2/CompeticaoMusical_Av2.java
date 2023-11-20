package competicaomusical_av2;

public class CompeticaoMusical_Av2 {

    public static void main(String[] args) {

        Instrumento violoncelo = new Instrumento();
        Instrumento violino = new Instrumento();
        Instrumento piano = new Instrumento();

        violoncelo.setModelo("CoolerMaster");
        violoncelo.setCor("marrom");
        violoncelo.setAno(2018);

        violino.setModelo("Corsair");
        violino.setCor("Marrom Madeira");
        violino.setAno(2020);

        piano.setModelo("Razer");
        piano.setCor("Branco Neve");
        piano.setAno(2022);

        Cellista violinoGrande = new Cellista();
        violinoGrande.nome = "Violino Grande";
        violinoGrande.idade = 32;
        violinoGrande.musica = "Numb";
        violinoGrande.setSentado(true);
        violinoGrande.instrumento = violoncelo;

        Violinista violinoPequeno = new Violinista();
        violinoPequeno.nome = "Violino Pequeno";
        violinoPequeno.idade = 18;
        violinoPequeno.musica = "Wake me up";
        violinoPequeno.setMarcaBreu("UmaMarcaAí");
        violinoPequeno.setUsaEspaleira(false);
        violinoPequeno.instrumento = violino;

        Pianista masterTeclas = new Pianista();
        masterTeclas.nome = "Master Teclas";
        masterTeclas.idade = 25;
        masterTeclas.musica = "Thousand Miles";
        masterTeclas.setAlturaBanco(0.67f);
        masterTeclas.instrumento = piano;

        Competicao comp = new Competicao();
        comp.addMusico(violinoGrande);
        comp.addMusico(violinoPequeno);
        comp.addMusico(masterTeclas);

        comp.listarCompetidores();

    }

}
