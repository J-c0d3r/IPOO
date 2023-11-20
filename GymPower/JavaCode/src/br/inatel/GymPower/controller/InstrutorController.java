package br.inatel.GymPower.controller;

import br.inatel.GymPower.DAO.InstrutorDAO;
import br.inatel.GymPower.model.Instrutor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InstrutorController {

    InstrutorDAO profDAO = new InstrutorDAO();

    public Instrutor busca(Instrutor prof) {
        Instrutor profBusca = new Instrutor();

        try {
            profBusca = profDAO.buscarInstrutor(prof.getMatricula());
            profBusca.setAulas(profDAO.buscaAulasInstrutor(prof.getMatricula()));

        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar instrutor, verifique se a matrícula está correta");
        }
        return profBusca;
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

    public ArrayList<Instrutor> buscaInstrutores() {
        ArrayList<Instrutor> listaProf = new ArrayList();

        listaProf = profDAO.buscarInstrutores();

        return listaProf;
    }
}
