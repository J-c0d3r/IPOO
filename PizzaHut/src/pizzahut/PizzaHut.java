package pizzahut;

public class PizzaHut {

    public static void main(String[] args) {
       
        Pepperoni p1 = new Pepperoni();                
        Brasileira p2 = new Brasileira();        
        Supreme p3 = new Supreme();        
        p1.preco = 15;
        p2.preco = 20;        
        p3.preco = 25;
        
        BH u1 = new BH();
        u1.endereco = "RuaBH";
        u1.nomeResponsavel = "Luke";
        u1.pizzas[0] = p1;
        u1.pizzas[1] = p3;
        
        RJ u2 = new RJ();
        u2.endereco = "Rua RJ";
        u2.nomeResponsavel = "Edward";
        u2.pizzas[0] = p1;
        u2.pizzas[1] = p2;
        
        SP u3 = new SP();
        u3.endereco = "Rua SP";
        u3.nomeResponsavel = "Yoda";
        u3.pizzas[0] = p1;
        u3.pizzas[1] = p2;
        u3.pizzas[2] = p3;
        
        System.out.println("PizzaHut LTDA.");
        System.out.println("Pizzas por Unidade:");
        u1.mostraPizzas();
        u2.mostraPizzas();
        u3.mostraPizzas();
        
        
        
    }
    
}
