package br.inatel.GymPower.model;

public abstract class Aula {

    protected String nome;
    protected String horaInicio;
    protected int qtdAlunos;
    protected int qtdMaxAlunos;
    protected int qtdVagas;
    protected String diaSemana;
    protected String sala;
    protected String tipoAula;
    protected Instrutor prof;

    protected int instrutorMatricula;
    protected String instrutorNome;

    public String getInstrutorNome() {
        return instrutorNome;
    }

    public void setInstrutorNome(String instrutorNome) {
        this.instrutorNome = instrutorNome;
    }

    public Instrutor getProf() {
        return prof;
    }

    public void setProf(Instrutor prof) {
        this.prof = prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(int qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getInstrutorMatricula() {
        return instrutorMatricula;
    }

    public void setInstrutorMatricula(int instrutorMatricula) {
        this.instrutorMatricula = instrutorMatricula;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

}
