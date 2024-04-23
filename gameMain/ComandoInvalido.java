/*
 * Método para reconhecer caso o usuario digite algo fora do esperado
 */

package gameMain;
import java.util.Scanner;
@SuppressWarnings("resource")


public class ComandoInvalido {
    
    public static String comandoInvalido(String n, String out, String b0, String b1, String b2, String b3){
        
        Scanner inputUsuario = new Scanner(System.in);
        
        while(true){
            System.out.print("\nJogador digita: ");
            n = inputUsuario.next();                        
            
            if(n.intern()==b0 || n.intern()==b1 || n.intern()==b2 || n.intern()==b3){
                break;
            }else{
                String s0 = "\n---------------------------------------" +
                            "\nComando inválido, digite novamente:\n"   ;
                
                System.out.println(s0+out);
                continue;
            }
        }    
        return n;
    }
    
}
