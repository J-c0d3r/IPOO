package mariokart;

public class MarioKart {

    public static void main(String[] args) {

        //Preparando a partida  
        
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Mario";
        p1.vilao = false;

        p2.nome = "Bowser";
        p2.vilao = true;

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome = "Standard";
        k1.motor.cilindradas = "100";
        k1.motor.velocidadeMaxima = 150.0f;
        k1.piloto = p1;

        k2.nome = "Egg1";
        k2.motor.cilindradas = "50";
        k2.motor.velocidadeMaxima = 125.50f;
        k2.piloto = p2;
        
        //Pilotos prontos?      
        
        System.out.println(k1.nome + " " + 
                           k1.motor.cilindradas + " " +
                           k1.motor.velocidadeMaxima + " " + 
                           k1.piloto.nome + " " + 
                           ((k1.piloto.vilao) ? "Vilão" : "Herói") +
                           "\nPiloto " + k1.piloto.nome + ", Are you ready?\n");
                                    
        System.out.println(k2.nome + " " + 
                           k2.motor.cilindradas + " " + 
                           k2.motor.velocidadeMaxima + " " + 
                           k2.piloto.nome + " " + 
                           ((k2.piloto.vilao) ? "Vilão" : "Herói") +
                           "\nPiloto " + k2.piloto.nome + ", Are you ready?\n");

        //Foi dado a largada

        System.out.println("3...2...1... GO!!!");
        System.out.println(k1.piloto.nome + " começa em 1º lugar deixando o " + k2.piloto.nome + " comendo poeira");
        System.out.println("Os pilotos avançam até pegarem o seu primeiro PODERZAUM");
        System.out.println(k2.piloto.nome + " pega o poder do casco e aciona para destruir seu rival");
        k2.piloto.soltaSuperPoder();
        System.out.println("Porém o " + k1.piloto.nome + " possui as skills elevadas, aprendidas com os monges grão mestre das montanhas do norte, e aciona o seu pulo supremo");
        k1.pular();
        System.out.println(k2.piloto.nome +" vendo aquilo se enfurece muito e resolve soltar o seu turbo para ultrapassar seu inimigo");
        k2.soltarTurbo();
        System.out.println("E o " + k2.piloto.nome + " ASSUME A LIDERANÇA!!!");
        System.out.println(k1.piloto.nome + " diz: ainda não acabou porque eu ainda sou o IT'S ME, MARIO!");
        System.out.println("Os corredores estão numa disputa acirrada, falta apenas mais uma curva em cima de uma montanha e teremos o nosso vencedor");
        System.out.println("Quando os corredores se aproximam dessa curva MORTAL, " + k1.piloto.nome + " faz o drift");
        k1.fazerDrift();
        System.out.println(k1.piloto.nome + " consegue realizar a curva com PERFECT 100%");
        System.out.println("Porém, o " + k2.piloto.nome + " não possui as skills elevadas e acaba caindo da montanha mortal");
        System.out.println("Com isso, o " + k1.piloto.nome + " assume o primeiro lugar e vence a partida!");
        System.out.print(k1.piloto.nome + " diz: Eu sou o mestre do ");
        k1.fazerDrift();          
        
}}
