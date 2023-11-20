package butickets;

public class Camarote extends Ingresso{
    
    private String tamanhoCamiseta;

    @Override
    public void mostraInfos(){
        super.mostraInfos();
        System.out.println("TIPO DE INGRESSO: CAMAROTE");
        System.out.println("TAMANHO CAMISETA: " + tamanhoCamiseta);
    }
        
//    public String getTamanhoCamiseta() {
//        return tamanhoCamiseta;
//    }

    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }        
    
}
