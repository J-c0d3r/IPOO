package composicao;

public class Principal {

    public static void main(String[] args) {
        
        //2. fazendo uma composição
        //A. criando o objeto do todo
        
        Empresa emp = new Empresa();
        emp.nome = "JBS";
        emp.cnpj = "787878787";
        emp.dept.nome = "Vendas";
        emp.dept.nFuncionario = 115;
        
        
        
        
        
        
    }
}
