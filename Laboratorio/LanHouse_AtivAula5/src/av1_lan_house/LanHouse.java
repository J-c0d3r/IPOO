package av1_lan_house;

public class LanHouse {

    String nome;
    String contato;
    String endereco;

    Computador[] pcs = new Computador[10];

    public LanHouse() {

        for (int i = 0; i < 10; i++) {
            pcs[i] = new Computador();
        }

    }

    void addPC(Computador pc) {

        for (int j = 0; j < 9; j++) {

            if (pcs[j].marca == null) {
                pcs[j] = pc;
                break;
            }
        }

    }

    void rodaGames() {

        if (pcs[0].marca == null) {

            System.out.println("Não existem computadores cadastrados!");
            
        } else {

            for (int j = 0; j < 9; j++) {
                if ((pcs[j].ram >= 8) && (pcs[j].memoria >= 1000)) {
                    System.out.println("O PC da marca " + pcs[j].marca + " aguenta rodar os jogos!\n");
                }
            }
        }

    }

    void precoMedio() {

        //variavel quantidade para fazer a media
        int qntd = 0, j = 0;
        float total = 0;

        while (pcs[j].marca != null) {

            total += pcs[j].preco;
            qntd++;

            j++;
        }

        System.out.println("A média dos PC's cadastrados é: " + (int) (total / qntd));

    }

    void mostraInfo() {

        System.out.println("\nNome da Lan House: " + nome);
        System.out.println("Contato: " + contato);
        System.out.println("Endereco: " + endereco);
        
        int j=0;
        System.out.println("Os computadores cadastrados são:");
        
        while(pcs[j].marca != null){
            
            System.out.println("Marca: " + pcs[j].marca);
            System.out.println("Ram: " + pcs[j].ram);
            System.out.println("Memoria: " + pcs[j].memoria);
            System.out.println("Preço: " + pcs[j].preco);
            j++;
        }
        
        
    }

}
