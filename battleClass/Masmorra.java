package battleClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import gameClasses.Item;
import gameClasses.Player;
import static battleClass.CampoDeBatalha.*;

public class Masmorra{
    
    //atrib
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;
    
    
    //GET
    public BauDeTesouros getTesouros() {
        return tesouros;
    }


    //CONSTRUCTOR
    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros){
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    
    //ABRIR PORTA MONSTRO
    public void abrirPortaMonstro(Player jogador){
        batalharContraMonstro(monstros.get(0),jogador);      
    }

    //ABRIR PORTA ITEM                  //consigo fazer isso bem mais simples sem usar o listarItens!!
    public void abrirPortaItem(Player jogador){
        List<Item> LocalItens = new ArrayList<>();
        BauDeTesouros LocalBau = new BauDeTesouros(LocalItens, 2);
        Random two = new Random();
        int c = tesouros.getItens().size() + 1;
        int cont =0;
        while(cont != 2){
            int p = two.nextInt(tesouros.getItens().size());

            if (c != p ){
                LocalBau.adicionarItem(tesouros.getItens().get(p));            
                c = p;
                cont++;
            }
            else{
                continue;
            }
        }
        LocalBau.listarItens();
        //agora o jogador deve escolher um desses 2 itens
        //depois usar o método acessarItem para pegar esse item do bau adicionar no inventario do jogador
    }
    
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}