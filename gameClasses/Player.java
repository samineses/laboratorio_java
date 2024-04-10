package gameClasses;

import java.util.List;

public class Player {

    //Atributo Gerais
    private final String NAME;
    private int level;
    private Raca race;
    private Classe classe;
    private Inventario inventory;
    //Atributos Itens
    private Item itemHead;    
    private Item itemBody;
    private Item itemRhand;
    private Item itemLhand;
    private Item itemFoot;
    
    //Constructor
    public Player (String NAME){
        this.NAME = NAME;
    }
        
    //GET and SET ( NAME, level, Raca ) 
    public String getNAME() {
        return NAME;
    }    
    public int getLevel() {
        return level;
    }
    public Raca getRaca() {
        return race;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setRaca(Raca race) {
        this.race = race;
    }
    
    //GET and SET ( Classe e Inventario )        
    public Classe getClasse() {
        return classe;
    }
    public Inventario getInventario() {
        return inventory;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public void setInventario(Inventario inventory) {
        this.inventory = inventory;
    }
    
    //GET and SET ( Membros )    
    public Item getItemRhand() {
        return itemRhand;
    }
    public Item getItemLhand() {
        return itemLhand;
    }
    public Item getItemFoot() {
        return itemFoot;
    }
    public void setItemRhand(Item itemRhand) {
        this.itemRhand = itemRhand;
    }
    public void setItemLhand(Item itemLhand) {
        this.itemLhand = itemLhand;
    }
    public void setItemFoot(Item itemFoot) {
        this.itemFoot = itemFoot;
    }
        
    //GET and SET (Head and Body)    
    public Item getItemHead() {
        return itemHead;
    }
    public Item getItemBody() {
        return itemBody;
    }
    public void setItemHead(Item itemHead) {
        this.itemHead = itemHead;
    }
    public void setItemBody(Item itemBody) {
        this.itemBody = itemBody;
    }
    //////////////////////////////////////////////////////////
    
    //venderItens(itensParaVender List<Item>): boolean
    public boolean sellItems(List<Item> toSellItems ){
        
        return true ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /////////////////////////////////////////////////////////////////
    
    //PLAYER POWER
    public int playerPower(){
        int power;
        
        power = classe.getItemMaoDireita().getBonusPower()  +
                classe.getItemMaoEsquerda().getBonusPower() +
                classe.getItemPe().getBonusPower()          +
                level;

        return power;
    }
    
    //IMPRESSÃO: (toString)
    public String toString() {
        String local;
    
        local = "\nPlayer      = " +     NAME       + "\n" +
                "\nLevel       = " +     level      + "\n" +
                "\nPower       = " + playerPower()  + "\n" +
                //"\nRace        = " +     race       + "\n" +
                "\nClass       = " +     classe     + "\n" ;
                //"\nInventário Abaixo: " + inventory + "\n"; 
               
        return  local;
    
    }
}