package br.inatel.GymPower.DAO;

import br.inatel.GymPower.model.Aluno;
import br.inatel.GymPower.model.Aula;
import br.inatel.GymPower.model.Bale;
import br.inatel.GymPower.model.Instrutor;
import br.inatel.GymPower.model.KungFu;
import br.inatel.GymPower.model.Musculacao;
import br.inatel.GymPower.model.Natacao;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO extends ConexaoDAO {

    boolean sucesso = false;

    public boolean inserirAluno(Aluno aluno) {

        //Conectando
        connectToDB();
        //Comando
        String sql = "INSERT INTO Aluno(nome, dataNascimento, idade, mensalidade, telefone, qtdAulas, "
                + "enderecoBairro, enderecoRua) VALUES (?,STR_TO_DATE(?,\"%d-%m-%Y\"),?,?,?,?,?,?)";

        try {
            //Preparar a declaração antes de enviar os dados
            pst = con.prepareStatement(sql);
            //Preenchendo dados
            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getDataNascimento());
            pst.setInt(3, aluno.getIdade());
            pst.setFloat(4, aluno.getMensalidade());
            pst.setString(5, aluno.getTelefone());
            pst.setInt(6, aluno.getQtdAulas());
            pst.setString(7, aluno.getEnderecoBairro());
            pst.setString(8, aluno.getEnderecoRua());

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

    public boolean atualizarAluno(Aluno aluno) {

        connectToDB();

        String sql = "UPDATE Aluno SET nome = ?, dataNascimento = STR_TO_DATE(?,\"%d-%m-%Y\"), idade = ?, mensalidade = ?,"
                + " telefone = ?, qtdAulas = ?, enderecoBairro = ?, enderecoRua = ? WHERE matricula = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, aluno.getNome());
            pst.setString(2, aluno.getDataNascimento());
            pst.setInt(3, aluno.getIdade());
            pst.setFloat(4, aluno.getMensalidade());
            pst.setString(5, aluno.getTelefone());
            pst.setInt(6, aluno.getQtdAulas());
            pst.setString(7, aluno.getEnderecoBairro());
            pst.setString(8, aluno.getEnderecoRua());

            pst.setInt(9, aluno.getMatricula());

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

    public boolean deletarAluno(int id) {
        connectToDB();
        String sql = "DELETE FROM Aluno WHERE matricula = ?";

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
    public Aluno buscarAluno(int id) {

        Aluno aluno = null;

        connectToDB();
        String sql = "SELECT * FROM Aluno where matricula = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery(); //Recebendo resultado

            while (rs.next()) { //Percorrer os objetos
                String auxNome = rs.getString("nome");

                if (auxNome.isEmpty()) {
                    sucesso = false;
                } else {
                    aluno = new Aluno();

                    aluno.setMatricula(rs.getInt("Matricula"));
                    aluno.setNome(rs.getString("Nome"));
                    aluno.setDataNascimento(rs.getString("DataNascimento"));
                    aluno.setIdade(rs.getInt("Idade"));
                    aluno.setMensalidade(rs.getFloat("Mensalidade"));
                    aluno.setTelefone(rs.getString("Telefone"));
                    aluno.setQtdAulas(rs.getInt("QtdAulas"));
                    aluno.setEnderecoBairro(rs.getString("EnderecoBairro"));
                    aluno.setEnderecoRua(rs.getString("EnderecoRua"));
                    aluno.setParceiroMatricula(rs.getInt("ParceiroMatricula"));

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

        return aluno;
    }

    //Buscando aulas em que o aluno está cadastrado
    public ArrayList<Aula> buscaAulasAluno(int id) {
        connectToDB();
        ArrayList<Aula> listaAulas = new ArrayList<>();

        String sql = "select al.nome as \"Aluno\", au.nome as \"Aula\", au.horaInicio, au.diaSemana, au.sala, au.tipoAula from Aluno as al\n"
                + "inner join AlunoAula as aa on al.matricula = aa.alunoMatricula\n"
                + "inner join Aula as au on aa.aulaNome = au.Nome\n"
                + "and al.matricula = " + String.valueOf(id);

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

    //Cadastrar parceiro 
    public boolean cadastraParceiro(int id, int idParceiro) {
        connectToDB();
        String sql = "UPDATE Aluno set parceiroMatricula = ? WHERE matricula = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(2, id);
            pst.setInt(1, idParceiro);

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

    //Retornando id do parceiro
    public int procuraParceiro(int id) {
        int idParceiro = 0;

        connectToDB();
        String sql = "SELECT parceiroMatricula, nome FROM Aluno where matricula = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery(); //Recebendo resultado

            while (rs.next()) { //Percorrer os objetos
                String auxNome = rs.getString("nome");

                if (auxNome.isEmpty()) {
                    sucesso = false;
                } else {
                    idParceiro = rs.getInt("parceiroMatricula");
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

        return idParceiro;
    }

    public boolean atualizarMensalidade(Aluno aluno) {

        connectToDB();

        String sql = "UPDATE Aluno SET mensalidade = ? WHERE matricula = ?";

        try {
            pst = con.prepareStatement(sql);

            pst.setFloat(1, aluno.getMensalidade());
            pst.setInt(2, aluno.getMatricula());

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
