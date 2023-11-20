/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmania;

import java.util.Scanner;

/**
 *
 * @author PICHAU
 */
public class PcMania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c = new Cliente();
        c.nome = "Uttoni";
        c.cpf = 123456789;
        
        //PC1 =============================================
        MemoriaUSB musb1 = new MemoriaUSB();
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;
        
        Computador pc1 = new Computador();
        pc1.marca = "Positivo";
        pc1.preco = 1300;
        pc1.so.nome = "Linux Ubuntu";
        pc1.so.tipo = 32;
        pc1.hb[0] = new HardwareBasico();
        pc1.hb[0].nome = "Pentium Core i3";
        pc1.hb[0].capacidade = 1200;
        pc1.hb[1] = new HardwareBasico();
        pc1.hb[1].nome = "RAM";
        pc1.hb[1].capacidade = 4;
        pc1.hb[2] = new HardwareBasico();
        pc1.hb[2].nome = "HD";
        pc1.hb[2].capacidade = 0.5f;
        pc1.addMemoriaUSB(musb1);
        
        //PC2 ======================================
        MemoriaUSB musb2 = new MemoriaUSB();
        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;
        
        Computador pc2 = new Computador();
        pc2.marca = "Acer";
        pc2.preco = 1800;
        pc2.so.nome = "Windows 8";
        pc2.so.tipo = 64;
        pc2.hb[0] = new HardwareBasico();
        pc2.hb[0].nome = "Pentium Core i5";
        pc2.hb[0].capacidade = 2260;
        pc2.hb[1] = new HardwareBasico();
        pc2.hb[1].nome = "RAM";
        pc2.hb[1].capacidade = 8;
        pc2.hb[2] = new HardwareBasico();
        pc2.hb[2].nome = "HD";
        pc2.hb[2].capacidade = 1;
        pc2.addMemoriaUSB(musb2);
        
        
        //PC3 =================================================
        MemoriaUSB musb3 = new MemoriaUSB();
        musb3.nome = "HD Externo";
        musb3.capacidade = 1000;
        
        Computador pc3 = new Computador();
        pc3.marca = "Vaio";
        pc3.preco = 2800;
        pc3.so.nome = "Windows 8";
        pc3.so.tipo = 64;
        pc3.hb[0] = new HardwareBasico();
        pc3.hb[0].nome = "Pentium Core i7";
        pc3.hb[0].capacidade = 3500;
        pc3.hb[1] = new HardwareBasico();
        pc3.hb[1].nome = "RAM";
        pc3.hb[1].capacidade = 16;
        pc3.hb[2] = new HardwareBasico();
        pc3.hb[2].nome = "HD";
        pc3.hb[2].capacidade = 2;
        pc3.addMemoriaUSB(musb3);
        
        Scanner sc = new Scanner(System.in);
        
        int op = -1;
        while(op != 0){
            System.out.println("PROMOÇÕES");
            System.out.println("Promoção 1 - [1]");
            System.out.println("Promoção 2 - [2]");
            System.out.println("Promoção 3 - [3]");
            System.out.println("Sair - [0]");
    
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    for (int i = 0; i < c.pcs.length; i++) {
                        if(c.pcs[i] == null){
                            c.pcs[i] = pc1;
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < c.pcs.length; i++) {
                        if(c.pcs[i] == null){
                            c.pcs[i] = pc2;
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < c.pcs.length; i++) {
                        if(c.pcs[i] == null){
                            c.pcs[i] = pc3;
                            break;
                        }
                    }
                    break;
            }
        }
        
        System.out.println("");
        System.out.println("CLIENTE ----------");
        System.out.println("Nome: " + c.nome);
        System.out.println("CPF: " + c.cpf);
        
        for (int i = 0; i < c.pcs.length; i++) {
            if(c.pcs[i] != null){
                c.pcs[i].mostraPCConfigs();
            }
        }
        
        System.out.println("");
        System.out.println("Total da Compra: " + c.calculaTotalCompra());    
    }
    
}
