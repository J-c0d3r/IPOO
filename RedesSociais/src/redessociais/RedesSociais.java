package redessociais;

public class RedesSociais {

    public static void main(String[] args) {

        Facebook face = new Facebook();
        Twitter twitter = new Twitter();

        face.numAmigos = 400;
        face.senha = "jorjinhodoFace35";

        twitter.numAmigos = 20;
        twitter.senha = "passarinhoAzul";

        RedeSocial[] redes = new RedeSocial[2];

        redes[0] = face;
        redes[1] = twitter;

        Usuario user1 = new Usuario(redes);

        user1.setNome("Javinha");
        user1.setEmail("javinha@gmail.com");

        System.out.println("Nome: " + user1.getNome());
        System.out.println("Email: " + user1.getEmail());
        
        RedeSocial[] redes2 = user1.getRedes();
        
        redes2[0].postarFoto();
        redes2[0].postarVideo();
        Facebook aux = (Facebook) redes2[0];
        aux.fazStreaming();
        
        redes2[1].postarComentario();
        redes2[1].curtirPublicacao();
        Twitter aux2 = (Twitter) redes2[1];
        aux2.compartilhar();

    }

}
