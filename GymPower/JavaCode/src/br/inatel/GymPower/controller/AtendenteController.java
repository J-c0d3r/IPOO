package br.inatel.GymPower.controller;

import br.inatel.GymPower.DAO.AtendenteDAO;
import br.inatel.GymPower.model.Atendente;
import java.util.ArrayList;

public class AtendenteController {

    AtendenteDAO atDAO = new AtendenteDAO();

    public ArrayList<Atendente> buscaAtendentes() {
        ArrayList<Atendente> listaAt = new ArrayList();

        listaAt = atDAO.buscarAtendentes();

        return listaAt;
    }
}
