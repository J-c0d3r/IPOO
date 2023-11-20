package aula12_arquivo;

import Controle.Computador;
import Controle.Livro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Aula12_Arquivo {

    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.autor = "Lucas Arts";
        l1.numPaginas = 400;
        l1.titulo = "Star Wars";

        Computador c1 = new Computador();
        c1.marca = "Razer";
        c1.memoria = 500;
        c1.ram = 8;

        //Escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("arquivo1.txt", false);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            linhaEscrever = "minha primeira linha";
            bw.write(linhaEscrever);
            bw.newLine();
            bw.write("\nteste");
            bw.newLine();

            bw.write("-----------Livro----------------\n");
            bw.write(l1.autor + "\n");
            bw.write(l1.numPaginas + "\n");
            bw.write(l1.titulo + "\n");

            bw.write("-----------Computador-----------\n");
            bw.write(c1.marca + "\n");
            bw.write(c1.memoria + "\n");
            bw.write(c1.ram + "\n");

        } catch (Exception e) {
            System.out.println("Erro na entrada: " + e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        Livro[] livros = new Livro[5];

        //Ler o arquivo
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer = null;

        try {
            is = new FileInputStream("arquivo1.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            int i = 0;
            linhaLer = br.readLine();
            while (linhaLer != null) {

                if (linhaLer.contains("Livro")) {
                    Livro aux = new Livro();
                    aux.autor = br.readLine();
                    aux.numPaginas = Integer.parseInt(br.readLine());
                    aux.titulo = br.readLine();
                    livros[i] = aux;
                    i++;
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

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println("Autor: " + livros[i].autor);
                System.out.println("Titulo: " + livros[i].titulo);
                System.out.println("Nº de Páginas: " + livros[i].numPaginas);                
            }
        }

    }

}
