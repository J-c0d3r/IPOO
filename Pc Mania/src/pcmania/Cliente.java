/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmania;

/**
 *
 * @author PICHAU
 */
public class Cliente {
    public String nome;
    public long cpf;
    Computador[] pcs = new Computador[10];
    
    public float calculaTotalCompra(){
        
        float total = 0;
        
        for (int i = 0; i < pcs.length; i++) {
            if(pcs[i] != null){
                total += pcs[i].preco;
            }
        }
        
        return total;
    }
}
