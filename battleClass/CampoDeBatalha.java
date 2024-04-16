package battleClass;
import gameClasses.Player;
import java.util.Random;


public class CampoDeBatalha {
    
    public static Resultado batalharContraMonstro(Monstro monstro, Player player){
        if(player.playerPower()>monstro.getPoder()){
            System.out.println("WIN");
            for (int i=0; i<monstro.getTesouros().size(); i++){
                player.getInventory().adicionarItem(monstro.getTesouros().get(i));
            }
            return Resultado.VITORIA;
        }
        else{
            //try to escape
            System.out.println("LOSE");
            Random dado = new Random();
            int p = dado.nextInt(6)+1;
            if (p == 5 || p==6){
                System.out.println("dado = "+ p +" , but could scape");
                return Resultado.FUGA;
            }
            else{
                System.out.println("SE FUDEU");
                //perde o numero de niveis definidos pelo monstro
                //preciso salvar valores numa variavel global
                return Resultado.DERROTA;
            }
        }
    }
}
