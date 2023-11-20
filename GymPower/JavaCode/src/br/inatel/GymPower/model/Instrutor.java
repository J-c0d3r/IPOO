package br.inatel.GymPower.model;

import java.util.ArrayList;

public class Instrutor extends Funcionario {

    protected int qtdAulas;
    protected float salarioAjustado;
    protected ArrayList<Aula> aulas = new ArrayList<>();

    public Instrutor() {
        this.salario = 1500.00f;
        this.cargo = "Instrutor";
        this.qtdAulas = 0;
        this.salarioAjustado = this.salario;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public float getSalarioAjustado() {
        return salarioAjustado;
    }

    public void setSalarioAjustado(float salarioAjustado) {
        this.salarioAjustado = salarioAjustado;
    }

}
