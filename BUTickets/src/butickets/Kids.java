package butickets;

public class Kids extends VIP {

    private String docResponsavel;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("TIPO INGRESSO: VIPKIDS");
        System.out.println("DOC. RESPONSAVEL: " + docResponsavel);
    }

    @Override
    public float calculaTotalIngresso() {
        return super.calculaTotalIngresso() / 2;
    }

//    public String getDocResponsavel() {
//        return docResponsavel;
//    }

    public void setDocResponsavel(String docResponsavel) {
        this.docResponsavel = docResponsavel;
    }

}
