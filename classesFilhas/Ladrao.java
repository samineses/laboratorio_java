package classesFilhas;

import gameClasses.Classe;
import gameClasses.Item;

    
public class Ladrao extends Classe{
    
    private String itemCorpo;
    
    public Ladrao(String DESCRICAO, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe){
        super(DESCRICAO, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    
    
    //metodos get e set
    public String getItemCorpo() {
        return itemCorpo;
    }
    public void setItemCorpo(String itemCorpo) {
        this.itemCorpo = itemCorpo;
    }
    
    
    // impressao
    public String toString() {
        String local;

        local =   "                   " + "--" +  getDESCRICAO() + "--"  + "\n"
                + "             [Mão direita  = " + getItemMaoDireita()  + "      ]\n"
                + "             [Mão esquerda = " + getItemMaoEsquerda() + "      ]\n"
                + "             [Pé           = " + getItemPe()          + "      ]\n"
                + "             [Cabeça       = {" + itemCorpo+"}                 ]";

        return local;
    }


}

