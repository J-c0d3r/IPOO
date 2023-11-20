package fabricaderobos;

import java.util.Date;

public class Robo {

    private static long serialNumberGenerator;

    private long serialNumber;
    private Date dataCriacao;

    Processador process;
    Corpo corpo;

    Robo(boolean temProcessador) {

        corpo = new Corpo();

        if (temProcessador == true) {
            process = new Processador();
        } else {
            System.out.println("O robo " + serialNumber + " não tem processador!");
        }

        dataCriacao = new Date();

        serialNumberGenerator++;

        serialNumber = serialNumberGenerator;
    }

    public void mostraConfigRobo() {

        System.out.println("SERIAL: " + serialNumber);
        System.out.println("DATA CRIACAO: " + dataCriacao);
        System.out.println("TIPO CORPO: " + corpo.getTipo());
        System.out.println("COR CORPO: " + corpo.getCor());

        if (process != null) {
            System.out.println("MARCA PROCESSADOR: " + process.getMarca());
            System.out.println("FREQ. PROCESSADOR: " + process.getFrequenciaProcessamento());
        }
        System.out.println("\n");

    }

}
