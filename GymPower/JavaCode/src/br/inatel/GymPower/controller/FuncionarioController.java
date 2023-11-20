package br.inatel.GymPower.controller;

import br.inatel.GymPower.model.Atendente;
import br.inatel.GymPower.model.Funcionario;
import br.inatel.GymPower.model.Instrutor;
import java.util.ArrayList;

public class FuncionarioController {

    public ArrayList<Funcionario> buscaFuncionarios() {
        ArrayList<Funcionario> lista = new ArrayList();
        AtendenteController atController = new AtendenteController();
        InstrutorController profController = new InstrutorController();

        ArrayList<Instrutor> listaProf = profController.buscaInstrutores();
        ArrayList<Atendente> listaAt = atController.buscaAtendentes();

        for (int i = 0; i < listaProf.size(); i++) {
            lista.add(listaProf.get(i));
        }
        for (int i = 0; i < listaAt.size(); i++) {
            lista.add(listaAt.get(i));
        }

        return lista;
    }
}
