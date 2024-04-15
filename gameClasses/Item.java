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
    private List<Classe> classesCompativeis;    //set
    private List<Race> racasCompativeis;        //set
    
    
    //CONSTRUCTOR
    public Item(String NAME, TipoItem tipo, int bonusPower, int valor, boolean itemGrande){
        this.NAME = NAME;
        this.tipo = tipo;
        this.bonusPower = bonusPower;
        this.valor = valor;
        this.itemGrande = itemGrande;
    }
    
    //GETTERS and SETTERS
    public void setClassesCompativeis(List<Classe> classesCompativeis) {
        this.classesCompativeis = classesCompativeis;
    }

    public void setRacasCompativeis(List<Race> racasCompativeis) {
        this.racasCompativeis = racasCompativeis;
    }
    
    
    
    public String getNAME() {
        return NAME;
    }
    public int getBonusPower() {
        return bonusPower;
    }
    public int getValor(){
        return valor;
    }

    //metodo de impressao
    public String toString() {
        
        String local;

        local = NAME                      + " : " +
                "Tipo = "  + tipo         + " : " +
                "Poder = " + bonusPower   + " : " +
                "Valor = " + valor        + "" ;
                //itemGrande   + " : " +
                //classesCompativeis + ":  " +
                //racasCompativeis + "\n";
                       
        return local;
    }

}