package butickets;

public class VIP extends Ingresso{
    
    protected String tamanhoAbada;
    
    @Override
    public void mostraInfos(){
        super.mostraInfos();
        System.out.println("TIPO INGRESSO: VIP");
        System.out.println("TAMANHO ABADA: " + this.tamanhoAbada);
    }

    public String getTamanhoAbada() {
        return tamanhoAbada;
    }
    
    
        
}
