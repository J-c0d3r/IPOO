/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author PICHAU
 */
public class AulaPoo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARRAYLIST - COLEÇÕES
        Cao c1 = new Cao();
        c1.nome = "Luna";
        c1.raca = "Fox Paulista";
        c1.idade = 3;
        c1.peso = 9.5f;
        
        ArrayList listaTudo = new ArrayList();
        listaTudo.add(3);
        listaTudo.add(3.1415);
        listaTudo.add("Uttoni");
        listaTudo.add(true);
        listaTudo.add(c1);
        
        for (int i = 0; i < listaTudo.size(); i++) {
            System.out.println(listaTudo.get(i));
        }
        
        Cao c2 = new Cao();
        c2.nome = "Sheik";
        c2.raca = "Vira-lata";
        c2.idade = 13;
        c2.peso = 8;
        
        Cao c3 = new Cao();
        c3.nome = "Estrelinha";
        c3.raca = "Vira-lata";
        c3.idade = 4;
        c3.peso = 5.6f;
        
        System.out.println("");
        List<Cao> listaCaes = new ArrayList();
        listaCaes.add(c1);
        listaCaes.add(c2);
        listaCaes.add(c3);
        System.out.println("ORDEM DE INSERÇÃO");
        for (int i = 0; i < listaCaes.size(); i++) {
            System.out.println("Nome: " + listaCaes.get(i).nome);
            System.out.println("Raça: " + listaCaes.get(i).raca);
            System.out.println("Idade: " + listaCaes.get(i).idade);
            System.out.println("Peso: " + listaCaes.get(i).peso);
            System.out.println("--------------------------------");
        }
        
        Collections.sort(listaCaes);
        
        System.out.println("");
        System.out.println("ORDENA");
        for (int i = 0; i < listaCaes.size(); i++) {
            System.out.println("Nome: " + listaCaes.get(i).nome);
            System.out.println("Raça: " + listaCaes.get(i).raca);
            System.out.println("Idade: " + listaCaes.get(i).idade);
            System.out.println("Peso: " + listaCaes.get(i).peso);
            System.out.println("--------------------------------");
        }
        
        
        Collections.reverse(listaCaes);
        
        System.out.println("");
        System.out.println("REVERTE A ORDEM");
        for (int i = 0; i < listaCaes.size(); i++) {
            System.out.println("Nome: " + listaCaes.get(i).nome);
            System.out.println("Raça: " + listaCaes.get(i).raca);
            System.out.println("Idade: " + listaCaes.get(i).idade);
            System.out.println("Peso: " + listaCaes.get(i).peso);
            System.out.println("--------------------------------");
        }
        
        Cao cMax = Collections.max(listaCaes);
        System.out.println("");
        System.out.println("VALOR MAXIMO");
        System.out.println("Nome: " + cMax.nome);
        System.out.println("Raça: " + cMax.raca);
        System.out.println("Idade: " + cMax.idade);
        System.out.println("Peso: " + cMax.peso);
        
        Cao cMin = Collections.min(listaCaes);
        System.out.println("");
        System.out.println("VALOR MINIMO");
        System.out.println("Nome: " + cMin.nome);
        System.out.println("Raça: " + cMin.raca);
        System.out.println("Idade: " + cMin.idade);
        System.out.println("Peso: " + cMin.peso);
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("HASH SET");
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(5);
        hs.add(3);
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);
        listaCaes.remove(0);
        for (int i = 0; i < listaCaes.size(); i++) {
            System.out.println("Nome: " + listaCaes.get(i).nome);
            System.out.println("Raça: " + listaCaes.get(i).raca);
            System.out.println("Idade: " + listaCaes.get(i).idade);
            System.out.println("Peso: " + listaCaes.get(i).peso);
            System.out.println("--------------------------------");
        }
        
        
        
        Map<Integer, String> hm = new HashMap();
        hm.put(55, "Brasil");
        hm.put(7, "Rússia");
        hm.put(57, "Colômbia");
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());        
        
    }
    
}
