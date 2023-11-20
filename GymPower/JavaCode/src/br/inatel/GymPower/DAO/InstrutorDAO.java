package br.inatel.GymPower.DAO;

import br.inatel.GymPower.model.Aula;
import br.inatel.GymPower.model.Bale;
import br.inatel.GymPower.model.Instrutor;
import br.inatel.GymPower.model.KungFu;
import br.inatel.GymPower.model.Musculacao;
import br.inatel.GymPower.model.Natacao;
import java.sql.SQLException;
import java.util.ArrayList;

public class InstrutorDAO extends ConexaoDAO {

    boolean sucesso = false;

    public boolean inserirInstrutor(Instrutor instrutor) {

        //Conectando
        connectToDB();
        //Comando
        String sql = "INSERT INTO Instrutor(nome, salario, dataNascimento, telefone, cargo, "
                + "enderecoBairro, enderecoRua, email, qtdAulas, salarioAjustado) VALUES (?,?,STR_TO_DATE(?,\"%d-%m-%Y\"),?,?,?,?,?,?,?)";

        try {
            //Preparar a declaração antes de enviar os dados
            pst = con.prepareStatement(sql);
            //Preenchendo dados
            pst.setString(1, instrutor.getNome());
            pst.setFloat(2, instrutor.getSalario());
            pst.setString(3, instrutor.getDataNascimento());
            pst.setString(4, instrutor.getTelefone());
            pst.setString(5, instrutor.getCargo());
            pst.setString(6, instrutor.getEnderecoBairro());
            pst.setString(7, instrutor.getEnderecoRua());
            pst.setString(8, instrutor.getEmail());
            pst.setInt(9, instrutor.getQtdAulas());
            pst.setFloat(10, instrutor.getSalarioAjustado());

            //Executado
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            //Fechar conexão
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public boolean atualizarInstrutor(Instrutor instrutor) {

        //Conectando
        connectToDB();
        //Comando
        String sql = "UPDATE Instrutor set nome = ?, salario = ?, dataNascimento = STR_TO_DATE(?,\"%d-%m-%Y\"), telefone = ?, cargo = ?, "
                + "enderecoBairro = ?, enderecoRua = ?, email = ?, qtdAulas = ?, salarioAjustado = ? WHERE matricula = ?";

        try {
            //Preparar a declaração antes de enviar os dados
            pst = con.prepareStatement(sql);
            //Preenchendo dados
            pst.setString(1, instrutor.getNome());
            pst.setFloat(2, instrutor.getSalario());
            pst.setString(3, instrutor.getDataNascimento());
            pst.setString(4, instrutor.getTelefone());
            pst.setString(5, instrutor.getCargo());
            pst.setString(6, instrutor.getEnderecoBairro());
            pst.setString(7, instrutor.getEnderecoRua());
            pst.setString(8, instrutor.getEmail());
            pst.setInt(9, instrutor.getQtdAulas());
            pst.setFloat(10, instrutor.getSalarioAjustado());

            pst.setInt(11, instrutor.getMatricula());

            //Executado
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            //Fechar conexão
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    public boolean deletarInstrutor(int id) {
        connectToDB();
        String sql = "DELETE FROM Instrutor WHERE matricula = ?";

        try {

            pst = con.prepareStatement(sql);

            pst.setInt(1, id);

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

    //Buscando informações de alunos
    public Instrutor buscarInstrutor(int id) {

        Instrutor instrutor = null;

        connectToDB();
        String sql = "SELECT * FROM Instrutor where matricula = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery(); //Recebendo resultado

            while (rs.next()) { //Percorrer os objetos
                String auxNome = rs.getString("nome");

                if (auxNome.isEmpty()) {
                    sucesso = false;
                } else {
                    instrutor = new Instrutor();

                    instrutor.setMatricula(rs.getInt("Matricula"));
                    instrutor.setNome(rs.getString("Nome"));
                    instrutor.setSalario(rs.getFloat("salario"));
                    instrutor.setSalarioAjustado(rs.getFloat("salarioAjustado"));
                    instrutor.setDataNascimento(rs.getString("DataNascimento"));
                    instrutor.setTelefone(rs.getString("Telefone"));
                    instrutor.setCargo(rs.getString("cargo"));
                    instrutor.setEnderecoBairro(rs.getString("EnderecoBairro"));
                    instrutor.setEnderecoRua(rs.getString("EnderecoRua"));
                    instrutor.setEmail(rs.getString("email"));
                    instrutor.setQtdAulas(rs.getInt("QtdAulas"));

                }
            }
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                pst.close();
                con.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return instrutor;
    }

    //Buscando aulas em que o aluno está cadastrado
    public ArrayList<Aula> buscaAulasInstrutor(int id) {
        connectToDB();
        ArrayList<Aula> listaAulas = new ArrayList<>();

        String sql = "select au.nome as \"Aula\", au.diaSemana, au.horaInicio, au.sala, au.tipoAula from instrutor as i\n"
                + "inner join Aula as au on au.instrutorMatricula = i.matricula\n"
                + "and i.matricula = '2'";

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
                aula.setNome(rs.getString("Aula"));
                aula.setHoraInicio(rs.getString("horaInicio"));
                aula.setDiaSemana(rs.getString("diaSemana"));
                aula.setSala(rs.getString("sala"));
                aula.setTipoAula(rs.getString("tipoAula"));
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

    public ArrayList<Instrutor> buscarInstrutores() {
        connectToDB();
        ArrayList<Instrutor> listaProf = new ArrayList<>();

        String sql = "SELECT * FROM instrutor";

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);
            while (rs.next()) {
                Instrutor prof = new Instrutor();

                prof.setMatricula(rs.getInt("matricula"));
                prof.setQtdAulas(rs.getInt("qtdAulas"));
                prof.setSalario(rs.getFloat("salario"));
                prof.setSalarioAjustado(rs.getFloat("salarioAjustado"));
                prof.setNome(rs.getString("Nome"));
                prof.setDataNascimento(rs.getString("dataNascimento"));
                prof.setTelefone(rs.getString("Telefone"));
                prof.setCargo(rs.getString("Cargo"));
                prof.setEnderecoBairro(rs.getString("EnderecoBairro"));
                prof.setEnderecoRua(rs.getString("EnderecoRua"));
                prof.setEmail(rs.getString("Email"));

                listaProf.add(prof);
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

        return listaProf;

    }

}
