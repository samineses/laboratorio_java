package gameClasses;
import java.util.List;
//import java.util.ArrayList;

public class Inventario {

    private List<Item> itens;
    private int limiteDeItens;
    
    
    //CONSTRUCTOR ( Inventário )
    public Inventario(List<Item> itens , int limiteDeItens){
        
        this.itens = itens;
        this.limiteDeItens = limiteDeItens;
    }
    
    //GETTERS and SETTERS
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    public void setlimiteDeItens(int limiteDeItens) {
        this.limiteDeItens = limiteDeItens;
    }
    
    
    //ADICIONAR ITEM
    public boolean adicionarItem(Item item){
        itens.add(item);
        return true;
    }
   
    //Remover Item
    /*public void removerItem(Item itemx){
        for (int i=0; i<inventario.size();i++){
            Item p = inventario.get(i);
            if(p.equals(itemx)){
                inventario.remove(p);
                break;
            }
        }
    }*/


    //Acessar Item
    /*public Item acessarItem(Item itemx){
        for (int i=0; i<inventario.size(); i++){
            Item p = inventario.get(i);
            if (p.equals(itemx)){
                break;
            }
        }
        return itemx;
    }*/



    //Listar Inventario
    /*public void listarInventario(){
        for (int i=0; i<inventario.size(); i++){
            System.out.println(inventario.get(i));
        }
    }*/
    
    
    //impressao 
    public String toString() {
        
        String local;
    
        local = "\n-Limite de Itens: " + limiteDeItens + "\n" +
                "\n " + itens;
        
        return  local;
    }
        
}
