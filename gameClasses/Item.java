package gameClasses;

//import java.util.ArrayList;
import java.util.List;


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
    public Item(String NAME, TipoItem tipo, int bonusPower, int valor, boolean itemGrande, List<Classe> classesCompativeis, List<Race> racasCompativeis){
        this.NAME = NAME;
        this.tipo = tipo;
        this.bonusPower = bonusPower;
        this.valor = valor;
        this.itemGrande = itemGrande;
        this.classesCompativeis = classesCompativeis;
        this.racasCompativeis = racasCompativeis;
    }
    
    //GETTERS and SETTERS
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

        local = "  "  + NAME + "   : "    +
                ""  + tipo   + "  :     " +
                bonusPower   + "  :   "   +
                valor        + "  :   "   +
                itemGrande   + "       :      "   +
                classesCompativeis + ":  " +
                racasCompativeis + "\n";
                       
        return local;
    }

}