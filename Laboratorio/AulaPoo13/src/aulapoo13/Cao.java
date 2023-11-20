/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo13;

/**
 *
 * @author PICHAU
 */
public class Cao implements Comparable<Cao>{
    String nome;
    String raca;
    int idade;
    float peso;

    @Override
    public int compareTo(Cao c) {
        //retorno == 0 valores sao iguais
        /*if (raca.compareTo(c.raca) == 0){
            return nome.compareTo(c.nome);
        }
        else{
            return raca.compareTo(c.raca);
        }*/
        
        //    SE FOSSE SÓ PELA IDADE:
        return Float.compare(peso, c.peso);
        
    }
}
