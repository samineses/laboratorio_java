/*
 * 
 * tesouros (set!)
 * 
 * 
 * 
 */
package battleClass;
import java.util.List;
import gameClasses.Item;

public class Monstro {

    //ATRIBUTOS
    private final String NAME;
    private int poder;    
    private int niveisPerdidos; //nivel que será perdido pelo player ao perder batalha com monstro
    private List<Item> tesouros;    
    
    //CONSTRUCTOR
    public Monstro(String NAME, int poder, int niveisPerdidos){
        this.NAME = NAME;
        this.poder = poder;
        this.niveisPerdidos = niveisPerdidos;
        
    }
    
    //GET and SET
    public int getPoder() {
        return poder;
    }
    public void setTesouros(List<Item> tesouros) {
        this.tesouros = tesouros;
    }
    public List<Item> getTesouros() {
        return tesouros;
    }
    

    //metodo de impressao
    public String toString() {
            
        return  "Descrição do monstro = " + NAME + "\n" +
                "Poder do monstro = " + poder + "\n" +
                "Descrição do itens que dropa = " + tesouros + 
                "niveis perdidos = " + niveisPerdidos ;
                
                
    }



}