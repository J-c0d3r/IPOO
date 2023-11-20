package senhordosaneis_av2_antiga;

public abstract class Habitante {

    public static int contator = 0;

    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    protected Arma arma;

    public Habitante() {

        contator++;
        id = contator;
    }

    public void atacar() {

        Arma aux = (Arma) arma;
        System.out.println("Atacou com a arma " + aux.getNomeArma());
    }

    public void mostraInfo() {

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);

    }

}
