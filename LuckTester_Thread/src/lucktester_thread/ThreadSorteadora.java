package lucktester_thread;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadSorteadora extends Thread{
    
    int num;
    JFrame niquel;
    JLabel label;
    
    public void run(){
        
        Random r = new Random();
        
        num = r.nextInt(5);
        
        
        
        
        
    }
    
    
    
}
