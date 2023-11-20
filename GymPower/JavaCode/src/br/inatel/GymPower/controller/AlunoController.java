package br.inatel.GymPower.controller;

import br.inatel.GymPower.DAO.AlunoDAO;
import br.inatel.GymPower.model.Aluno;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class AlunoController {

    AlunoDAO alunoDAO = new AlunoDAO();

    public boolean calcIdade(Aluno aluno) {
        boolean sucesso = false;
        String[] dataCompleta = aluno.getDataNascimento().split("-");
        int ano, mes, dia;

        ano = Integer.parseInt(dataCompleta[2]);
        mes = Integer.parseInt(dataCompleta[1]);
        dia = Integer.parseInt(dataCompleta[0]);

        try {
            LocalDate l1 = LocalDate.of(ano, mes, dia);
            LocalDate now1 = LocalDate.now();
            Period diff1 = Period.between(l1, now1);
            aluno.setIdade(diff1.getYears());
            sucesso = true;

        } catch (DateTimeException exc) {
            JOptionPane.showMessageDialog(null, "Data inválida, por favor entre com a data no formato dd-mm-aaaa");
            sucesso = false;
        }
        return sucesso;
    }

    public void cadastraParceiro(Aluno aluno, Aluno parceiro) {
        try {
            //Verificar se ambos não contém parceiros cadastrados
            if (alunoDAO.procuraParceiro(aluno.getMatricula()) == 0 && alunoDAO.procuraParceiro(parceiro.getMatricula()) == 0) {
                alunoDAO.cadastraParceiro(aluno.getMatricula(), parceiro.getMatricula());
                alunoDAO.cadastraParceiro(parceiro.getMatricula(), aluno.getMatricula());
                JOptionPane.showMessageDialog(null, aluno.getMatricula() + " e " + parceiro.getMatricula() + " são parceiros agora");
                this.calcMensalidade(aluno.getMatricula());
                this.calcMensalidade(parceiro.getMatricula());
            } else {
                JOptionPane.showMessageDialog(null, "Um dos alunos já possui parceiro");
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar parceria: " + exc.getMessage());
        }
    }

    public void inserir(Aluno aluno) {
        try {
            alunoDAO.inserirAluno(aluno);
            JOptionPane.showMessageDialog(null, aluno.getNome() + " inserido com sucesso!!!");
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + exc.getMessage());
        }
    }

    public void atualiza(Aluno aluno) {
        try {
            alunoDAO.atualizarAluno(aluno);
            JOptionPane.showMessageDialog(null, aluno.getNome() + " atualizado com sucesso!!!");
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + exc.getMessage());
        }
    }

    public void exclui(Aluno aluno) {
        try {
            alunoDAO.deletarAluno(aluno.getMatricula());
            System.out.println("Remoção feita com sucesso");
        } catch (Exception exc) {
            System.out.println("Erro ao deletar aluno: " + exc.getMessage());
        }
    }

    public Aluno busca(Aluno aluno) {
        Aluno alunoBusca = null;
        try {
            alunoBusca = new Aluno();
            alunoBusca = alunoDAO.buscarAluno(aluno.getMatricula());
            alunoBusca.setAulas(alunoDAO.buscaAulasAluno(aluno.getMatricula()));
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar aluno, verifique se a matrícula está correta");
        }
        return alunoBusca;
    }

    public String getData(String data) {
        String novaData;
        String[] dataCompleta = data.split("-");
        String ano, mes, dia;

        ano = dataCompleta[0];
        mes = dataCompleta[1];
        dia = dataCompleta[2];

        novaData = dia + '-' + mes + '-' + ano;
        return novaData;
    }

    public int verificaMatricula(String matriculaTexto) {

        int matricula = -1;

        try {
            matricula = Integer.parseInt(matriculaTexto);
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(null, "A matrícula não é um número válido");
        }

        return matricula;
    }

    public void calcMensalidade(int id) {
        float mensalidade;

        Aluno aux = new Aluno();
        aux.setMatricula(id);
        Aluno aluno = this.busca(aux);

        mensalidade = aluno.getQtdAulas() * 50;
        System.out.println("Mensalidade: " + mensalidade);
        if (aluno.getParceiroMatricula() != 0) {
            mensalidade = mensalidade * 0.9f;
        }
        System.out.println("Mensalidade P: " + mensalidade);
        aluno.setMensalidade(mensalidade);
        System.out.println("Mensalidade set: " + aluno.getMensalidade());
        try {
            alunoDAO.atualizarMensalidade(aluno);
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar mensalidade: " + exc.getMessage());
        }

    }

}
