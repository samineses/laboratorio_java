/*
 * Método para adicionar uma suspensao só para
 * adicionar a experiencia do jogador
 * 
 */

package gameMain;
import java.lang.Thread;


public class Delay {

    public static void delay(){
        for (int i=0; i<12; i++){
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
            System.out.print("-");
        }
        System.out.println("---------------------------");
    }
}
