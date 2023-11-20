package agregacao;

public class Principal {

    public static void main(String[] args) {
        
        //1. fazendo uma agregação
        //A. vamos criar um objeto da parte
        Atleta at1 = new Atleta();
        at1.nome = "Pele";
        at1.idade = 80;
        at1.posicao = "Atacante";
        
        //B. vamos criar uma objeto do todo
        Time time1 = new Time();
        time1.nome = "Seleção brasileira";
        time1.nomeDoTecnico = "Zagalo";
        
        //C. colocar a parte dentro do todo
        time1.novoAtleta = at1;
        
        //mostrando infos da parte e do todo
        //mas fazendo uso apenas do objeto do todo
        System.out.println("Nome do time: " + time1.nome);
        System.out.println("Nome do atleta: " + time1.novoAtleta.nome);
        
        
        
        
    }
}
