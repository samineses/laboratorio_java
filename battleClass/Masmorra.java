package battleClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import gameClasses.Item;
import gameClasses.Player;
import static battleClass.CampoDeBatalha.*;

public class Masmorra{
    
    //ATRIBUTOS
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
        
        List<Item> listaVazia = new ArrayList<>();
        BauDeTesouros LocalBau = new BauDeTesouros(listaVazia, 2);
        for (int i=0; i<2;i++){
            LocalBau.adicionarItem(tesouros.pegarItensAleatorios(2).get(i));
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