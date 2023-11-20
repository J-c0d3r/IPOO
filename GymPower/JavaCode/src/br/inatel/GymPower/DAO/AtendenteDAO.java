package br.inatel.GymPower.DAO;

import br.inatel.GymPower.model.Atendente;
import java.sql.SQLException;
import java.util.ArrayList;

public class AtendenteDAO extends ConexaoDAO {

    public ArrayList<Atendente> buscarAtendentes() {
        connectToDB();
        ArrayList<Atendente> listaAt = new ArrayList<>();

        String sql = "SELECT * FROM atendente";

        try {
            st = con.createStatement();

            rs = st.executeQuery(sql);
            while (rs.next()) {
                Atendente at = new Atendente();

                at.setMatricula(rs.getInt("matricula"));
                at.setSalario(rs.getFloat("salario"));
                at.setNome(rs.getString("Nome"));
                at.setDataNascimento(rs.getString("dataNascimento"));
                at.setTelefone(rs.getString("Telefone"));
                at.setCargo(rs.getString("Cargo"));
                at.setEnderecoBairro(rs.getString("EnderecoBairro"));
                at.setEnderecoRua(rs.getString("EnderecoRua"));
                at.setEmail(rs.getString("Email"));

                listaAt.add(at);
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

        return listaAt;

    }
}
