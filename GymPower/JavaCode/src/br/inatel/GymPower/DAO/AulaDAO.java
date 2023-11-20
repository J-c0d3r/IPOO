package br.inatel.GymPower.DAO;

import br.inatel.GymPower.model.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class AulaDAO extends ConexaoDAO {

    boolean sucesso = false;

    public boolean cadastrarAlunoAula(Aluno aluno, Aula aula) {

        connectToDB();
        String sql = "INSERT INTO AlunoAula (alunoMatricula, aulaNome) values (?, ?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, aluno.getMatricula());
            pst.setString(2, aula.getNome());

            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    //Cadastrar professor na aula
    public boolean cadastrarInstrutorAula(Instrutor instrutor, Aula aula) {

        connectToDB();

        String sql = "UPDATE Aula SET instrutorMatricula = ? WHERE aula.nome = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, instrutor.getMatricula());
            pst.setString(2, aula.getNome());

            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    //Buscar todas as aulas
    public ArrayList<Aula> buscarNomes() {
        connectToDB();
        ArrayList<Aula> listaAulas = new ArrayList<>();

        String sql = "SELECT nome, tipoAula FROM aula";

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);
            while (rs.next()) {
                Aula aula;
                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    aula = new Bale();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    aula = new Musculacao();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    aula = new KungFu();
                } else {
                    aula = new Natacao();
                }
                aula.setNome(rs.getString("Nome"));
                listaAulas.add(aula);
            }
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return listaAulas;
    }

    //Retornar a quantidade de vagas de uma aula
    public Aula buscarAula(String nome) {

        Aula aula = null;
        connectToDB();

        String sql = "SELECT * FROM Aula WHERE nome = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery(); //Recebendo resultado

            while (rs.next()) {
                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    aula = new Bale();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    aula = new Musculacao();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    aula = new KungFu();
                } else {
                    aula = new Natacao();
                }
                aula.setNome(rs.getString("nome"));
                System.out.println("Nome: " + aula.getNome());
                aula.setHoraInicio(calcFuso(rs.getString("horaInicio")));
                aula.setDiaSemana(rs.getString("diaSemana"));
                aula.setInstrutorMatricula(rs.getInt("instrutorMatricula"));
                aula.setQtdAlunos(rs.getInt("qtdAlunos"));
                aula.setQtdMaxAlunos(rs.getInt("qtdMaxAlunos"));
                aula.setQtdVagas(rs.getInt("qtdVagas"));
                aula.setSala(rs.getString("sala"));
                aula.setTipoAula(rs.getString("tipoAula"));
                aula.setNome(rs.getString("nome"));
            }

        } catch (SQLException exc) {
            System.out.println("1Erro: " + exc.getMessage());
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println("2Erro: " + e.getMessage());
            }
        }

        return aula;
    }

    public ArrayList<Aula> buscarAulasProf(int id) {

        ArrayList<Aula> lista = new ArrayList();
        Aula aula = null;
        connectToDB();

        String sql = "SELECT nome,tipoAula FROM aula where aula.instrutorMatricula = " + String.valueOf(id);

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    aula = new Bale();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    aula = new Musculacao();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    aula = new KungFu();
                } else {
                    aula = new Natacao();
                }
                aula.setNome(rs.getString("nome"));
                lista.add(aula);
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return lista;
    }

    public String calcFuso(String horaInicio) {
        String nova;
        String[] horaCompleta = horaInicio.split(":");
        int hora = Integer.parseInt(horaCompleta[0]) + 3;

        nova = hora + "" + ":" + horaCompleta[1] + ":" + horaCompleta[2];

        return nova;
    }

    public ArrayList<Aula> buscarAulas() {

        ArrayList<Aula> lista = new ArrayList();
        Aula aula = null;
        connectToDB();

        String sql = "select *, instrutor.nome as InsNome from aula, instrutor where aula.instrutorMatricula = instrutor.matricula";

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    aula = new Bale();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    aula = new Musculacao();
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    aula = new KungFu();
                } else {
                    aula = new Natacao();
                }
                aula.setNome(rs.getString("nome"));
                aula.setHoraInicio(calcFuso(rs.getString("horaInicio")));
                aula.setDiaSemana(rs.getString("diaSemana"));
                aula.setInstrutorMatricula(rs.getInt("instrutorMatricula"));
                aula.setInstrutorNome(rs.getString("InsNome"));
                aula.setQtdAlunos(rs.getInt("qtdAlunos"));
                aula.setQtdMaxAlunos(rs.getInt("qtdMaxAlunos"));
                aula.setQtdVagas(rs.getInt("qtdVagas"));
                aula.setSala(rs.getString("sala"));
                aula.setTipoAula(rs.getString("tipoAula"));
                aula.setNome(rs.getString("nome"));

                if (rs.getString("tipoAula").compareToIgnoreCase("Bale") == 0) {
                    Bale aulaAux = (Bale) aula;
                    aulaAux.setNumBarras(rs.getInt("NumBarras"));
                    aulaAux.setNumParedesEspelhadas(rs.getInt("NumParedesEspelhadas"));
                    lista.add(aulaAux);
                } else if (rs.getString("tipoAula").compareToIgnoreCase("Crossfit") == 0) {
                    Musculacao aulaAux = (Musculacao) aula;
                    lista.add(aulaAux);
                } else if (rs.getString("tipoAula").compareToIgnoreCase("KungFu") == 0) {
                    KungFu aulaAux = (KungFu) aula;
                    aulaAux.setTipo(rs.getString("tipoKungFu"));
                    lista.add(aulaAux);
                } else {
                    Natacao aulaAux = (Natacao) aula;
                    aulaAux.setTamPiscina(rs.getString("tamPiscina"));
                    lista.add(aulaAux);
                }

            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return lista;
    }

    public boolean removeAlunoAula(int id, String nomeAula) {

        connectToDB();
        String sql = "DELETE FROM AlunoAula WHERE alunoMatricula = ? and aulaNome = ?";

        try {

            pst = con.prepareStatement(sql);

            pst.setInt(1, id);
            pst.setString(2, nomeAula);

            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public boolean removeProfessor(int id, String nomeAula) {
        connectToDB();

        String sql = "UPDATE Aula SET instrutorMatricula = NULL WHERE nome = ? and instrutorMatricula = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, nomeAula);
            pst.setInt(2, id);

            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
}
