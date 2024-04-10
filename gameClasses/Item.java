package gameClasses;

//import java.util.ArrayList;
import java.util.List;


public class Item {

    //atributos:

    private final String NOME;
    private int bonusPower;
    private int valor;                  // valor tipo preço?
    private String tipo;                // ??
    private boolean itemGrande;         // ??
    private List<Classe> classesCompativeis;

    //constructor Item
    public Item(String NOME, int bonusPower){
        this.NOME = NOME;
        this.bonusPower = bonusPower;
    }
    
    //getters and setters
    public String getNOME() {
        return NOME;
    }
    
    public void setBonusPower(int bonusPower) {
        this.bonusPower = bonusPower;
    }
    public int getBonusPower() {
        return bonusPower;
    }
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public List<Classe> getClassesCompativeis() {
        return classesCompativeis;
    }

    public void setClassesCompativeis(List<Classe> classesCompativeis) {
        this.classesCompativeis = classesCompativeis;
    }

    public boolean getItemGrande() {
        return itemGrande;
    }

    public void setItemGrande(boolean itemGrande) {
        this.itemGrande = itemGrande;
    }

    
    //metodo de impressao
    public String toString() {
        
        String local;

        local =  NOME + " : " + "Bonus Power = " + bonusPower
                /*+ "Tipo do item = " + tipo + "\n" +
                "Valor de venda do item = " + valor + "\n" +*/
                ;
        return local;
    }

}