package br.inatel.GymPower.model;

import java.util.ArrayList;

public class Aluno {

    private int matricula;
    private String nome;
    private String dataNascimento;
    private int idade;
    private float mensalidade;
    private String telefone;
    private int qtdAulas;
    private String enderecoBairro;
    private String enderecoRua;
    private int parceiroMatricula;

    ArrayList<Aula> aulas = new ArrayList<>();

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    //Construtor
    public Aluno() {
        this.setMensalidade(0.00f);
        this.setQtdAulas(0);
        this.setParceiroMatricula(0);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public int getParceiroMatricula() {
        return parceiroMatricula;
    }

    public void setParceiroMatricula(int parceiroMatricula) {
        this.parceiroMatricula = parceiroMatricula;
    }

}
