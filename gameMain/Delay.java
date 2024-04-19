package gameMain;
import java.lang.Thread;


public class Delay {

    public static void delay(){
        for (int i=0; i<3; i++){
            try {
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
            System.out.print(".");
        }

    }
}
