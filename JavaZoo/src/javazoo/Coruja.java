package javazoo;

public class Coruja extends Animal{
    
    private int alturaVoo;
    
    @Override
    public void fazBarulho(){        
        System.out.println("pru pru");
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }           
    
}
