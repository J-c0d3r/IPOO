package competicaomusical_av2;

public abstract class Musico {

    protected static int contador = 0;

    protected int codigo;
    protected String nome;
    protected int idade;
    protected String musica;
    protected int pontuacao = 100;

    protected Instrumento instrumento;

    Musico() {

        contador++;
        codigo = contador;

    }

    public abstract void tocar();

    public void mostraInfo() {

        System.out.println("ID: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Musica: " + musica);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Informações do instrumento:");
        System.out.println("->Modelo: " + instrumento.getModelo());
        System.out.println("->Cor: " + instrumento.getCor());
        System.out.println("->Ano: " + instrumento.getAno());

    }

}
