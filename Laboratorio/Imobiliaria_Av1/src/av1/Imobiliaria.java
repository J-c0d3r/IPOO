package av1;

public class Imobiliaria {

    String nome;
    String telefone;
    String cidade;
    int n = 0;

    Apartamento[] ap = new Apartamento[30];

    public Imobiliaria() {

        nome = "MeTiraDaRua";
        telefone = "(35) 34615329";
        cidade = "Santa Rita do Sapucaí";

        for (int i = 0; i < 30; i++) {
            ap[i] = new Apartamento();
        }

    }

    public void addApartamento(Apartamento apto) {
        ap[n] = apto;
        n++;
    }

    public void ajustaAluguel() {

        int m = 0;
        while (ap[m].endereco != null) {

            ap[m].aluguel = ap[m].aluguel * 1.05;

        }

    }

    public int mediaArea() {

        int k = 0, qntd = 0;
        double totalarea = 0;
        while (ap[k].endereco != null) {

            if (ap[k].numQuartos <= 2) {
                totalarea += ap[k].area;
            }
            k++;
        }

        return qntd = (int) (totalarea / k);

    }

    public void mostraInfo() {

        System.out.println("Nome da Imobiliaria: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cidade: " + cidade);

        int j = 0;
        while (ap[j].endereco != null) {
            ap[j].mostraInfo();
            j++;
        }

        System.out.println("");
    }

}
