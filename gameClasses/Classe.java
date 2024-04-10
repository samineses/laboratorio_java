package gameClasses;

public class Classe {

    public final String DESCRICAO;
    private Item itemMaoDireita;
    private Item itemMaoEsquerda; 
    private Item itemPe;
    
    public Classe (String DESCRICAO,Item itemMaoDireita, Item itemMaoEsquerda,Item itemPe){
        this.DESCRICAO = DESCRICAO;
        this.itemMaoDireita = itemMaoDireita;
        this.itemMaoEsquerda = itemMaoEsquerda;
        this.itemPe = itemPe;

    }
    
    //getters and setters
    public String getDESCRICAO() {
        return DESCRICAO;
    }
    
    public void setItemMaoDireita(Item itemMaoDireita) {
        this.itemMaoDireita = itemMaoDireita;
    }
    public Item getItemMaoDireita() {
        return itemMaoDireita;
    }

    public void setItemMaoEsquerda(Item itemMaoEsquerda) {
        this.itemMaoEsquerda = itemMaoEsquerda;
    }
    public Item getItemMaoEsquerda() {
        return itemMaoEsquerda;
    }

    public void setItemPe(Item itemPe) {
        this.itemPe = itemPe;
    }
    public Item getItemPe() {
        return itemPe;
    }
    
    //impressao
    public String toString() {
        return    "                   " + "--" +  DESCRICAO + "--" + "\n"  
                + "             [mão direita  = " + itemMaoDireita  + "      ]\n"
                + "             [mão esquerda = " + itemMaoEsquerda + "      ]\n"
                + "             [pé           = " + itemPe          + "      ]"
                ;
    }
    
    //metodo possui mao vazia 
    public boolean possuiMaoVazia(){
        if (itemMaoDireita == null || itemMaoEsquerda == null){
            System.out.println("-possui uma das mãos livres-");
        }
        return true;
    }
    
}