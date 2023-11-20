package redessociais;

public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no TWITTER!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no TWITTER!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no TWITTER!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("TWITTER!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no TWITTER!");
    }

}
