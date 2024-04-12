package battleClass;
import java.util.List;
import gameClasses.Monstro;

public class Masmorra{
    
    //atrib
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;
    
    //const
    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros){
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    
    //criei só pra utilizar essa classe por enquanto
    public String toString(String name){
        

        return  "monstros = [" + monstros + "]" +
                "tesouros = [" + tesouros + "]" ;        
    }
    
}