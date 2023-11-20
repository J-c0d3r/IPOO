package av1;

public class Apartamento {

    String endereco;
    int numQuartos;
    double area;
    double aluguel;

    public void mostraInfo() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Nº Quartos: " + numQuartos);
        System.out.println("Area: " + area);
        System.out.println("Alguel: " + aluguel);
    }

}
