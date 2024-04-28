package gameClasses;

import java.util.List;
@SuppressWarnings("unused")


public class Item {

    //atributos:
    private final String NAME;
    private TipoItem tipo;     
    private int bonusPower;
    private int valor;
    private boolean itemGrande;
    
    private List<Classe> classesCompativeis;   
    private List<Race> racasCompativeis;       
    
    
    //CONSTRUCTOR
    public Item(String NAME, TipoItem tipo, int bonusPower, int valor){
        this.NAME = NAME;
        this.tipo = tipo;
        this.bonusPower = bonusPower;
        this.valor = valor;
    }
    
    /*
    *  SOBRECARGA NO CONSTRUCTOR
    * para a necessidade de usar um item nulo 
    */
    public Item(){
        NAME = null;
        tipo = null;
        bonusPower = 0;
        valor = 0;
        itemGrande = false;
        classesCompativeis = null;
        racasCompativeis = null;
    }
    
    
    
    //GETTERS and SETTERS
    public boolean getItemGrande(){
        return itemGrande;
    }
    public void setItemGrande(boolean itemGrande) {
        this.itemGrande = itemGrande;
    }
    public String getNAME() {
        return NAME;
    }
    public TipoItem getTipo() {
        return tipo;
    }
    public void setClassesCompativeis(List<Classe> classesCompativeis) {
        this.classesCompativeis = classesCompativeis;
    }

    public void setRacasCompativeis(List<Race> racasCompativeis) {
        this.racasCompativeis = racasCompativeis;
    }    
    public int getBonusPower() {
        return bonusPower;
    }
    public int getValor(){
        return valor;
    }

    //metodo de impressao
    public String toString() {        
        
        String local=NAME+ " | "                                            +
                    "Tipo = "  + tipo + " : "                               +
                    "Poder = " + bonusPower + " : "                         +
                    "Valor = " + valor + "\n"                               ;
                    //"Item grande = "+itemGrande   + " : "                   +
                    //"Classes compativeis = "+classesCompativeis + ":  "     +
                    //"Racas compativeis = "+racasCompativeis + "\n"          ;
                       
        return local;
    }

}