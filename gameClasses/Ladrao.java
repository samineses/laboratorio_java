package gameClasses;

public class Ladrao {
    public Ladrao(String nome, String raca, String classe ,String itemElmo, String itemCalca ,
        String itemBelly, String itemRarm, String itemLarm, String itemBoot, String itemCape, int level,
        String rightHand, String leftHand) {
        super(nome, raca, classe, itemElmo, itemCalca, itemBelly, itemRarm, itemLarm, itemBoot,
        itemCape, level, rightHand, leftHand);
    }
    private String itemCorpo;
    
    //metodos get e set
    public String getItemCorpo() {
        return itemCorpo;
    }
    public void setItemCorpo(String itemCorpo) {
        this.itemCorpo = itemCorpo;
    }


}

