package threadcontagem;

import java.util.logging.Level;
import java.util.logging.Logger;


//FORMA 1 - extends Thread
//FORMA 2 - implements Runnable
public class ThreadContagem extends Thread {

    int numero;

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("THREAD " + numero + ": " +i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadContagem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
