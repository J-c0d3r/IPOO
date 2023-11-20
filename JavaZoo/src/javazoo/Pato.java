package javazoo;

public class Pato extends Animal{
    
    private float tamanhoBico;
        
    @Override
    public void fazBarulho(){
        System.out.println("Cuaq Cuaq");
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }        
    
}
