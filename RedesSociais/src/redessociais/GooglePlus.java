package redessociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GOOGLEPLUS!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GOOGLEPLUS!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GOOGLEPLUS!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("GOOGLEPLUS!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferência no GOOGLEPLUS!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no GOOGLEPLUS!");
    }

}
