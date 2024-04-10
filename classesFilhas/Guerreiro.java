package classesFilhas;
import gameClasses.Classe;
import gameClasses.Item;

public class Guerreiro extends Classe{
    
    private String itemCorpo;
    private String itemCabeca;
    
    public Guerreiro(String DESCRICAO, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe){
        super(DESCRICAO, itemMaoDireita, itemMaoEsquerda, itemPe);
    }
    
    //metodos getters and setters
    
    public String getItemCorpo() {
        return itemCorpo;
    }
    public void setItemCorpo(String itemCorpo) {
        this.itemCorpo = itemCorpo;
    }
    public String getItemCabeca() {
        return itemCabeca;
    }
    public void setItemCabeca(String intemCabeca) {
        this.itemCabeca = intemCabeca;
    }
    
       // impressao
       public String toString() {
        String local;

        local =   "                  " + "--" +  getDESCRICAO() + "--"   + "\n"
                + "             [Mão direita  = " + getItemMaoDireita()  + "      ]\n"
                + "             [Mão esquerda = " + getItemMaoEsquerda() + "      ]\n"
                + "             [Pé           = " + getItemPe()          + "      ]\n"
                + "             [Corpo        = {"+ itemCabeca +"}                   ]\n"
                + "             [Cabeça       = {"+ itemCorpo +"}               ]";


        return local;
    }

    
    
}
