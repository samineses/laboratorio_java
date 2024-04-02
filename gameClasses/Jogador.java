package gameClasses;

public class Jogador {

    //atributos:nome, nivel, raça, classe, itens equipados, e outros
    private String nome;
    private String raca;
    private String classe;
    private String itemElmo;
    private String itemCalca;
    private String itemBelly;
    private String itemRarm;
    private String itemLarm;
    private String itemBoot;
    private String itemCape;
    private int level;
    private String rightHand;
    private String leftHand;


    //metodos: getters and setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    
    public void setClasse(String classe){
        this.classe = classe;
    }
    public String getClasse(){
        return classe;
    }
    
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
    
    public void setElmo(String itemElmo){
        this.itemElmo = itemElmo;
    }
    public String getElmo(){
        return itemElmo;
    }
    
    public void setCalca(String itemCalca){
        this.itemCalca = itemCalca;   
    }
    public String getCalca(){
        return itemCalca;
    }
    
    public void setBelly(String itemBelly){
        this.itemBelly = itemBelly;
    }
    public String getBelly(){
        return itemBelly;
    }
    
    public void setRarm(String itemRarm){
        this.itemRarm = itemRarm;
    }
    public String getRarm(){
        return itemRarm;
    }
    
    public void setLarm(String itemLarm){
        this.itemLarm = itemLarm;
    }
    public String getLarm(){
        return itemLarm;
    }
    
    public void setBoot(String itemBoot){
        this.itemBoot = itemBoot;
    }
    public String getBoot(){
        return itemBoot;
    }
    
    public void setCape(String itemCape){
        this.itemCape = itemCape;
    }
    public String getCape(){
        return itemCape;
    }
    

    public String getRightHand() {
        return rightHand;
    }
    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }
    public String getLeftHand() {
        return leftHand;
    }
    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }
    
    
    //metodo de impressao toString
    public String toString() {
        
        return  "Nome do jogador = " + nome + "\n" +
                "Raça do jogador = " + raca + "\n" +
                "Nível do jogador = " + level + "\n" +
                "Classe do jogador = " + classe + "\n" +
                "Itens Equipados = [" + itemElmo + ", " + itemBelly + ", " + itemBoot + ", " 
                + itemCalca + ", " + itemLarm+ ", " + itemRarm+ ", " + itemCape + "]" + "\n" +
                "Itens nas mãos = [ mão direita: " + rightHand + ", mão esquerda: " + leftHand + " ]";

    }

    //metodo booleano possuiMaoVazia
    public boolean possuiMaoVazia(){
        if (rightHand == null || leftHand == null){
            System.out.println("-possui uma das mãos livres-");
        }
        return true;
    }
}