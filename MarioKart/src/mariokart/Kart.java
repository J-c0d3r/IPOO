package mariokart;

public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    public Kart() {
        motor = new Motor();
    }

    public void pular() {
        System.out.println("P U L O S U P R E M O!");
    }

    public void soltarTurbo() {
        System.out.println("TUUUUUUUUUUUUURBO 3000!");
    }

    public void fazerDrift() {
        System.out.println("Drift King, Yes baby! TANKIU!");
    }

}
