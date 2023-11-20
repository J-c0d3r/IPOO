package projetoaula1;

public class Trabalhador {

    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;

    public void recebeAumento(float valor) {
        salario = salario + valor;
    }

    public float calculaGanhoAnual() {

        return salario * 13;
    }

    public void mostraInfosFuncionario() {

        System.out.println(nome);
        System.out.println(profissao);
        System.out.println(salario);
        System.out.println(rg);
        System.out.println(dataNascimento);

    }

}
