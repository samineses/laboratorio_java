package battleClass;
import gameClasses.Player;
import java.util.Random;
import static gameMain.Printx.*;
import static gameMain.Delay.*;

public class CampoDeBatalha {
    
    //MÉTODO ESTÁTICO BATALHAR CONTRA MONSTRO

    public static Resultado batalharContraMonstro(Monstro monstro, Player player){
        
        print("\n< "+ player.getNAME()+ " batalha contra "+ monstro.getNAME()+ " >\n");

        if(player.playerPower() >= monstro.getPoder()){
            
            String s =  "Seu poder ( " +player.playerPower()+ " ) é maior que o do monstro ("+
                        monstro.getPoder()+" )"+
                        "\nParabéns, você venceu!"+
                        "Os seguintes itens serão adicionados ao seu invetorio:\n";
            print(s);
            for (int i=0; i<monstro.getTesouros().size(); i++){
                player.getInventory().adicionarItem(monstro.getTesouros().get(i));
                print("° "+monstro.getTesouros().get(i).getNAME());
            }
            return Resultado.VITORIA;
        }        
                    
        Random dado = new Random();
        int p = dado.nextInt(6)+1;

        String s1 = "Seu poder ( "+player.playerPower()             +
                    " ) é menor que o do monstro ("                   +   
                    monstro.getPoder()+" ) !\n"                        +
                    "\nUm dado será lançado, caso dê 5 ou 6,"       +
                    "\nvocê poderá escapar do monstro"                ;
        String s2 = "\n< "+player.getNAME() + " lança um dado >\n"  +
                    "\nResultado do dado = "+ p                     ;
        
        print(s1);
        delay();        
        print(s2);
        

        if (p == 5 || p==6){
            String s3 = "Parabéns, você conseguiu escapar\n"                            +
                        "\n---------------------------------------"                   +
                        "\n< "+player.getNAME()+ " escapa do "+ monstro.getNAME()+" >"  ;
            print("\n"+s3);
            return Resultado.FUGA;
        
        }else{
            String s3 = "\nVocê não conseguiu escapar" +                
                        "\n---------------------------------------\n"                   +
                        "\n< "+player.getNAME() +" perde "+ monstro.getNiveisPerdidos()+ " niveis>";

            print(s3);
            player.setLevel(player.getLevel()-monstro.getNiveisPerdidos());
            System.out.println("\nNível atual = "+player.getLevel());

            return Resultado.DERROTA;
        }
    }
}
