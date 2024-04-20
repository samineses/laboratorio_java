package battleClass;
import gameClasses.Player;
import java.util.Random;
import static gameMain.Printx.*;


public class CampoDeBatalha {
    
    //MÉTODO ESTÁTICO BATALHAR CONTRA MONSTRO

    public static Resultado batalharContraMonstro(Monstro monstro, Player player){
        
        if(player.playerPower()>=monstro.getPoder()){
            print("Seu poder é maior que o do monstro  - Você Venceu!");
            for (int i=0; i<monstro.getTesouros().size(); i++){
                player.getInventory().adicionarItem(monstro.getTesouros().get(i));
            }
            return Resultado.VITORIA;
        }
        if(player.playerPower()<monstro.getPoder()){
            String s = "Seu poder é menor que o do monstro!"+
                        player.getNAME() + " lança um dado" ;
            print(s);
            
            Random dado = new Random();
            int p = dado.nextInt(6)+1;
            if (p == 5 || p==6){
                print("dado = "+ p +" , but could scape");
                print("You run away");
                return Resultado.FUGA;
            }

        }
        else{
            //try to escape
            
            

            
            
            
            
            else{
                print("dado = "+ p +" , but could not scape");                
                print("YOU LOSE");
                //perde o numero de niveis definidos pelo monstro
                //preciso salvar valores numa variavel global
                return Resultado.DERROTA;
            }
        }
    }
}
