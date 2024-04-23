package battleClass;
import java.util.List;
import gameClasses.Item;

public class Monstro {

    //ATRIBUTOS
    private final String NAME;
    private int poder;    
    private int niveisPerdidos;
    
    
    private List<Item> tesouros;    
    
    //CONSTRUCTOR
    public Monstro(String NAME, int poder, int niveisPerdidos){
        this.NAME = NAME;
        this.poder = poder;
        this.niveisPerdidos = niveisPerdidos;        
    }
    
    //GET and SET
    public String getNAME() {
        return NAME;
    }
    public int getPoder() {
        return poder;
    }
    public void setTesouros(List<Item> tesouros) {
        this.tesouros = tesouros;
    }
    public List<Item> getTesouros() {
        return tesouros;
    }
    public int getNiveisPerdidos() {
        return niveisPerdidos;
    }
    public void setNiveisPerdidos(int niveisPerdidos) {
        this.niveisPerdidos = niveisPerdidos;
    }
    

    //metodo de impressao
    public String toString() {
            
        return  "Descrição do monstro = " + NAME + "\n" +
                "Poder do monstro = " + poder + "\n" +
                "Descrição do itens que dropa = " + tesouros + 
                "niveis perdidos = " + niveisPerdidos ;
                
                
    }



}