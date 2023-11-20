package exemplo_java_bd;

import java.util.ArrayList;

public class Exemplo_java_bd 
{
    public static void main(String[] args) 
    {
        UsuarioDAO dao = new UsuarioDAO();
        //dao.connectToDb();
        
        
        /*Usuario novoUsuario = new Usuario("Mari","11111");
        if(dao.inserirUsuario(novoUsuario))
        {
            System.out.println("Inserção feita com sucesso!");
        }
        novoUsuario = new Usuario("Pedro","22222");
        if(dao.inserirUsuario(novoUsuario))
        {
            System.out.println("Inserção feita com sucesso!");
        }
        novoUsuario = new Usuario("Enzo","33333");
        if(dao.inserirUsuario(novoUsuario))
        {
            System.out.println("Inserção feita com sucesso!");
        }
        novoUsuario = new Usuario("Ana","44444");
        if(dao.inserirUsuario(novoUsuario))
        {
            System.out.println("Inserção feita com sucesso!");
        }*/
      ArrayList<Usuario> listaDeUsuarios = dao.buscarUsuariosSemFiltro();
      // dao.atualizarNomeUsuario(3, "Renzo");
      dao.deletarUsuario(4);
       listaDeUsuarios = dao.buscarUsuariosSemFiltro();
    }
    
}
