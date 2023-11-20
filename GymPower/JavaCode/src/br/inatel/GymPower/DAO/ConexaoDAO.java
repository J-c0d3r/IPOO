package br.inatel.GymPower.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConexaoDAO {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    String database = "GymPower";
    String url = "jdbc:mysql://localhost:1433/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "Projetos";

    //Método que conecta com o banco
    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão concluída!");
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }

}
