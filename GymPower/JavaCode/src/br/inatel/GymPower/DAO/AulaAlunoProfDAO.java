package br.inatel.GymPower.DAO;

import br.inatel.GymPower.model.Aluno;
import br.inatel.GymPower.model.Aula;
import br.inatel.GymPower.model.AulaAlunoProf;
import br.inatel.GymPower.model.Bale;
import br.inatel.GymPower.model.Instrutor;
import br.inatel.GymPower.model.KungFu;
import br.inatel.GymPower.model.Musculacao;
import br.inatel.GymPower.model.Natacao;
import java.sql.SQLException;
import java.util.ArrayList;

public class AulaAlunoProfDAO extends ConexaoDAO {

    boolean sucesso = false;

    public ArrayList<AulaAlunoProf> buscaAulaAlunoProf(int id) {
        ArrayList<AulaAlunoProf> listaGeral = new ArrayList();
        AulaDAO aulaDAO = new AulaDAO();

        connectToDB();

        String sql = "select * from alunoAulaProfessor WHERE AlunoMatricula = " + String.valueOf(id);

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);

            while (rs.next()) {
                AulaAlunoProf aap = new AulaAlunoProf();

                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    aap.aula = new Bale();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    aap.aula = new Musculacao();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    aap.aula = new KungFu();
                } else {
                    aap.aula = new Natacao();
                }
                aap.aula.setNome(rs.getString("NomeAula"));
                aap.aula.setHoraInicio(aulaDAO.calcFuso(rs.getString("horaInicio")));
                aap.aula.setDiaSemana(rs.getString("diaSemana"));
                aap.aula.setSala(rs.getString("sala"));
                aap.aula.setTipoAula(rs.getString("tipoAula"));

                aap.instrutor.setNome(rs.getString("NomeProf"));

                aap.aluno.setNome(rs.getString("NomeAluno"));

                listaGeral.add(aap);

            }

        } catch (SQLException exc) {
            System.out.println("1Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("2Erro: " + e.getMessage());
            }
        }

        return listaGeral;
    }
}
