package gameClasses;
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
    public Player (String NAME, Race race, Classe classe){
        this.NAME = NAME;
        this.race = race;
        this.classe = classe;
    }
    
    
    //GETTERS and SETTERS 
    public int getLevel() {
        return level;
    }
    public String getNAME(){
        return NAME;
    }
    public Inventario getInventory(){
        return inventory;
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
    public void setLevel(int level) {
        this.level = level;
    }
    public void setInventario(Inventario inventory){
        this.inventory = inventory;
    }
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
    public boolean venderItems(List<Item> listaItensVender ){
        for (int i=0; i<listaItensVender.size(); i++){
            int p = inventory.acessarItem(listaItensVender.get(i).getNAME()).getValor();
            inventory.removerItem(listaItensVender.get(i).getNAME());
            
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
        String local= "° Name  = " + NAME            +
                    "\n° Level = " + level           +
                    "\n° Power = " + playerPower()   +
                    "\n° Race  = " + race            +
                    "\n° Class = " + classe          ; 
               
        return  local;   
    }
}