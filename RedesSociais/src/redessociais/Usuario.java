package redessociais;

public class Usuario {

    private String nome;
    private String email;

    private RedeSocial[] redes;

    public Usuario(RedeSocial[] redesSociais) {
        redes = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedes() {
        return redes;
    }

}
