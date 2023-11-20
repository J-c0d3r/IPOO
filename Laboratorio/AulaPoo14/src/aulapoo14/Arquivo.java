/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class Arquivo {
    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;
    
    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    public void addSorvete(Sorvete s){
        try{
            os  = new FileOutputStream("arquivo1.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            
            bw.write("------------------SORVETE---------------------\n");
            bw.write(s.sabor + "\n");
            bw.write(s.cobertura + "\n");
            bw.write(s.castanha + "\n");
            bw.write(s.preco + "\n");
        }catch(Exception e){
            System.out.println("Erro na entrada: " + e);
        }
        finally{
            try{
                bw.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public ArrayList<Sorvete> buscarSorvetes(){
        String linhaLer = null;
        
        ArrayList<Sorvete> sorvetes = new ArrayList();
        
        try{
            is  = new FileInputStream("arquivo1.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("SORVETE")){
                    Sorvete aux = new Sorvete();
                    aux.sabor = br.readLine();
                    aux.cobertura = br.readLine();
                    aux.castanha = Boolean.parseBoolean(br.readLine());
                    aux.preco = Integer.parseInt(br.readLine());
                    sorvetes.add(aux);
                }
                
                linhaLer = br.readLine();
            }            
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        return sorvetes;
    }
}
