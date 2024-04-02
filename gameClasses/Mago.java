package gameClasses;

public class Mago extends Jogador {
    public Mago(String nome, String raca, String classe ,String itemElmo, String itemCalca ,
        String itemBelly, String itemRarm, String itemLarm, String itemBoot, String itemCape, int level,
        String rightHand, String leftHand) {
        super (nome, raca, classe, itemElmo, itemCalca, itemBelly, itemRarm, itemLarm, itemBoot,
        itemCape, level, rightHand, leftHand) ;
    }
    
    private String intemCabeca;

    //metodos get e set
    public String getIntemCabeca() {
        return intemCabeca;
    }

    public void setIntemCabeca(String intemCabeca) {
        this.intemCabeca = intemCabeca;
    }
}
