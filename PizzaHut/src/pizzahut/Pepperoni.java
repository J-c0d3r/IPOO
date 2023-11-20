package pizzahut;

public class Pepperoni extends Pizza {

    @Override
    public void mostraIngredientes() {
        System.out.println("Pepperoni: Pepperoni e Mussarela");
    }

    @Override
    public String mostraBrinde() {
        return "Caneta";
    }

}
