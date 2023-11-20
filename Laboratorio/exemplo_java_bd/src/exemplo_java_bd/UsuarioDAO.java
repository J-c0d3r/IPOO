package exemplo_java_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO 
{
    
    /***************** CONEXÃO COM O BANCO DE DADOS ************************/
    
    // objeto responsável pela conexão com o servidor do banco de dados
    Connection con;
    // objeto responsável por preparar as consultas dinâmicas
    PreparedStatement pst;
    // objeto responsável por executar as consultas estáticas
    Statement st;
    // objeto responsável por referenciar a tabela resultante da busca
    ResultSet rs;

    // NOME DO BANCO DE DADOS
    String database = "projeto";
    // URL: VERIFICAR QUAL A PORTA
    String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    // USUÁRIO
    String user = "root";
    // SENHA
    String password = "root";

    boolean sucesso = false;
    
    // Conectar ao banco de dados
    public void connectToDb() 
    {
        try 
        {  
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão feita com sucesso!");
        } 
        catch (SQLException ex) 
        {
             System.out.println("Erro: " + ex.getMessage());
        }
                
    }
    
     
    /************************ INSERIR DADOS *********************************/
    public boolean inserirUsuario(Usuario novoUsuario) 
    {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO usuario (nome,cpf) values (?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoUsuario.getNome()); //1- refere-se à primeira interrogação
            pst.setString(2, novoUsuario.getCpf());  //2- refere-se à segunda interrogação
                                                       //e assim por diante....
            pst.execute();
            sucesso = true;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        finally 
        {
            try 
            {   //Encerra a conexão
                con.close();
                pst.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    /************************ BUSCAR DADOS *********************************/
    public ArrayList<Usuario> buscarUsuariosSemFiltro() 
    {
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM usuario";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try 
        {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            System.out.println("Lista de usuarios: ");
            while(rs.next())
            {
                //System.out.println(rs.getString("nome"));
                Usuario usuarioTemp = new Usuario(rs.getString("nome"),rs.getString("cpf"));
                System.out.println("Nome = "+usuarioTemp.getNome());
                System.out.println("CPF = "+usuarioTemp.getCpf());
                System.out.println("---------------------------------");
                listaDeUsuarios.add(usuarioTemp);
            }
            sucesso = true;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        finally 
        {
            try 
            {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeUsuarios;
    }
    
    /************************ ATUALIZAR DADOS *********************************/
    public boolean atualizarNomeUsuario(int id, String novoNome) 
    {
        connectToDb();
        //Comando em SQL
        String sql = "UPDATE usuario SET nome=? WHERE id=?";
        
         //O comando recebe paramêtros -> consulta dinâmica (pst)
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoNome);
            pst.setInt(2, id);
            pst.execute();
            sucesso = true;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        finally 
        {
            try 
            {
                con.close();
                pst.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Erro = " + ex.getMessage());
            }

        }
        return sucesso;
    }
    
    /************************ DELETAR REGISTROS *******************************/
    public boolean deletarUsuario(int id) 
    {
        connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM usuario WHERE id=?";
        try 
        {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } 
        finally 
        {
            try 
            {
                con.close();
                pst.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }
}
