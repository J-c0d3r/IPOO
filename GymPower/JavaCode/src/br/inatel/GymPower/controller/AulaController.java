package br.inatel.GymPower.controller;

import br.inatel.GymPower.DAO.AlunoDAO;
import br.inatel.GymPower.DAO.AulaDAO;
import br.inatel.GymPower.model.Aluno;
import br.inatel.GymPower.model.Aula;
import br.inatel.GymPower.model.Instrutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AulaController {

    public Aula buscarAula(String nome) {
        AulaDAO aulaDAO = new AulaDAO();
        Aula aula = null;
        try {
            aula = aulaDAO.buscarAula(nome);
        } catch (Exception ex) {
        }

        return aula;
    }

    public ArrayList<Aula> buscaAulas() {

        ArrayList<Aula> lista = new ArrayList();

        try {
            AulaDAO aulaDAO = new AulaDAO();

            lista = aulaDAO.buscarNomes();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar aulas");
        }

        return lista;
    }

    public ArrayList<Aula> buscaAulasProf(int matricula) {

        ArrayList<Aula> lista = new ArrayList();

        try {
            AulaDAO aulaDAO = new AulaDAO();

            lista = aulaDAO.buscarAulasProf(matricula);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar aulas");
        }

        return lista;
    }

    public boolean cadastraAluno(Aluno aluno, Aula aula) {

        boolean cadastro = false;

        try {
            AulaDAO aulaDAO = new AulaDAO();
            aulaDAO.cadastrarAlunoAula(aluno, aula);
            JOptionPane.showMessageDialog(null, "Aluno " + aluno.getMatricula() + " cadastrado na aula " + aula.getNome());
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno na aula");
        }

        return cadastro;
    }

    public boolean cadastraProf(Instrutor prof, Aula aula) {
        boolean cadastro = false;

        try {
            AulaDAO aulaDAO = new AulaDAO();
            aulaDAO.cadastrarInstrutorAula(prof, aula);
            JOptionPane.showMessageDialog(null, "Instrutor " + prof.getMatricula() + " cadastrado na aula " + aula.getNome());
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar instrutor na aula");
        }

        return cadastro;
    }

    public boolean verificaVagas(Aula aula) {
        AulaDAO aulaDao = new AulaDAO();

        Aula aulaAux = aulaDao.buscarAula(aula.getNome());

        //true se tiver vagas
        if (aulaAux.getQtdVagas() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean verificaAlunoAula(Aluno aluno, Aula aula) {
        AlunoDAO alunoDAO = new AlunoDAO();
        ArrayList<Aula> listaAulas = alunoDAO.buscaAulasAluno(aluno.getMatricula());

        for (int i = 0; i < listaAulas.size(); i++) {
            if (aula.getNome().equals(listaAulas.get(i).getNome())) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Aula> buscaTodasAulas() {
        ArrayList<Aula> lista = new ArrayList();
        AulaDAO aulaDAO = new AulaDAO();
        try {
            lista = aulaDAO.buscarAulas();
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar provas!!!");
        }

        return lista;
    }

}
