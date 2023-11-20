package loja_roupa_av3;

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

    public void addRoupa(PedidoRoupa p) {
        try {
            os = new FileOutputStream("todas_roupas.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("------------------Roupa---------------------\n");
            bw.write(p.getNomeRoupa() + "\n");
            bw.write(p.getTecido() + "\n");
            bw.write(p.getQntd() + "\n");

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

    public ArrayList<PedidoRoupa> buscarRoupa() {
        String linhaLer = null;

        ArrayList<PedidoRoupa> roupa = new ArrayList();

        try {
            is = new FileInputStream("todas_roupas.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("Roupa")) {
                    PedidoRoupa aux = new PedidoRoupa();
                    aux.setNomeRoupa(br.readLine());
                    aux.setTecido(br.readLine());
                    aux.setQntd(Integer.parseInt(br.readLine()));
                    roupa.add(aux);
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

        return roupa;
    }

    public void ordenarRoupa() {

        ArrayList<PedidoRoupa> roupa = buscarRoupa();

        Collections.sort(roupa);
        Collections.reverse(roupa);

        try {

            os = new FileOutputStream("todas_roupas.txt", false);

            for (int i = 0; i < roupa.size(); i++) {
                addRoupa(roupa.get(i));
            }

        } catch (FileNotFoundException ex) {

        }

    }

}
