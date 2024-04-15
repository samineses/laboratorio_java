package gameClasses;

//import java.util.ArrayList;
import java.util.List;

public class Player {

    //ATRIBUTOS
    private final String NAME;      //get!
    private int level;              //set
    private Race race;              //
    private Classe classe;          //
    private Inventario inventory;   //set, get
    
    private Item itemHead;      //set, get    
    private Item itemBody;      //set, get
    private Item itemRhand;     //set, get
    private Item itemLhand;     //set, get
    private Item itemFoot;      //set, get
    
    //CONSTRUCTOR
    public Player (String NAME, Race race, Classe classe){
        this.NAME = NAME;
        this.race = race;
        this.classe = classe;
    }
    
    
    
    //GETTERS and SETTERS 
    public String getNAME(){
        return NAME;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    //inventory
    public void setInventario(Inventario inventory){
        this.inventory = inventory;
    }
    public Inventario getInventory(){
        return inventory;
    }
    //itens    
    public void setItemHead(Item itemHead) {
        this.itemHead = itemHead;
    }
    public void setItemBody(Item itemBody) {
        this.itemBody = itemBody;
    }
    public void setItemFoot(Item itemFoot) {
        this.itemFoot = itemFoot;
    }
    public void setItemRhand(Item itemRhand) {
        this.itemRhand = itemRhand;
    }
    public void setItemLhand(Item itemLhand) {
        this.itemLhand = itemLhand;
    }
    public Item getItemHead() {
        return itemHead;
    }
    public Item getItemBody() {
        return itemBody;
    }
    public Item getItemRhand() {
        return itemRhand;
    }
    public Item getItemLhand() {
        return itemLhand;
    }
    public Item getItemFoot() {
        return itemFoot;
    }
    
    //VENDER ITENS
    public int xp = 0;
    public boolean venderItems(List<Item> itensParaVender ){            //e se o usuario digitar errado?
        for (int i=0; i<itensParaVender.size(); i++){
            int p = inventory.acessarItem(itensParaVender.get(i).getNAME()).getValor();
            inventory.removerItem(itensParaVender.get(i).getNAME());
            xp += p;
            if(xp>=1000){
                xp -= 1000;
                level += 1;
            }
        }
        System.out.println("xp  = " + xp);
        System.out.println("nivel do jogador = " + level);

        return true ;
    }
    
 
    //PLAYER POWER
    public int playerPower(){
        int power;
        
        power = level + 
                itemHead.getBonusPower()  + itemBody.getBonusPower() +
                itemRhand.getBonusPower() + itemLhand.getBonusPower() + 
                itemFoot.getBonusPower();

        return power;
    }

    
    //IMPRESSÃO: (toString)
    public String toString() {
        String local;
    
        local = "\nPlayer      = "        +     NAME       + "\n" +
                "\nLevel       = "        +     level      + "\n" +
                "\nPower       = " + playerPower()  + "\n" +
                "\nRace        = "        +     race       + "\n" +
                "\nClass       = "        +     classe     + "\n" ;
               
        return  local;   
    }
}