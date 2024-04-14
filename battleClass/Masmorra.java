package battleClass;
import java.util.List;
import gameClasses.Player;
//import gameClasses.Inventario;
import static battleClass.CampoDeBatalha.*;

public class Masmorra{
    
    //atrib
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;
    
    //CONSTRUCTOR
    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros){
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    
    //ABRIR PORTA MONSTRO
    public void abrirPortaMonstro(Player jogador){
        batalharContraMonstro(monstros.get(0),jogador);      
    }

    //ABRIR PORTA ITEM
    public void abrirPortaItem(Player jogador){
        //BauDeTesouros.listarItens();
    }
    
    
    //IMPRESSAO
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}