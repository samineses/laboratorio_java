package classesFilhas;
import gameClasses.Classe;
import gameClasses.Item;

public class Mago{

    private String itemCabeca;
    

    public Mago(String DESCRICAO) {
        ;
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
                + "             [Cabeça       = {"+ itemCabeca +"}                ]";

        return local;
    }

}
