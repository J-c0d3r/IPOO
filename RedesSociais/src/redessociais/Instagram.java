package redessociais;

public class Instagram extends RedeSocial {

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no INSTAGRAM!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no INSTAGRAM!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no INSTAGRAM!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("INSTAGRAM!");
    }

}
