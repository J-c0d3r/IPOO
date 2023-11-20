package alvorada_av3_antiga;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Arquivo {

    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    public void addProduto(Produto p) {
        try {
            os = new FileOutputStream("todos_produtos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("------------------Produto---------------------\n");
            bw.write(p.getNome() + "\n");
            bw.write(p.getMarca() + "\n");
            bw.write(p.getTipo() + "\n");
            bw.write(p.getPreco() + "\n");

        } catch (Exception e) {
            System.out.println("Erro na entrada: " + e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public ArrayList<Produto> buscarProduto() {
        String linhaLer = null;

        ArrayList<Produto> produtos = new ArrayList();

        try {
            is = new FileInputStream("todos_produtos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("Produto")) {
                    Produto aux = new Produto();
                    aux.setNome(br.readLine());
                    aux.setMarca(br.readLine());
                    aux.setTipo(br.readLine());
                    aux.setPreco(Float.parseFloat(br.readLine()));
                    produtos.add(aux);
                }

                linhaLer = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return produtos;
    }

    public void ordenarProdutos() {

        ArrayList<Produto> produtos = buscarProduto();

        Collections.sort(produtos);

        try {

            os = new FileOutputStream("todos_produtos.txt", false);

            for (int i = 0; i < produtos.size(); i++) {
                addProduto(produtos.get(i));
            }

        } catch (FileNotFoundException ex) {

        }

    }

}
