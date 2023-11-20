package pcmania;

public class Computador {

    String marca;
    float preco;
    SistemaOperacional SO;
    HardwareBasico[] hardwares = new HardwareBasico[3];
    MemoriaUSB memoria;

    public Computador() {

        SO = new SistemaOperacional();

        hardwares[0] = new HardwareBasico();
        hardwares[1] = new HardwareBasico();
        hardwares[2] = new HardwareBasico();

    }

    public void mostraPCConfigs() {

        System.out.println(
                "Marca: " + marca
                + "\nPreço: R$" + preco);

        for (HardwareBasico hardware1 : hardwares) {
            if (hardware1.nome != null) {
                System.out.println(hardware1.nome + " " + hardware1.capacidade);
            }
        }

        System.out.println(
                "Sistema Operacional: " + SO.nome + " " + SO.tipo + " bits"
                + "\nAcompanha " + memoria.nome + " de " + memoria.capacidade + " Gb");

    }

    public void addMemoriaUSB(MemoriaUSB musb) {

        memoria = musb;

    }

}
