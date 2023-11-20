package javazoo;

public class JavaZoo {

    public static void main(String[] args) {
        
        Coruja c1 = new Coruja();
        c1.nome = "Arquimedes";
        c1.nPatas = 2;
        c1.cor = "Cinza";
        c1.setAlturaVoo(200);

        Peixe p1 = new Peixe();
        p1.nome = "Nemo";
        p1.nPatas = 0;
        p1.cor = "Laranja";
        p1.setnBarbatanas(4);

        Leao l1 = new Leao();
        l1.nome = "Simba";
        l1.nPatas = 4;
        l1.cor = "Amarelo";
        l1.setTamanhoJuba(1);

        Pato pa1 = new Pato();
        pa1.nome = "Donald";
        pa1.nPatas = 2;
        pa1.cor = "Branco";
        pa1.setTamanhoBico(0.2f);

        Zoologico z1 = new Zoologico();
        z1.setNome("ZOO");
        z1.setEndereco("Rua da zoo");

        Animal[] auxAnimals = new Animal[100];
        auxAnimals[0] = c1;
        auxAnimals[1] = p1;
        auxAnimals[2] = l1;
        auxAnimals[3] = pa1;
        z1.setAnimais(auxAnimals);

        System.out.println("Nome do zoo: " + z1.getNome());
        System.out.println("End. do zoo: " + z1.getEndereco());

        System.out.println("ANIMAIS DESTE ZOO: ");

        for (int i = 0; i < z1.getAnimais().length; i++) {
            if (z1.getAnimais()[i] != null) {
                System.out.println("Nome: " + z1.getAnimais()[i].nome);
                System.out.println("Patas: " + z1.getAnimais()[i].nPatas);
                System.out.println("Cor: " + z1.getAnimais()[i].cor);
                
                if(z1.getAnimais()[i] instanceof Peixe){
                    Peixe aux = (Peixe) z1.getAnimais()[i];
                    System.out.println("Barbatanas: " + aux.getnBarbatanas());
                    aux.fazBarulho();
                }
                
                if(z1.getAnimais()[i] instanceof Leao){
                    Leao aux = (Leao) z1.getAnimais()[i];
                    System.out.println("Tamanho da juba: " + aux.getTamanhoJuba());
                    aux.fazBarulho();
                }
                
                if(z1.getAnimais()[i] instanceof Coruja){
                    Coruja aux = (Coruja) z1.getAnimais()[i];
                    System.out.println("Altura do voo: " + aux.getAlturaVoo());
                    aux.fazBarulho();
                }
                
                if(z1.getAnimais()[i] instanceof Pato){
                    Pato aux = (Pato) z1.getAnimais()[i];
                    System.out.println("Tamanho do bico: " + aux.getTamanhoBico());
                    aux.fazBarulho();
                }
                
                System.out.println("*************");
            }
        }

    }

}
