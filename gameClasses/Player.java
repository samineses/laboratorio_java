package gameClasses;

//import java.util.ArrayList;
import java.util.List;

public class Player {

    //ATRIBUTOS
    private final String NAME;
    private int level;
    
    
    private Race race;
    private Classe classe;
    private Inventario inventory;
    
    private Item itemHead;    
    private Item itemBody;
    private Item itemRhand;
    private Item itemLhand;
    private Item itemFoot;
    
    //CONSTRUCTOR
    public Player (String NAME){
        this.NAME = NAME;
    }
    
    
    
    //GETs and SETs 
    public String getNAME(){
        return NAME;
    }
    public Inventario getInventory(){
        return inventory;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public void setRace(Race race) {
        this.race = race;
    }
    public void setInventario(Inventario inventory){
        this.inventory = inventory;
    }
    
    /*//GET ( Itens )
    public Item getItemHead() {
        return itemHead;
    }    
    public Item getItemBody() {
        return itemBody;
    }
    public Item getItemFoot() {
        return itemFoot;
    }
    public Item getItemRhand() {
        return itemRhand;
    }
    public Item getItemLhand() {
        return itemLhand;
    }*/
    
    //SET ( Itens )    
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
                //"\n#Inventário Abaixo:\n" + inventory      + "\n" ; 
               
        return  local;   
    }
}