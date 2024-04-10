package classesFilhas;
import gameClasses.Classe;
import gameClasses.Item;

public class Mago extends Classe {

    private String itemCabeca;
    

    public Mago(String DESCRICAO, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        super(DESCRICAO, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    

    // metodos get e set
    public String getItemCabeca() {
        return itemCabeca;
    }

    public void setItemCabeca(String itemCabeca) {
        this.itemCabeca = itemCabeca;
    }

    // impressao
    public String toString() {
        String local;

        local =   "                   " + "--" +  getDESCRICAO() + "--"  + "\n"
                + "             [Mão direita  = " + getItemMaoDireita()  + "      ]\n"
                + "             [Mão esquerda = " + getItemMaoEsquerda() + "      ]\n"
                + "             [Pé           = " + getItemPe()          + "      ]\n"
                + "             [Cabeça       = {"+ itemCabeca +"}                ]";

        return local;
    }

}
