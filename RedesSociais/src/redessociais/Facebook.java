package redessociais;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no FACEBOOK!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no FACEBOOK!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no FACEBOOK!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("FACEBOOK!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferência no FACEBOOK!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no FACEBOOK!");
    }

}
