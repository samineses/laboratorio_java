package gameClasses;

public class Guerreiro extends Jogador{
    
    public Guerreiro(String nome_, String raca_, String classe_ ,String itemElmo_, String itemCalca_ ,
        String itemBelly_, String itemRarm_, String itemLarm_, String itemBoot_, String itemCape_, int level_,
        String rightHand_, String leftHand_) {
        super ( nome_, raca_, classe_, itemElmo_, itemCalca_, itemBelly_, itemRarm_, itemLarm_, itemBoot_,
        itemCape_, level_, rightHand_);
    }
    private String itemCorpo;
    private String intemCabeca;
    
    
    //metodos getters and setters
    public String getItemCorpo() {
        return itemCorpo;
    }
    public void setItemCorpo(String itemCorpo) {
        this.itemCorpo = itemCorpo;
    }
    public String getIntemCabeca() {
        return intemCabeca;
    }
    public void setIntemCabeca(String intemCabeca) {
        this.intemCabeca = intemCabeca;
    }
}
