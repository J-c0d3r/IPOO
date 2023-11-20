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
public class Computador {
    public String marca;
    public float preco;
    SistemaOperacional so = new SistemaOperacional();
    MemoriaUSB musb;
    HardwareBasico[] hb = new HardwareBasico[3];
    
    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }
    
    public void mostraPCConfigs(){
        System.out.println("");
        System.out.println("COMPUTADOR -----------------");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("SISTEMA OPERACIONAL --------");
        System.out.println("Nome: " + so.nome);
        System.out.println("Tipo: " + so.tipo);
        System.out.println("MEMORIA USB ----------------");
        System.out.println("Nome: " + musb.nome);
        System.out.println("Capacidade: " + musb.capacidade);
        System.out.println("HARDWARE BASICO ------------");
        for (int i = 0; i < hb.length; i++) {
            if(hb[i] != null){
                System.out.println("Nome: " + hb[i].nome);
                System.out.println("Capacidade: " + hb[i].capacidade);
            }
        }
    }
}
