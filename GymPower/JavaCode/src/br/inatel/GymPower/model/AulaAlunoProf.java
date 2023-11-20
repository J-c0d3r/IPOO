package br.inatel.GymPower.model;

public class AulaAlunoProf {

    public Aula aula;
    public Aluno aluno;
    public Instrutor instrutor;

    public AulaAlunoProf() {
        aluno = new Aluno();
        instrutor = new Instrutor();
    }

}
