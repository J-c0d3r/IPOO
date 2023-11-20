package threadcontagem;

public class Main_ThreadContagem {

    public static void main(String[] args) {
        
        //criando 2 thread
        ThreadContagem tc1 = new ThreadContagem();
        tc1.numero = 1;
        
        ThreadContagem tc2 = new ThreadContagem();
        tc2.numero = 2;
        
        //pedindo para a thread executar
        tc1.start();
        tc2.start();
        
    }
    
}
